import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-wiki',
  templateUrl: './wiki.component.html',
  styleUrls: ['./wiki.component.css']
})
export class WikiComponent implements OnInit {

  public secciones: Array<string> = ['analisis de complejidad ', 'Diseño', ];
  constructor() { }

  ngOnInit(): void {
  }

}
