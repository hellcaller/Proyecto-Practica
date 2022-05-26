import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModoVisualComponent } from './modo-visual.component';

describe('ModoVisualComponent', () => {
  let component: ModoVisualComponent;
  let fixture: ComponentFixture<ModoVisualComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModoVisualComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModoVisualComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
