import "../css/checks.css";
import "bootstrap/dist/css/bootstrap.min.css";
import React, { ChangeEvent, useEffect, useRef, useState } from "react";
import { getDatos, servidor } from "../services/Service";
import { Form, Row} from "react-bootstrap";

const ERROR_01 = "Error petición emplead@s, RegenerarFichajes.tsx";
const ERROR_02 = "Error petición fechas, RegenerarFichajes.tsx";
const ERROR_03 = "Error regenerando fichajes, RegenerarFichajes.tsx";
const MENSAJE_OK = "Fichajes regenerados correctamente";
const MENSAJE_KO = "No se han podido regenerar los fichajes solicitados";
const ERROR_DATOS_SELECCIONADOS = "Emplead@ o Año seleccionado son incorrectos";
const ERROR_DESCONOCIDO = "Error inesperado. Por favor, probar más adelante";

function Regenerar() {
  const urlEmpleados: string = `http://${servidor}/checks/empleados`;
  const urlRegenerarFichajes: string = `http://${servidor}/checks/regenera/`;

  const [empleados, setEmpleados] = useState([]);
  const [mensajeUsuario, setMensajeUsuario] = useState<string>("");
  const [mensajeError, setMensajeError] = useState<string>("");
  const [idEmpleadoSeleccionado, setIdEmpleadoSeleccionado] = useState<number>(0);
  const [anioSeleccionado, setAnioSeleccionado] = useState<number>(0);
  const [minAnio, setMinAnio] = useState<number>(0);
  const [maxAnio, setMaxAnio] = useState<number>(0);

  const listaEmpleadosRef = useRef<HTMLSelectElement>();
  const inputAnioRef = useRef<HTMLInputElement>();

  useEffect(() => {
    setMensajeUsuario("");
    setMensajeError("");
    const dameEmpleados = async () => {
      try {
        const response = await getDatos(urlEmpleados);
        if (response.status === 200)
          setEmpleados(response.data);
      } catch (error) {
        console.error(ERROR_01);
        setMensajeError(ERROR_DESCONOCIDO);
      }
    };
    dameEmpleados();
  }, [urlEmpleados]);

  useEffect(() => {
    setMensajeUsuario("");    
    setMensajeError("");
    const dameAnios = async () => {
      try {
        if (idEmpleadoSeleccionado > 0) {
          const response = await getDatos(`${urlEmpleados}/${idEmpleadoSeleccionado}`);
          if (response.status === 200) {
            setMinAnio(response.data.anioAlta);
            setMaxAnio(response.data.anioBaja);
          }
        }
      } catch (error) {
        console.error(ERROR_02);
        setMensajeError(ERROR_DESCONOCIDO);
      }
    };
    dameAnios();
  }, [idEmpleadoSeleccionado]);


  const cambioEmpleado = (e: ChangeEvent) => {
    setMinAnio(0);
    inputAnioRef.current!.value="0";
    setIdEmpleadoSeleccionado(Number((e.target as HTMLOptionElement).value));
    console.log("IdEmpleado -> " + (e.target as HTMLOptionElement).value);
  }

  const cambioAnio = (e: ChangeEvent) => {
    setAnioSeleccionado(Number((e.target as HTMLInputElement).value));
    console.log("AnioSeleccionado -> " + (e.target as HTMLOptionElement).value);
  }

  const regenerarFichajes = async (event: React.MouseEvent<HTMLButtonElement>) => {
    event.preventDefault();
    event.stopPropagation();
    setMensajeUsuario("");    
    setMensajeError("");
    if (idEmpleadoSeleccionado > 0 && anioSeleccionado > 0) {
      try {
        const response = await getDatos(`${urlRegenerarFichajes}${idEmpleadoSeleccionado}/${anioSeleccionado}`);
        console.log(`${urlRegenerarFichajes}${idEmpleadoSeleccionado}/${anioSeleccionado}`);
        if(response.data.length>0)
           setMensajeUsuario(MENSAJE_OK);
        else
           setMensajeError(MENSAJE_KO)
      } catch (error) {
        console.log(ERROR_03);
        setMensajeError(ERROR_DESCONOCIDO);
      }
    } else {
      setMensajeError(ERROR_DATOS_SELECCIONADOS)
    }
  }

  return (
    <div>
      <h2 className="checks-h2 text-center mt-5 mb-5">Regenerar Fichajes</h2>
      <Form className="mt-5">
        <Row className="justify-content-center my-5">
          <div className="col-4">
            <label htmlFor="empleados" className="h5">Emplead@ : </label>
            <select id="empleados" className="checks-fondo-controles  ml-3" defaultValue=""
              ref={listaEmpleadosRef as React.RefObject<HTMLSelectElement>} onChange={cambioEmpleado} required>
              <option className="checks-fondo-controles" value="" disabled key={0} >Selecciona Emplead@...</option>
              {empleados.map((emp: any) => (
                <option className="checks-fondo-controles" value={emp.idEmpleado} key={emp.idEmpleado}>
                  {emp.apellidosNombreEmpleado}
                </option>
              ))}
            </select >
          </div>
          <div className="col-3">
            <label htmlFor="anios" className="h5"> A&ntilde;o : </label>
            <input id="anios" className="checks-fondo-controles p-1  ml-3" type="number" min={minAnio} required
              max={maxAnio} onChange={cambioAnio} value={anioSeleccionado} ref={inputAnioRef as React.RefObject<HTMLInputElement>} />
          </div>
          <Row className="justify-content-center mt-5 mb-5">
            <div className="col-2">
              <button className="boton-regenerar mt-5" onClick={regenerarFichajes}>Regenerar Fichajes</button>
            </div>
          </Row>
          <h2 className="text-success mt-5 text-center">{mensajeUsuario}</h2>
          <h2 className="text-danger text-center">{mensajeError}</h2>
        </Row>
      </Form>
    </div>
  )
}

export default Regenerar;