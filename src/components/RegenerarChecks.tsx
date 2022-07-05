import React, { ChangeEvent, useEffect, useRef, useState } from 'react';
import { Button, Col, Form, FormControl, Row } from 'react-bootstrap';
import ChecksEmpleadoDto from '../dtos/checks/ChecksEmpleadoDto';
import { getDatos, servidor } from '../services/Service';
import "../css/checks.css";

//https://stackoverflow.com/questions/21733847/react-jsx-selecting-selected-on-selected-select-option
//https://blog.logrocket.com/guide-to-react-useeffect-hook/

const ERROR_01 = "Error petición empleados, RegenerarChecks.tsx";
const ERROR_02 = "Error petición fechas, RegenerarChecks.tsx";
const ERROR_03 = "Error regenerando checks, RegenerarChecks.tsx";
const MENSAJE_OK = "Checks regenerados correctamente";

function RegenerarChecks() {

  const urlEmpleados: string = `http://${servidor}/checks/empleados`

  const [empleados, setEmpleados] = useState<ChecksEmpleadoDto[]>([]);
  const [idEmpleadoSeleccionado, setIdEmpleadoSeleccionado] = useState<number>(0);
  const [minAnio, setMinAnio] = useState<number>(0);
  const [maxAnio, setMaxAnio] = useState<number>(0);
  const [anioSeleccionado, setAnioSeleccionado] = useState<number>(0);
  const [mensajeUsuario, setMensajeUsuario] = useState<string>('');

  const listaEmpleadosRef = useRef<HTMLSelectElement>();
  const inputAnioRef = useRef<HTMLInputElement>();

  useEffect(() => {
    const dameEmpleados = async () => {
      try {
        const response = await getDatos(urlEmpleados);
        if (response.status === 200)
          setEmpleados(response.data);
      } catch (error) {
        console.log(ERROR_01);
        // Redirigir a página de login ????????????
      }
    };
    dameEmpleados();
  }, [urlEmpleados]);


  useEffect(() => {
    if (idEmpleadoSeleccionado !== 0) {
      setMinAnio(0);
      setMaxAnio(0);
      const dameFechas = async () => {
        try {
          console.log("urlDameFechas : " + `${urlEmpleados}/${idEmpleadoSeleccionado}`)
          const response = await getDatos(`${urlEmpleados}/${idEmpleadoSeleccionado}`);
          if (response.status === 200) {
            setMinAnio(response.data.anioAlta);
            setMaxAnio(response.data.anioBaja);
          }
        } catch (error) {
          console.log(ERROR_02);
          // Redirigir a página de login ????????????
        }
      };
      dameFechas();
    }
  }, [idEmpleadoSeleccionado]);



  const regenerarChecks = async (event: React.MouseEvent<HTMLButtonElement>) => {
    event.preventDefault();
    event.stopPropagation();
    try {
      const response = await getDatos(`http://${servidor}/checks/regenera/${idEmpleadoSeleccionado}/${anioSeleccionado}`)
      if (response.status === 200)
        setMensajeUsuario(MENSAJE_OK);
    } catch (error) {
      console.log(ERROR_03);
      // Redirigir a página de login ????????????
    }
  }

  const cambioEmpleado = (e: ChangeEvent) => {
    setIdEmpleadoSeleccionado(Number((e.target as HTMLOptionElement).value));
    console.log("IdEmpleado -> " + (e.target as HTMLOptionElement).value);
  }

  const cambioAnio = (e: ChangeEvent) => {
    setAnioSeleccionado(Number((e.target as HTMLInputElement).value));
    console.log("AnioSeleccionado -> " + (e.target as HTMLOptionElement).value);
  }

  return (
    <div className="text-center">
      <h2 className="mb-4"></h2>
      <Form>
        <Row className="mt-5">
          <Col sm={4}>
            <select className="checks-fondo-controles" defaultValue=""
              ref={listaEmpleadosRef as React.RefObject<HTMLSelectElement>} onChange={cambioEmpleado}>
              <option className="checks-fondo-controles" value="" disabled key={0} >Selecciona Empleado...</option>
              {empleados.map((emp: any) => (
                <option className="checks-fondo-controles" value={emp.idEmpleado} key={emp.idEmpleado}>
                  {emp.apellidosNombreEmpleado} -- {emp.dniEmpleado}
                </option>
              ))}
            </select >
          </Col>
          <Col sm={2} className="ml-5">
            <input className="checks-fondo-controles" type="number" placeholder="Selecciona Año..." min={minAnio}
              max={maxAnio} onChange={cambioAnio} ref={inputAnioRef as React.RefObject<HTMLInputElement>} />
          </Col>
          <Col sm={3} className="ml-5">
            <button className="btn checks-fondo-controles boton-regenerar" onClick={regenerarChecks}>Regenerar Checks</button>
          </Col>
        </Row>
      </Form>
      <div className="regenerar-mensaje">
        <h1>{mensajeUsuario}</h1>
      </div>
    </div>
  );

}

export default RegenerarChecks;


/* import { useEffect, useState } from "react";
import ChecksEmpleadoDto from "../dtos/checks/ChecksEmpleadoDto";
import ChecksFechasEmpleadosDto from "../dtos/checks/ChecksFechasEmpleadosDto";
import ChecksPdfDto from "../dtos/checks/ChecksPdfDto";
import { getDatos, servidor } from "../services/Service";
import { useForm } from "react-hook-form";
import { Form, Col, Row, Button} from "react-bootstrap";
import CheckDto from "../dtos/checks/CheckDto";

//https://blog.bitsrc.io/4-methods-to-add-conditional-attributes-to-react-components-b1ad195f449b
// https://danilorivera95.medium.com/fill-select-options-depending-on-other-select-field-using-axios-react-hook-form-and-2a25d4994d30
//https://www.kindacode.com/article/react-typescript-handling-onclick-event/

const urlBase = `http://${servidor}/checks/empleados`
const urlBasePdf = `http://${servidor}/checks/informe`

const RegenerarChecks = () => {
  const [selectedEmpleado, setSelectedEmpleado] = useState<string>();
  const [empleados, setEmpleados] = useState<ChecksEmpleadoDto[]>([]);
  const [datosPdf, setDatosPdf] = useState<ChecksPdfDto>();
  const [fechas, setFechas] = useState<ChecksFechasEmpleadosDto>();
  const { watch } = useForm();
  const [clickedButton, setClickedButton] = useState('');
  const nuevoEmpleadoSeleccionado: string = watch("selectEmpleados")
  const nuevoAnioSeleccionado: string = watch("selectAnios")  
  const nuevoMesSeleccionado: string = watch("selectMeses")


  const selectChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const value = event.target.value;
    setSelectedEmpleado(value);
  };

  const dameEmpleados = async () => {
    const { data } = await getDatos(urlBase);
    setEmpleados(data);
  }

  const dameFechas = async () => {
    const { data } = await getDatos(`${urlBase}/${nuevoEmpleadoSeleccionado}`);
    setFechas(data);
  }

  const dameDatosPdf = async () => {
    const { data } = await getDatos(`${urlBasePdf}/${nuevoEmpleadoSeleccionado}
                                    /${nuevoMesSeleccionado}/${nuevoAnioSeleccionado}`);
    setDatosPdf(data);
  }

  useEffect(() => {
    dameEmpleados();
  }, []);

  useEffect(() => {
    setFechas({} as ChecksFechasEmpleadosDto);  // vaciarlista años, fechas
    if (nuevoEmpleadoSeleccionado)
      dameFechas();
  }, [nuevoEmpleadoSeleccionado]);

  useEffect(() => {
    setDatosPdf({} as ChecksPdfDto);
    dameDatosPdf();   
     if (datosPdf) {
      console.log(datosPdf.empleado,datosPdf?.mes,datosPdf.anio,datosPdf.nombreMes);
      datosPdf.checksEmpleadoDia.map((value:CheckDto, key:string)=>{
        console.log(key, value.checkEntrada, value?.hora);
      });
    } 
  }, []);

  const creaPdf = (event: React.MouseEvent<HTMLButtonElement>) => {
    event.preventDefault();
    event.stopPropagation();
  };

  return (
    <>
      {<h3 style={{ textAlign: "center" }}>Crear PDF Checks</h3>}
      <Form>
      <Row className="justify-content-md-center">
        <Col sm={5}>
          <select name="selectEmpleados" defaultValue="" >
            <option value="" disabled key={0}>
              Seleccione empleado...
            </option>
            {empleados.map((empleado) => (
              <option value={empleado.idEmpleado} key={empleado.idEmpleado}>
                {empleado.apellidosNombreEmpleado} -- {empleado.dniEmpleado}
              </option>
            ))}
          </select>
        </Col>

        <Col sm={2}>
          <input type="number"  name="selectAnios" min={fechas?.anioAlta}
            max={fechas?.anioBaja} placeholder="Selecciona Año..." />
          <h3>A&ntilde;o Alta = {fechas?.anioAlta}</h3>
          <h3>A&ntilde;o Baja = {fechas?.anioBaja}</h3>
          <h3>Seleccionado A&ntilde;o = {nuevoAnioSeleccionado}</h3>
        </Col>

        <Col sm={2}>
          <input type="number"  name="selectMeses"  min={fechas?.mesAlta}
            max={fechas?.mesBaja} placeholder="Seleccione Mes..." />
          <h3>MesAlta = {fechas?.mesAlta}</h3>
          <h3>MesBaja = {fechas?.mesBaja}</h3>
          <h3>Seleccionado Mes = {nuevoMesSeleccionado}</h3>
        </Col>

        <Col sm={3}>
          <Button variant="primary" name="botonCreaPdf" onClick={creaPdf} type="submit">Crear PDF</Button>     
        </Col>
      </Row>
      </Form>
    </>
  );
};

export default RegenerarChecks;


 */