import React, { useEffect, useState } from "react";
import "bootstrap/dist/css/bootstrap.css";
import "../css/App.css";
import { getDatos, servidor } from "../services/Service";
import ChecksEmpleadoDto from "../dtos/checks/ChecksEmpleadoDto";

const urlEmpleados = `http://${servidor}/checks/empleados`

const ListaEmpleados = () => {
    const [selectedOption, setSelectedOption] = useState<string>();
    const [empleados, setEmpleados] = useState<ChecksEmpleadoDto[]>([]);
    
  const selectChange = (event: React.ChangeEvent<HTMLSelectElement>) => {
    const value = event.target.value;
    setSelectedOption(value);
  };

  const dameEmpleados = async()=>{
    const{data} = await getDatos(urlEmpleados);
    setEmpleados(data);
  }

  useEffect(() => {
    dameEmpleados();
  }, []);

  return (
    <div>
      {empleados.length > 0 ? (
        <select onChange={selectChange}>
        <option value="default" disabled selected>
            Seleccione un empleado...
        </option>
          {empleados.map((empleado) => (
            <option value={empleado.idEmpleado}>
              {empleado.apellidosNombreEmpleado} -- {empleado.dniEmpleado}
            </option>
          ))}
        </select>
       
      ) : (
        <p className="cargando">Cargando Empleados... </p>
      )}
      {selectedOption && <h3>Seleccionado idEmpleado = {selectedOption}</h3>}
    </div>
  );
};

export default ListaEmpleados;