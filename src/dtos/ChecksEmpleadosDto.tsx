class ChecksEmpleadoDto    {
    
    idEmpleado:number;
    apellidosNombreEmpleado:string;
    dniEmpleado:string;
	activo:boolean;
	

    constructor(idEmpleado:number,apellidosNombreEmpleado:string,
        dniEmpleado:string,activo:boolean){
        this.apellidosNombreEmpleado=apellidosNombreEmpleado;
        this.dniEmpleado=dniEmpleado;
        this.activo=activo;
        this.idEmpleado=idEmpleado;
    }
}


export default ChecksEmpleadoDto;