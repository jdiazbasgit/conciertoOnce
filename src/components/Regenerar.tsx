import "../css/CalendarioLaboral.css";
import "bootstrap/dist/css/bootstrap.min.css";
import React, { ChangeEvent, useEffect, useRef, useState } from "react";
import { getDatos, servidor } from "../services/Service";

const ERROR_01 = "Error petición emplead@s, RegenerarFichajes.tsx";
const ERROR_02 = "Error petición fechas, RegenerarFichajes.tsx";
const ERROR_03 = "Error regenerando fichajes, RegenerarFichajes.tsx";
const MENSAJE_OK = "Fichajes regenerados correctamente";
const MENSAJE_KO = "Emplead@ o Año seleccionado son incorrectos";
const ERROR_DESCONOCIDO = "Error inesperado. Por favor, probar más adelante";

// redirect if user not logged 
//https://levelup.gitconnected.com/react-template-for-jwt-authentication-with-private-routes-and-redirects-f77c488bfb85

function Regenerar() {
  const urlEmpleados: string = `http://${servidor}/checks/empleados`;
  const urlRegenerarFichajes: string = `http://${servidor}/checks/regenera/`;

  const [empleados, setEmpleados] = useState([]);
  const [mensajeUsuario, setMensajeUsuario] = useState<string>("");
  const [idEmpleadoSeleccionado, setIdEmpleadoSeleccionado] = useState(0);
  const [anioSeleccionado, setAnioSeleccionado] = useState<number>(0);
  const [minAnio, setMinAnio] = useState<number>(0);
  const [maxAnio, setMaxAnio] = useState<number>(0);

  const listaEmpleadosRef = useRef<HTMLSelectElement>();
  const inputAnioRef = useRef<HTMLInputElement>();

  useEffect(() => {
    setMensajeUsuario("");
    const dameEmpleados = async () => {
      try {
        const response = await getDatos(urlEmpleados);
        if (response.status === 200)
          setEmpleados(response.data);
      } catch (error) {
        console.error(ERROR_01);
        setMensajeUsuario(ERROR_DESCONOCIDO);
      }
    };
    dameEmpleados();
  }, [urlEmpleados]);

  useEffect(() => {
    setMensajeUsuario("");
    const dameAnios = async () => {
      try {
        if (idEmpleadoSeleccionado > 0) {
          const response = await getDatos(`${urlEmpleados}/${idEmpleadoSeleccionado}`);
          if (response.status === 200){
            setMinAnio(response.data.anioAlta);
            setMaxAnio(response.data.anioBaja);
          }
        }
      } catch (error) {
        console.error(ERROR_02);
        setMensajeUsuario(ERROR_DESCONOCIDO);
      }
    };
    dameAnios();
  }, [idEmpleadoSeleccionado]);


  const cambioEmpleado = (e: ChangeEvent) => {
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
    if (idEmpleadoSeleccionado > 0 && anioSeleccionado > 0) {
      try {
        await getDatos(`${urlRegenerarFichajes}${idEmpleadoSeleccionado}/${anioSeleccionado}`);
        setMensajeUsuario(MENSAJE_OK);
      } catch (error) {
        console.log(ERROR_03);
        setMensajeUsuario(ERROR_DESCONOCIDO);
      }
    } else {
      setMensajeUsuario(MENSAJE_KO)
    }
  }

  return (
    <div className="row container-fluid justify-content-center ">
      <div className="row text-primary h2 text-center">Regenerar Fichajes</div>

      <div className="col-2 mt-4 ml-0 mr-5 justify-content-left">

          <select id="empleados" className="oficial-selects" defaultValue=""
            ref={listaEmpleadosRef as React.RefObject<HTMLSelectElement>} onChange={cambioEmpleado}>
            <option className="checks-fondo-controles" value="" disabled key={0} >Selecciona Emplead@...</option>
            {empleados.map((emp: any) => (
              <option className="checks-fondo-controles" value={emp.idEmpleado} key={emp.idEmpleado}>
                {emp.apellidosNombreEmpleado}
              </option>
            ))}
          </select >
        </div>
        <div className="col-2 ml-5 mt-4 p-2 justify-content-center">
          <input id="anios" className="oficial-selects checks-fondo-controles p-1" type="number" min={minAnio}
              max={maxAnio} onChange={cambioAnio} value={anioSeleccionado} ref={inputAnioRef as React.RefObject<HTMLInputElement>} />         
        </div>
        <div className="col-2 my-4 justify-content-right">
          <button className="btn btn-primary p-15" onClick={regenerarFichajes}>Regenerar Fichajes</button>
      </div>
      
      <div className=" row container-fluid justify-content-center">
          <h2 className="text-success mt-5 text-center">{mensajeUsuario}</h2>
      </div>
    </div>
  )
}
export default Regenerar;