import React, { ChangeEvent, useEffect, useRef, useState } from 'react';
import { Form, Row } from 'react-bootstrap';
import { getDatos, servidor } from '../services/Service';
import "../css/fichajes.css";

const ERROR_01 = "Error petición emplead@s, Informes.tsx";
const ERROR_02 = "Error petición fechas, Informes.tsx";
const ERROR_03 = "Error generando PDF, Informes.tsx";
const MENSAJE_OK = "Informe PDF generado correctamente";
const MENSAJE_KO = "No se ha podido generar el informe solicitado";
const ERROR_DATOS_SELECCIONADOS = "Emplead@ o Año o Mes seleccionado son incorrectos";
const ERROR_DESCONOCIDO = "Error inesperado. Por favor, pruebe más adelante";

function Informes() {
    const urlEmpleados: string = `http://${servidor}/checks/empleados`;
    const urlInforme: string = `http://${servidor}/checks/informe`;


    const [mensajeUsuario, setMensajeUsuario] = useState<string>("");
    const [mensajeError, setMensajeError] = useState<string>("");
    const [idEmpleadoSeleccionado, setIdEmpleadoSeleccionado] = useState<number>(0);
    const [anioSeleccionado, setAnioSeleccionado] = useState<number>(0);
    const [mesSeleccionado, setMesSeleccionado] = useState<number>(0);
    const [minAnio, setMinAnio] = useState<number>(0);
    const [maxAnio, setMaxAnio] = useState<number>(0);
    const [minMes, setMinMes] = useState<number>(1);
    const [maxMes, setMaxMes] = useState<number>(12);

    const [empleados, setEmpleados] = useState([]);

    const listaEmpleadosRef = useRef<HTMLSelectElement>();
    const inputAnioRef = useRef<HTMLInputElement>();
    const inputMesRef = useRef<HTMLInputElement>();

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
        setAnioSeleccionado(0);
        setMesSeleccionado(0);
        const dameLimiteFechas = async () => {
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
        dameLimiteFechas();
    }, [idEmpleadoSeleccionado]);

    const cambioAnio = (e: ChangeEvent) => {
        setAnioSeleccionado(Number((e.target as HTMLInputElement).value));
    }

    const cambioMes = (e: ChangeEvent) => {
        setMesSeleccionado(Number((e.target as HTMLInputElement).value));
    }

    const cambioEmpleado = (e: ChangeEvent) => {
        setIdEmpleadoSeleccionado(Number((e.target as HTMLInputElement).value));
    }

    const generarPdf = async (event: React.MouseEvent<HTMLButtonElement>) => {
        event.preventDefault();
        event.stopPropagation();
        setMensajeUsuario("");    
        setMensajeError("");
        if (idEmpleadoSeleccionado > 0 && anioSeleccionado > 0 && mesSeleccionado > 0) {
          try {
            const response = await getDatos(`${urlInforme}/${idEmpleadoSeleccionado}/${mesSeleccionado}/${anioSeleccionado}`);
            console.log(`${urlInforme}/${idEmpleadoSeleccionado}/${mesSeleccionado}/${anioSeleccionado}`);
            // Recupera objeto ChecksPdfDto con datos para rellenar el pdf
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
        <div className="checks-container">
            <h2 className="checks-h2 text-center mt-5 mb-5">Generar Informe PDF</h2>

            <Form className="mt-5">
                <Row className="justify-content-center my-5">
                    <div className="col-4">
                        <label htmlFor="empleados" className="h5 checks-label pr-5">Emplead@ &nbsp; </label>
                        <select id="empleados" className="checks-fondo-controles" defaultValue=""
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
                        <label htmlFor="anios" className="h5 checks-label pr-5"> A&ntilde;o &nbsp; </label>
                        <input id="anios" className="checks-fondo-controles p-1" type="number" min={minAnio} required
                            max={maxAnio} onChange={cambioAnio} value={anioSeleccionado} ref={inputAnioRef as React.RefObject<HTMLInputElement>} />
                    </div>
                    <div className="col-3">
                        <label htmlFor="meses" className="h5 checks-label pr-5"> Mes &nbsp; </label>
                        <input id="meses" className="checks-fondo-controles p-1" type="number" min={minMes} required
                            max={maxMes} onChange={cambioMes} value={mesSeleccionado} ref={inputMesRef as React.RefObject<HTMLInputElement>} />
                    </div>
                    <Row className="justify-content-center mt-5 mb-5">
                        <div className="col-2">
                            <button className="checks-boton mt-5"  onClick={generarPdf}>Generar  PDF</button>
                        </div>
                    </Row>
                    <h2 className="text-success mt-5 text-center">{mensajeUsuario}</h2>
                    <h2 className="text-danger text-center">{mensajeError}</h2>
                </Row>
            </Form>
        </div>
    );

}

export default Informes;

