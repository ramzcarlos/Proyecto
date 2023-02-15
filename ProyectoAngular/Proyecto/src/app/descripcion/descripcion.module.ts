import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InfoDescripcionComponent } from './info-descripcion/info-descripcion.component';



@NgModule({
  declarations: [
    InfoDescripcionComponent
  ],
  imports: [
    CommonModule
  ], exports: [
    InfoDescripcionComponent
  ]
})
export class DescripcionModule { }
