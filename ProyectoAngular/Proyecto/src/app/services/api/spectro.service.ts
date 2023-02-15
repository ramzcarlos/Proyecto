import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class SpectroService {

  constructor(private httpClient : HttpClient) { }

  url= 'https://api.sampleapis.com/bitcoin/historical_prices';

  getSpectro (){
    return this.httpClient.get(this.url)
  }
}
