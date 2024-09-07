import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZoomArticleComponent } from './zoom-article.component';

describe('ZoomArticleComponent', () => {
  let component: ZoomArticleComponent;
  let fixture: ComponentFixture<ZoomArticleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZoomArticleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ZoomArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
