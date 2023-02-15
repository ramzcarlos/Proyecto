import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoDescripcionComponent } from './info-descripcion.component';

describe('InfoDescripcionComponent', () => {
  let component: InfoDescripcionComponent;
  let fixture: ComponentFixture<InfoDescripcionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoDescripcionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InfoDescripcionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
