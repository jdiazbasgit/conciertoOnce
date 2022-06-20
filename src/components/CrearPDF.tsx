import React, { useEffect, useState } from 'react';
import { Button, Col, Form, FormControl, Row } from 'react-bootstrap';
import { render } from 'react-dom';
import { useForm } from 'react-hook-form';
import { getDatos, servidor } from '../services/Service';
//https://stackoverflow.com/questions/66935038/setting-max-and-min-user-input-in-react-form

function CrearPDF() {

    const urlBase: string = `http://${servidor}/checks/empleados`

    const [empleados, setEmpleados] = useState([]);
    const [anios, setAnios] = useState([]);
    const [meses, setMeses] = useState([]);
    const [minAnio, setMinAnio] = useState([]);
    const [maxAnio, setMaxAnio] = useState([]);
    const [minMes, setMinMes] = useState([]);
    const [maxMes, setMaxMes] = useState([]);
    const { register, handleSubmit, watch } = useForm();
    let watchEmpleado = watch('empleadoId');
    let watchAnio = watch('anio');
    let watchMes = watch('mes');

    const dameEmpleados = async () => {
        const { data } = await getDatos(urlBase);
        setEmpleados(data);
    }

    const dameAnios = async () => {
        const { data } = await getDatos(`${urlBase}/${watchEmpleado}`);
        setAnios(data);
        setMinAnio(data.anioAlta);
        setMaxAnio(data.anioBaja);
    }

    const dameMeses = async () => {
        const { data } = await getDatos(`${urlBase}/${watchEmpleado}/${watchAnio}`);
        setMeses(data);
        setMinMes(data.mesAlta);
        setMaxMes(data.mesBaja);
    }

    useEffect(() => {
        setEmpleados([]);
        dameEmpleados();
    }, []);

    useEffect(() => {
        setAnios([]);
        setMeses([]);
        if (watchEmpleado)
            dameAnios();
    }, [watchEmpleado]);

    useEffect(() => {
        setMeses([]);
        if (watchAnio)
            dameMeses();
    }, [watchAnio]);

    return (
        <div>
            <h1>Crear PDF</h1>
            <Form>
                <Row>
                    <Col sm={5}>
                        <FormControl name="empleadoId" as="select" defaultValue="" >
                            <option value="" disabled key={0}>Selecciona Empleado...</option>
                            {empleados.map((emp: any) => (
                                <option value={emp.idEmpleado} key={emp.idEmpleado}>
                                    {emp.apellidosNombreEmpleado} -- {emp.dniEmpleado}
                                </option>
                            ))}
                        </FormControl >
                    </Col>
                    <Col sm={2}>                       
                            <FormControl name="anio" type="number" placeholder="Selecciona Año..."
                                min={this.minAnio} max={maxAnio}></FormControl >                     
                    </Col>
                    <Col sm={2}>                        
                            <FormControl name="anio" type="number" placeholder="Selecciona Mes..."
                                min={minMes} max={maxMes} value={numb}
                                onChange={(e) => setNumb(e.target.value)}></FormControl >                    
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









