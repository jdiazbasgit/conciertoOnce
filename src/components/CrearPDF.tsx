import React, { useEffect, useState } from 'react';
import { render } from 'react-dom';
import { useForm } from 'react-hook-form';
import { getDatos, servidor } from '../services/Service';

const urlBase = `http://${servidor}/checks/empleados`

function CrearPDF() {
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

    empleados = () => {

        getDatos(this.urlEmpleados).then((response) => {
            console.log(response.data);
            response.data.forEach((e: any) => {
                this.selectEmpleado.current.innerHTML = `${this.selectEmpleado.current.innerHTML}
                    <option value="{{e.idEmpleado}}" >${e.apellidosNombreEmpleado} -- ${e.dniEmpleado}</option>`

            });
        });
    };

    

    return (
        <div>
            <h1>Crear PDF</h1>
            <Form>
                <Row>
                    <Col sm={5}>
                        <FormControl as="select" defaultValue="" >
                            <option value="" disabled key={0}>Selecciona Empleado...</option>
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
    return (
        <div>
            <select name="empleadoId" ref={register()}>
                <option value="">Selecciona Empleado...</option>
                {empleados.map((value) => (
                    <option value={value.idEmpleado} key={value.idEmpleado}>
                        `${value.apellidosNombreEmpleado} -- ${value.dniEmpleado}`
                    </option>
                ))}
            </select>
            <elect name="userPost" ref={register()}>
                <option value="">Choose a post</option>
                {userPosts.map((value) => (
                    <option value={value.id} key={value.id}>
                        {value.title}
                    </option>
                ))}
            </Sslect>
            <h1>Comments</h1>
            {comments.map((value) => (
                <div key={value.id}>
                    <Email>{value.email}</Email>
                    <Comment>{value.body}</Comment>
                    <hr />
                </div>
            ))}
        </div>
    );
}


export default CrearPDF;





