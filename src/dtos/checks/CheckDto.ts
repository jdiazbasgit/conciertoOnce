class CheckDto{
    checkEntrada:boolean;
    hora:string;

    constructor(checkEntrada:boolean,hora:string){
        this.checkEntrada = checkEntrada
        this.hora = hora;
    }
}

export default CheckDto;