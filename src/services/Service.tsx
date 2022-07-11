import axios from 'axios';
import Login from "../clases/Login"
/* eslint-disable no-undef */

//export const servidor = "82.223.202.137:8082";
export const servidor = "localhost:8082";
const urlLogin=`http://${servidor}/user`;

export function login(usuario:string, clave:string){
  return axios(urlLogin,{data:new Login(usuario,clave),method:"POST"})   
}

export function getDatos(url:string){
  return axios.get(url,{"headers":{"Authorization":localStorage.token}});
}

export function datosBody(url:string,body:any,method:string){
  return axios(url,{"headers":{"Authorization":localStorage.token},"data":body,"method":method})
}