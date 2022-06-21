import React, { InputHTMLAttributes, useEffect, useState } from 'react';
import { Button, Col, Form, FormControl, Row } from 'react-bootstrap';
import { render } from 'react-dom';
import { useForm } from 'react-hook-form';
import { getDatos, servidor } from '../services/Service';
//https://stackoverflow.com/questions/66935038/setting-max-and-min-user-input-in-react-form

const CrearPDF = () => {

    const urlBase: string = `http://${servidor}/checks/empleados`

    const [listaEmpleados, setlistaEmpleados] = useState([]);
    const [listaAnios, setListaAnios] = useState([]);
    const [listaMeses, setListaMeses] = useState([]);
    const [anioSeleccionado, setAnioSeleccionado] = useState<number>(0);
    const [meseleccionado, setMesSeleccionado] = useState<number>(0);
    const [minAnio, setMinAnio] = useState<number>(0);
    const [maxAnio, setMaxAnio] = useState<number>(0);
    const [minMes, setMinMes] = useState<number>(0);
    const [maxMes, setMaxMes] = useState<number>(0);
    const { register, handleSubmit, watch } = useForm();
    let watchEmpleado = watch('empleadoId');
    let watchAnio = watch('anio');
    let watchMes = watch('mes');

    const dameEmpleados = async () => {
        const { data } = await getDatos(urlBase);
        setlistaEmpleados(data);
    }

    const dameAnios = async () => {
        const { data } = await getDatos(`${urlBase}/${watchEmpleado}`);
        setListaAnios(data);
        setMinAnio(data.anioAlta);
        setMaxAnio(data.anioBaja);
    }

    const dameMeses = async () => {
        const { data } = await getDatos(`${urlBase}/${watchEmpleado}/${watchAnio}`);
        setListaMeses(data);
        setMinMes(data.mesAlta);
        setMaxMes(data.mesBaja);
    }

    useEffect(() => {
        setlistaEmpleados([]);
        dameEmpleados();
    }, []);

    useEffect(() => {
        setListaAnios([]);
        setListaMeses([]);
        if (watchEmpleado)
            dameAnios();
    }, [watchEmpleado]);

    useEffect(() => {
        setListaMeses([]);
        if (watchAnio)
            dameMeses();
    }, [watchAnio]);

    const crearPDF = (event: React.MouseEvent<HTMLButtonElement>) => {
        event.preventDefault();
        event.stopPropagation();
        console.log("Crear PDF => idEmpleado: " + watchEmpleado + ", año " + watchAnio + ", mes "+ watchMes);
       
        
    };

    return (
        <div>
            <h1>Crear PDF</h1>
            <Form>
                <Row>
                    <Col sm={5}>
                        <FormControl name="empleadoId" as="select" defaultValue="" >
                            <option value="" disabled key={0}>Selecciona Empleado...</option>
                            {listaEmpleados.map((emp: any) => (
                                <option value={emp.idEmpleado} key={emp.idEmpleado}>
                                    {emp.apellidosNombreEmpleado} -- {emp.dniEmpleado}
                                </option>
                            ))}
                        </FormControl >
                    </Col>
                    <Col sm={2}>    
                    <FormControl name="anio" type="number" placeholder="Selecciona Mes..."
                                min={minAnio} max={maxAnio} value={maxAnio}
                                onChange={(e) => setAnioSeleccionado(Number(e.target.value))}></FormControl >            
                                            
                    </Col>
                    <Col sm={2}>                        
                    <FormControl name="mes" type="number" placeholder="Selecciona Mes..."
                                min={minMes} max={maxMes} value={maxMes}
                                onChange={(e) => setMesSeleccionado(Number(e.target.value))}></FormControl >                    
                    </Col>
                    <Col sm={3}>
                        <Button color="primary" className="btn-primary" onClick={crearPDF}>Crear PDF</Button>
                    </Col>
                </Row>
            </Form>
        </div>
    );

}

export default CrearPDF;









