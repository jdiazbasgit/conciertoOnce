import { Component, createRef, ReactNode } from "react";
import { login, getDatos, datosBody } from "../services/Service";

// redirect if user not logged 
//https://levelup.gitconnected.com/react-template-for-jwt-authentication-with-private-routes-and-redirects-f77c488bfb85

//Para controlar largo opciones submenú desplegable
//<Select minMenuHeight={50} maxMenuHeight={100} value={selectedValue} options={this.state.selectOptions} onChange={this.handleChange.bind(this)} />

class Login extends Component {
    usuario: any;
    clave: any;
    lista: any;
    urlEmpleados = "http://82.223.202.137:8082/employees"
    urlTipoEstado = "http://82.223.202.137:8082/statetypes"
    error:any;
    

    constructor(props: any) {
        super(props);
        this.usuario = createRef();
        this.clave = createRef();
        this.lista = createRef();
        this.error = createRef();
    }

    

    login = () => {
        this.error.current.innerText = ""
        login(this.usuario.current.value, this.clave.current.value).then(
            (response) => {
                console.log(response.data)
                if(response.data.usuario==null) 
                    this.error.current.innerText = "Usuario o clave erróneo" 
                localStorage.token = response.data.token;
            }
        );
    };

    empleados = () => {
        getDatos(this.urlEmpleados).then((response) => {
            console.log(response.data);
            response.data._embedded.employees.forEach((dato: { dni: any }) =>
                console.log(dato.dni)
            );
        });
    };


    prueba = () => {
        datosBody(this.urlTipoEstado,{ id: 0, descripcion: "prueba de tiupo estado" },"POST"
        ).then((response) => {
            console.log(response.data);
        });
    };


    render(): ReactNode {
        return (
            <div id="container" className="container">
                <div id="login" className="row align-center text-justify">
                    <div className="col-lg-3">
                        <div className="section-logo">
                            <h1>Accesos</h1>
                        </div>
                    </div>
                    <div className="col-lg-6">
                        <div className="section-right-container">
                            <h2>Ingresa a tu cuenta</h2>
                            <div className="section-right-container-form">
                                <div className="form-group">
                                    <input id="usuario" className="form-control" type="usuario" name="usuario"
                                        placeholder="ingresa tu usuario" required  ref={this.usuario} />
                                </div>
                                <div className="form-group">
                                    <input id="clave" className="form-control" type="password" name="clave"
                                        placeholder="ingresa tu contraseña" required  ref={this.clave} />
                                </div>
                                <div className="form-group">
                                    <button className="form-control bt" onClick={this.login}  >Entrar</button>
                                </div>

                                <div className="form-group">
                                    <h3 ref={this.error} style={{ color: "red" }}></h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Login;