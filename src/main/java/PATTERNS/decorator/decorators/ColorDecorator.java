
package PATTERNS.decorator.decorators;

import PATTERNS.decorator.objects.Button;
import PATTERNS.decorator.objects.Component;
import PATTERNS.decorator.objects.TextView;
import PATTERNS.decorator.objects.Window;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }

}
