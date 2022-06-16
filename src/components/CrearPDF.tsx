import React, { createRef } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "../css/App.css";
import { Form, Col, Row, Button, FormControl } from "react-bootstrap";
import { getDatos } from "../services/Service";

class CrearPDF extends React.Component {

    employeesSalida: string;
    idEmpleado: any;
    apellidosNombreEmpleado: any;
    dniEmpleado: any;
    activo: any;
    selectEmpleado: any;
    urlEmpleados = "http://82.223.202.137:8082/checks/empleados"


    constructor(props: any) {
        super(props);
        this.employeesSalida = "";
        this.idEmpleado = createRef();
        this.apellidosNombreEmpleado = createRef();
        this.dniEmpleado = createRef();
        this.activo = createRef();
        this.selectEmpleado = createRef();
    }
    /*
    import React, { useEffect, useState } from 'react';
    import { useForm } from 'react-hook-form';
    import { getUsers, getUsersPosts, getUsersComments } from './Requests';
    import {
        SelectInput,
        InputContainer,
        InputWrapper,
        Email,
        Comment,
    } from './style';
    
    function App() {
        const [user, setUsers] = useState([]);
        const [userPosts, setUsersPosts] = useState([]);
        const [comments, setComments] = useState([]);
        const [errorRequest, setErrorRequest] = useState(false);
        const { register, handleSubmit, watch } = useForm();
        let watchUser = watch('userId');
        let watchPost = watch('userPost');
      
        return (
            <div>
                <InputContainer>
                    <InputWrapper>
                        <SelectInput name="userId" ref={register()}>
                            <option value="">Choose a user</option>
                            {user.map((value) => (
                                <option value={value.id} key={value.id}>
                                    {value.username}
                                </option>
                            ))}
                        </SelectInput>
                    </InputWrapper>
                    <InputWrapper>
                        <SelectInput name="userPost" ref={register()}>
                            <option value="">Choose a post</option>
                            {userPosts.map((value) => (
                                <option value={value.id} key={value.id}>
                                    {value.title}
                                </option>
                            ))}
                        </SelectInput>
                    </InputWrapper>
                </InputContainer>
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
    useEffect(() => {
		async function fetchInitialData() {
			const response = await getUsers();
			response.errors ? setErrorRequest(true) : setUsers(response);
		}

		fetchInitialData();
	}, []);

    useEffect(() => {
		setUsersPosts([]);
		setComments([]);
		async function fetchPosts() {
			const response = await getUsersPosts(watchUser);
			response.errors ? setErrorRequest(true) : setUsersPosts(response);
		}
		if (watchUser) {
			fetchPosts();
		}
	}, [watchUser]);

    export default App;

*/

    empleados = () => {

        this.selectEmpleado.current.innerHTML = "<option disabled selected value>Seleccione un empleado</option>"

        getDatos(this.urlEmpleados).then((response) => {
            console.log(response.data);
            response.data.forEach((e: any) => {
                this.selectEmpleado.current.innerHTML = `${this.selectEmpleado.current.innerHTML}
                <option value="{{e.idEmpleado}}" >${e.apellidosNombreEmpleado} -- ${e.dniEmpleado}</option>`

            });
        });
    };


    render(): React.ReactNode {
        return (
            <div className="App">
                <h1>Crear PDF</h1>
                <Form>
                    <Row>
                        <Col sm={5}>
                            <FormControl as="select"  defaultValue="" >
                                <option  value="" disabled key={0}>Selecciona Empleado...</option>
                            </FormControl >
                        </Col>
                        <Col sm={2}>
                            <FormControl type="number"  placeholder="Selecciona Año..." ></FormControl >
                        </Col>
                        <Col sm={2}>
                            <FormControl type="number" placeholder="Selecciona Mes..." ></FormControl >
                        </Col>
                        <Col sm={3}>
                            <Button color="primary"  className="btn-primary">Crear PDF</Button>
                        </Col>
                    </Row>
                </Form>   
            </div>
        );
    }
}

export default CrearPDF;