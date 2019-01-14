package PATTERNS.decorator.decorators;

import PATTERNS.decorator.objects.Component;

public abstract class Decorator implements Component {
        protected Component component;
    
    public Decorator (Component component) {
        this.component = component;
    }
    
    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
    public abstract void afterDraw();

}
