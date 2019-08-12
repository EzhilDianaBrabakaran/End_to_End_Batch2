import { Directive, ElementRef, Renderer, AfterViewInit,HostListener } from '@angular/core';

@Directive({ 
     selector: '[cpDefaultTheme]' 
})
export class CPDefaultThemeDirective implements AfterViewInit {
    constructor(private renderer: Renderer, private elRef: ElementRef) {
    }

    ngAfterViewInit(): void {
       this.elRef.nativeElement.style.color = 'blue';
       this.elRef.nativeElement.style.fontSize = '20px';
    }		


// Event listeners for element hosting
  // the directive
    @HostListener('mouseenter') onMouseEnter() {
        this.hover(true);
    }

    @HostListener('mouseleave') onMouseLeave() {
        this.hover(false);
    }
  // Event method to be called on mouse enter and on mouse leave
    hover(shouldUnderline: boolean){
        if(shouldUnderline){
        // Mouse enter   
this.renderer.setElementStyle(this.elRef.nativeElement, 'font-style', 'italic');
        } else {
    // Mouse leave    
    this.renderer.setElementStyle(this.elRef.nativeElement, 'font-style', 'bold');       
this.renderer.setElementStyle(this.elRef.nativeElement, 'text-decoration', 'underline');
        }
    }

} 