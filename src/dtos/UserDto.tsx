class UserDto{
    usuario:string;
	token:string;
	//roles:Set<Rol>
    administrador:any;
	idEmpleado:number;
        
   //constructor temporal queda meter una propiedad
    constructor(usuario:string,token:string,administrador:any,idEmpleado:number){
        this.usuario=usuario
        this.token=token
        //this.roles=roles
        this.administrador=administrador
        this.idEmpleado=idEmpleado;
    }
}
export default UserDto;