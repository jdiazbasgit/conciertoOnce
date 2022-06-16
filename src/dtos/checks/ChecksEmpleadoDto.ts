export class ChecksEmpleadoDto{
    idEmpleado: number;
    apellidosNombreEmpleado:string;
    dniEmpleado:string;
	activo:boolean;

    constructor(idEmpleado:number,apellidosNombreEmpleado:string,dniEmpleado:string,activo:boolean){
        this.idEmpleado=idEmpleado;
        this.apellidosNombreEmpleado=apellidosNombreEmpleado;
        this.dniEmpleado=dniEmpleado;
        this.activo=activo;
    }
}

export default ChecksEmpleadoDto;