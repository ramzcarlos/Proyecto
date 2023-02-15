import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InfoSismosComponent } from './info-sismos/info-sismos.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';


@NgModule({
  declarations: [
   
    InfoSismosComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    HttpClientModule
  ], exports: [
    InfoSismosComponent
  ]
})
export class SismosModule { }
