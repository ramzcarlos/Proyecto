import { TestBed } from '@angular/core/testing';

import { SpectroService } from './spectro.service';

describe('SpectroService', () => {
  let service: SpectroService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SpectroService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
