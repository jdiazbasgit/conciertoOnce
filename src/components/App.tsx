import React from "react";
import "bootstrap/dist/css/bootstrap.css";
import "../css/App.css";
import { Routes, Route, Link, BrowserRouter, } from "react-router-dom";

import Login from "../components/Login";
import CrearPDF from "./CrearPDF";
import InputMeses from "./InputMeses";
import RegenerarChecks from "./RegenerarChecks";
import Journal from "./Journal";
import Employee from "./Employee";
import EmployeeJournal from "./EmployeeJournals";
import Estados from "./Estados";
import Informes from "./Informes";
import Menu from "./Menu";
import Calendario from "./Calendario";
import Cabecera from "./Cabecera";

class App extends React.Component {

    render(): React.ReactNode {
        return (
            <div>
                <Cabecera/>
                <Menu /><BrowserRouter>
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
                            <Link to="/CrearPdf">Crear PDF</Link>
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
                        <Route path="/jornadas" element={<Journal />} />
                        <Route path="/empleados" element={<Employee />} />
                        <Route path="/empleadosJornada" element={<EmployeeJournal />} />
                        <Route path="/estados" element={<Estados />} />
                        <Route path="/calendario" element={<Calendario />} />
                        <Route path="/informes" element={<Informes />} />
                    </Routes>
                </div>
            </BrowserRouter>
            </div>
        );
    }
}

export default App;