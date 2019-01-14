package PATTERNS.decorator.decorators;

import PATTERNS.decorator.objects.Button;
import PATTERNS.decorator.objects.Component;
import PATTERNS.decorator.objects.TextView;
import PATTERNS.decorator.objects.Window;

public class Start {

    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {


        boolean showBorder = true;

        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }
        window.draw();
        textView.draw();
        button.draw();


    }

}
