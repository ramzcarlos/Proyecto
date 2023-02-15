import { Injectable } from '@angular/core';
import {UsuarioModelo} from '../models/usuario.modelo'
@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private usuario!: UsuarioModelo;
  constructor() {
    this.usuario={nombre:"carlos", edad:38, curso:"angular"}

   }


  getUsuario(): UsuarioModelo{
    return this.usuario;
  }

  setUsuario(usuario:UsuarioModelo){
    this.usuario=usuario;
  }
}
