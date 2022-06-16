import { FC, useEffect, useState } from "react";
import ChecksFechasEmpleadosDto from "../dtos/checks/ChecksFechasEmpleadosDto";
import { getDatos, servidor } from "../services/Service";

const url = `http://${servidor}/checks/empleados/`;

const InputAnios: FC<{ idempleado: string }> = ({ idempleado }): JSX.Element => {
  const urlFechas: string = `${url}${idempleado}`;
  const [selectedAnio, setSelectedAnio] = useState<string>();
  const [fechas, setFechas] = useState<ChecksFechasEmpleadosDto>();

  const selectChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const value = event.target.value;
    setSelectedAnio(value);
  };

  const dameFechas = async (empleadoSeleccionado:string) => {
    const { data } = await getDatos(${urlBase} );
    setFechas(data);
  }

  useEffect(() => {
    dameFechas();
  }, []);

  return (
    <div>
      {fechas ? (
        <div>
          <input onChange={selectChange} type="number" min={fechas.anioAlta}
            max={fechas.anioBaja} placeholder="Selecciona Año..." />
          {selectedAnio && <h3>MesAlta = {fechas.mesAlta}</h3>}
          {selectedAnio && <h3>MesBaja = {fechas.mesBaja}</h3>}
          {selectedAnio && <h3>Seleccionado A&ntilde;o = {selectedAnio}</h3>}
        </div>
      ) : (
        <p className="cargando">Cargando A&ntilde;os.. </p>
      )}

    </div>
  );

};

export default InputAnios;
