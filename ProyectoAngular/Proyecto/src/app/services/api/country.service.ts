import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class CountryService {

  constructor(private httpClient : HttpClient) { }

  //url='https://api.sampleapis.com/countries/countries'
  url= 'https://api.sampleapis.com/beers/ale';
  getCountry (){
    return this.httpClient.get(this.url)
  }
}
