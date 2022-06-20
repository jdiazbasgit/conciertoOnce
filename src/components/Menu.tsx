import React from "react";
import "bootstrap/dist/css/bootstrap.css";
import Navbar from 'react-bootstrap/Navbar'
import { Container, Nav } from "react-bootstrap";
import { Header } from "react-bootstrap/lib/Navbar";

class Menu extends React.Component {

    render(): React.ReactNode {
        return (

            <div>
                <header>
                <h1>Cabecera</h1>
            </header>
            
            <Navbar bg="dark" variant="dark">
                    <Container>
                            <Navbar.Brand href="#home">Home</Navbar.Brand>
                            <Nav className="me-auto">
                                <Nav.Link href="/jornadas">Jornadas</Nav.Link>
                                <Nav.Link href="/empleados">Empleado</Nav.Link>
                                <Nav.Link href="/empleadosJornada">Empleado/Jornadas</Nav.Link>
                                <Nav.Link href="/estados">Estados</Nav.Link>
                                <Nav.Link href="/calendario">Calendario</Nav.Link>
                                <Nav.Link href="/informes">Informes</Nav.Link>
                            </Nav>
                    </Container>
                </Navbar>
                </div>
        );
    }
}

export default Menu;