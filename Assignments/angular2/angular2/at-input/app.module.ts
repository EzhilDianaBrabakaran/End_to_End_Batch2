import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { CounterComponent } from './counter.component';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    CounterComponent
  ],
  imports: [ BrowserModule,FormsModule ],
  bootstrap: [ AppComponent ]
})
export class AppModule {}