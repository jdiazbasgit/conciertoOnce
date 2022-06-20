class ChecksEmpleadoMesDto    {
    
    nombreApellidosEmpleado:string;
    dniEmpleado:string;
	nombreMes:string;
	mes:string;
	anio:string;
    //checksEmpleadoDia: Map <Integer,CheckDto >;


    //constructor temporal:
    //pendiente por meter la propiedades... 
    constructor(nombreApellidosEmpleado:string,dniEmpleado:string,nombreMes:string,mes:string, anio:string){
        this.nombreApellidosEmpleado=nombreApellidosEmpleado
        this.dniEmpleado=dniEmpleado
        this.nombreMes=nombreMes
        this.mes=mes
        this.anio=anio;
    }
}

export default ChecksEmpleadoMesDto;