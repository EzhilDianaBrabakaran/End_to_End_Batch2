import { Component, Input } from '@angular/core';

@Component({
  selector: 'counter',
  styles: [`
    .counter {
      position: relative;
    }
    input {
      border: 0;
      border-radius: 3px;
      height: 30px;
      max-width: 100px;
      text-align: center;
    }
    button {
      outline: 0;
      cursor: pointer;
      height: 30px;
      border: 0;
      border-radius: 3px;
      background: #0088cc;
      color: #fff;
    }
  `],
  templateUrl: './app.countercomponent.html'
})
export class CounterComponent {

  @Input()
  count: number = 0;
  
reset()
{
  this.count=0;
}

  increment() {
    this.count++;
  }
  
  decrement() {
    this.count--;
  }
  
}