import React, { useEffect, useRef, useState } from 'react';
import { Button, Col, Form, FormControl, Row } from 'react-bootstrap';
import { useForm } from 'react-hook-form';
import ChecksEmpleadoDto from '../dtos/checks/ChecksEmpleadoDto';
import { getDatos, servidor } from '../services/Service';

//https://blog.logrocket.com/guide-to-react-useeffect-hook/

function Informes() {

    const urlBase: string = `http://${servidor}/checks/empleados`

    const [empleados, setEmpleados] = useState([]);
    const [fechas, setFechas] = useState([]);
    const listaEmpleadosRef = useRef<HTMLOptionElement>();

    
    const [meses, setMeses] = useState([]);
    const [anios, setAnios] = useState([]);
    const { register, handleSubmit, watch } = useForm();
    let watchEmpleado = watch('empleadoId');
    let watchAnio = watch('anio');
    let watchMes = watch('mes');

    const dameEmpleados = async () => {
        const { data } = await getDatos(urlBase);
        setEmpleados(data);
    }

    const dameFechas = async () => {
        const { data } = await getDatos(`${urlBase}/${watchEmpleado}`);
        setFechas(data);
    }

    useEffect(() => {
        dameEmpleados();
    }, [setEmpleados]);

    useEffect(() => {
        dameFechas();
    }, [setEmpleados]);

    useEffect(() => {
        setAnios([]);
        setMeses([]);
        if (watchEmpleado)
            dameFechas();
    }, [watchEmpleado]);

    const crearPdf=()=> console.log("click crear PDF");


    return (
        <div>
            <h1>Crear PDF</h1>
            <Form>
                <Row>
                    <Col sm={5}>
                        <FormControl as="select" defaultValue="" >
                            <option value="" disabled key={0} ref={listaEmpleadosRef}>Selecciona Empleado...</option>
                            {empleados.map((emp: any) => (
                                <option value={emp.idEmpleado} key={emp.idEmpleado}>
                                    {emp.apellidosNombreEmpleado} -- {emp.dniEmpleado}
                                </option>
                            ))}
                        </FormControl >
                    </Col>
                    <Col sm={2}>
                        <FormControl type="number" placeholder="Selecciona Año..." ></FormControl >
                    </Col>
                    <Col sm={2}>
                        <FormControl type="number" placeholder="Selecciona Mes..." ></FormControl >
                    </Col>
                    <Col sm={3}>
                        <Button color="primary" className="btn-primary" onClick={crearPdf}>Crear PDF</Button>
                    </Col>
                </Row>
            </Form>
        </div>
    );

}

export default Informes;

