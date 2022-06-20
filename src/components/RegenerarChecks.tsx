import { useEffect, useState } from "react";
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
    /* if (datosPdf) {
      console.log(datosPdf.empleado,datosPdf?.mes,datosPdf.anio,datosPdf.nombreMes);
      datosPdf.checksEmpleadoDia.map((value:CheckDto, key:string)=>{
        console.log(key, value.checkEntrada, value?.hora);
      });
    } */
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


