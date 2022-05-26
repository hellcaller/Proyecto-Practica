import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModoAuditivoComponent } from './modo-auditivo.component';

describe('ModoAuditivoComponent', () => {
  let component: ModoAuditivoComponent;
  let fixture: ComponentFixture<ModoAuditivoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModoAuditivoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModoAuditivoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
