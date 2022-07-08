import React from "react";
import "bootstrap/dist/css/bootstrap.css";
import "../css/App.css";
import Login from "../components/Login";
import CrearPDF from "./CrearPDF";
import InputMeses from "./InputMeses";
import RegenerarChecks from "./RegenerarChecks";
import {
    Routes,
    Route,
    Link,
    BrowserRouter,
} from "react-router-dom";


class App extends React.Component {

    render(): React.ReactNode {
        return (
            <BrowserRouter>
                <div>
                    <ul>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                        <li>
                            <Link to="/RegenerarChecks">Regenerar Checks</Link>
                        </li>
                        <li>
                            <Link to="/InputMeses">Input Meses</Link>
                        </li>
                        <li>
                            <Link to="/FichajesPdf">Crear PDF</Link>
                        </li>
                        <li>
                            <Link to="/Login">Login</Link>
                        </li>
                    </ul>
                    <Routes>
                        <Route path="/" element={<Login />} />
                        <Route path="/regenerarChecks" element={<RegenerarChecks />} />
                        <Route path="/inputMeses" element={<InputMeses />} />
                        <Route path="/crearPDF" element={<CrearPDF />} />
                        <Route path="/login" element={<Login />} />
                    </Routes>
                </div>
            </BrowserRouter>
        );
    }
}

export default App;