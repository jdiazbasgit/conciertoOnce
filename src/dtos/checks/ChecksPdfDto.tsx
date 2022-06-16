import { ChecksEmpleadoDia } from "./ChecksEmpleadoDia.decl";
import { ChecksEmpleadoDto } from "./ChecksEmpleadoDto";

class ChecksPdfDto    {
    empleado:ChecksEmpleadoDto;
	nombreMes:string;
	mes:string;
	anio:string;
    checksEmpleadoDia: ChecksEmpleadoDia;

    constructor(empleado:ChecksEmpleadoDto, nombreMes:string, mes:string, anio:string, checksEmpleadoDia: ChecksEmpleadoDia){
        this.empleado=empleado;
        this.nombreMes=nombreMes
        this.mes=mes
        this.anio=anio;
        this.checksEmpleadoDia= checksEmpleadoDia;
    }
}

export default ChecksPdfDto;