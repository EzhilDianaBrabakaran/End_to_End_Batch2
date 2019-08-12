import { Directive, ElementRef, Renderer, AfterViewInit,HostListener } from '@angular/core';

@Directive({ 
     selector: '[cpMyTheme]' 
})
export class CPMyThemeDirective implements AfterViewInit {
    constructor(private renderer: Renderer, private elRef: ElementRef) {
    }

    ngAfterViewInit(): void {
       this.elRef.nativeElement.style.padding = '10px';
       /*this.elRef.nativeElement.style.borderSize = '2px';
       this.elRef.nativeElement.style.borderColor = 'yellow';
       */
      this.elRef.nativeElement.style.border = '2px dotted orange';
    }		

/*
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
this.renderer.setElementStyle(this.elRef.nativeElement, 'text-decoration', 'underline');
        } else {
    // Mouse leave           
this.renderer.setElementStyle(this.elRef.nativeElement, 'text-decoration', 'none');
        }
    }
*/
} 