export class ChecksFechasEmpleadosDto {
    anioAlta: number;
    anioBaja: number;
    mesAlta: number;
	mesBaja: number;

    constructor(anioAlta:number,anioBaja: number,mesAlta: number, mesBaja: number){
        this.anioAlta=anioAlta;
        this.anioBaja=anioBaja;
        this.mesAlta=mesAlta;
        this.mesBaja=mesBaja;
    }
}

export  default ChecksFechasEmpleadosDto;