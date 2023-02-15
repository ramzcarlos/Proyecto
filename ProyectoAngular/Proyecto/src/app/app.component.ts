import { Component, OnInit } from '@angular/core';
import { UsuarioModelo } from './models/usuario.modelo';
import { CountryService } from './services/api/country.service';
import { LocalStorageService } from './services/local-storage.service';
import { UsuarioService } from './services/usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Proyecto';

  isLogged=true;
  public usuario! : UsuarioModelo;
  public countryData : any;
  constructor(private usuarioService: UsuarioService, private localStorageService: LocalStorageService,
   private countryService: CountryService ){}
  ngOnInit(): void {
    this.usuario=this.usuarioService.getUsuario();
    this.localStorageService.almacenar("JWT", "hola estae es un jwt");
    this.consulta();
  }

  consulta(): void{
    this.countryService.getCountry().subscribe(res => {
      console.log(res);
      this.countryData=res;
    },(error:any)=>{
      console.log(error)
    })
  }
}
