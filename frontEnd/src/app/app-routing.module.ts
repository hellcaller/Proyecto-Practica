import { NgModule } from '@angular/core';
import { Routes, RouterModule, ExtraOptions } from '@angular/router';
import { AlumnosComponent } from './components/alumnos/alumnos.component';
import { CursosComponent } from './components/cursos/cursos.component';
import { ExamenesComponent } from './components/examenes/examenes.component';
import { AlumnosFormComponent } from './components/alumnos/alumnos-form.component';
import { CursoFormComponent } from './components/cursos/curso-form.component';
import { ExamenFormComponent } from './components/examenes/examen-form.component';
import { AsignarAlumnosComponent } from './components/cursos/asignar-alumnos.component';
import { AsignarExamenesComponent } from './components/cursos/asignar-examenes.component';
import { ResponderExamenComponent } from './components/alumnos/responder-examen.component';
import { MaterialComponent } from './components/material/material.component';
import { AnalisisComponent } from './components/analisis/analisis.component';

import { WikiComponent } from './components/wiki/wiki.component';
import { BrowserModule } from '@angular/platform-browser';
import { LoginComponent } from './components/auth/login/login.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { QuestionComponent } from './components/question/question.component';
import { Question2Component } from './components/questions2/questions2.component';
import { ModoAuditivoComponent } from './components/modo-auditivo/modo-auditivo.component';
import { ModoVisualComponent } from './components/modo-visual/modo-visual.component';

const routerOptions: ExtraOptions = {
  anchorScrolling: "enabled",
  scrollPositionRestoration: 'enabled'
}
const routes: Routes = [

  {path: 'alumnos', component: AlumnosComponent},
  {path: 'alumnos/form', component: AlumnosFormComponent},
  {path: 'alumnos/form/:id', component: AlumnosFormComponent},
  {path: 'alumnos/responder-examen/:id', component: ResponderExamenComponent},
  {path: 'cursos', component: CursosComponent},
  {path: 'cursos/form', component: CursoFormComponent},
  {path: 'cursos/form/:id', component: CursoFormComponent},
  {path: 'examenes', component: ExamenesComponent},
  {path: 'examenes/form', component: ExamenFormComponent},
  {path: 'examenes/form/:id', component: ExamenFormComponent},
  {path: 'cursos/asignar-alumnos/:id', component: AsignarAlumnosComponent},
  {path: 'cursos/asignar-examenes/:id', component: AsignarExamenesComponent},
  {path: 'mate', component: MaterialComponent},
  {path: 'ana', component:AnalisisComponent},
  {path: 'wiki', component:WikiComponent},
  {path: 'login', component:LoginComponent},
  { path: "", redirectTo: "welcome", pathMatch: "full" },
  { path: "welcome", component: WelcomeComponent },
  { path: "question", component: QuestionComponent },
  { path: "question2", component: Question2Component },
  { path: "auditivo", component: ModoAuditivoComponent },
  { path: "visual", component: ModoVisualComponent },
];




@NgModule({
  imports: [BrowserModule,RouterModule.forRoot(routes,routerOptions)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
