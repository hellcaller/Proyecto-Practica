import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth-service.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {



  autenticacion: any = { email: '', password: '' }

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  autenticar() {
    console.log(' Evento autenticar ', this.autenticacion);

    this.authService.login(this.autenticacion).subscribe(resultado => {

      if (resultado.message == 'Te has autenticado correctamente') {
        localStorage.setItem('token', resultado.token);
        localStorage.setItem('id_user', resultado.id_user);
        this.router.navigate(['dashboard']);
      } else {
        if (resultado.message == 'firstLogin') {
          localStorage.setItem('user', resultado.user);
          this.router.navigate(['reset-pass-ext']);
        }
      }


    },
      error => {
        console.log(JSON.stringify(error));

      });

  }




}
