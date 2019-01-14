package PATTERNS.decorator.decorators;

import PATTERNS.decorator.objects.Button;
import PATTERNS.decorator.objects.Component;
import PATTERNS.decorator.objects.TextView;
import PATTERNS.decorator.objects.Window;

public abstract class Decorator implements Component {
    
    protected Component component;
    
    public Decorator (Component component) {
        this.component = component;
    }
    
    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
    
}
