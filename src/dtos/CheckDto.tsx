class CheckDto{
    checkEntrada:any;
    hora:string;
    constructor(checkEntrada:any,hora:string){
        this.checkEntrada = checkEntrada
        this.hora = hora;

    }
}
export default CheckDto;