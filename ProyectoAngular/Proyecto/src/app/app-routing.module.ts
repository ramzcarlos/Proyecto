import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InfoDescripcionComponent } from './descripcion/info-descripcion/info-descripcion.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { InfoSismosComponent } from './sismos/info-sismos/info-sismos.component';
import { AuthGuard } from './guards/auth.guard';
const routes: Routes = [

  {path: "sismos", component: InfoSismosComponent},
  {path: "descripcion", component: InfoDescripcionComponent, canActivate:[AuthGuard]},
  {path: "", redirectTo: '/descripcion', pathMatch: 'full'},
  {path: '**', component: NotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
