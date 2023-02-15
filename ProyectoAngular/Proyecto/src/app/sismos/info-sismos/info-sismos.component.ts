import { Component, OnInit } from '@angular/core';
import { CountryService } from 'src/app/services/api/country.service';

@Component({
  selector: 'app-info-sismos',
  templateUrl: './info-sismos.component.html',
  styleUrls: ['./info-sismos.component.css']
})
export class InfoSismosComponent implements OnInit{
  src="https://ars.els-cdn.com/content/image/1-s2.0-S1674987119301987-fx1.jpg"
  alt= "portada"
  public countryData : any;
  constructor(private countryService: CountryService ){}
  ngOnInit(): void {
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
