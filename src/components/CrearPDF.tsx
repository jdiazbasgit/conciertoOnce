import React, { useEffect, useState } from 'react';
import { Button, Col, Form, FormControl, Row } from 'react-bootstrap';
import { render } from 'react-dom';
import { useForm } from 'react-hook-form';
import { getDatos, servidor } from '../services/Service';


function CrearPDF() {

    const urlBase: string = `http://${servidor}/checks/empleados`

    const [empleados, setEmpleados] = useState([]);
    const [fechas, setFechas] = useState([]);
    const [anios, setAnios] = useState([]);
    const [meses, setMeses] = useState([]);
    const { register, handleSubmit, watch } = useForm();
    let watchEmpleado = watch('empleadoId');
    let watchAnio = watch('anio');
    let watchMes = watch('mes');

    const dameEmpleados = async () => {
        setEmpleados([]);
        const { data } = await getDatos(urlBase);
        setEmpleados(data);
    }

    const dameFechas = async () => {
        setAnios([]);
        setMeses([]);
        const { data } = await getDatos(`${urlBase}/${watchEmpleado}`);
        setFechas(data);
    }


    useEffect(() => {
        setEmpleados([]);
        dameEmpleados();
    }, []);

    useEffect(() => {
        setAnios([]);
        setMeses([]);
        if (watchEmpleado)
            dameFechas();
    }, [watchEmpleado]);


    return (
        <div>
            <h1>Crear PDF</h1>
            <Form>
                <Row>
                    <Col sm={5}>
                        <FormControl as="select" defaultValue="" >
                            <option value="" disabled key={0}>Selecciona Empleado...</option>
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
                        <Button color="primary" className="btn-primary">Crear PDF</Button>
                    </Col>
                </Row>
            </Form>
        </div>
    );

}

export default CrearPDF;









