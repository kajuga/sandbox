package mybracket;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //моя строка
        String str = new String("[fd[ss[dd]da]aa]");
        Main main = new Main();
        try {
            List<MyBracket> brackets = main.parser(str);
            for (MyBracket bracket : brackets) {
                System.out.println(bracket.getBegin() + " " + bracket.getEnd());
            }

        } catch (NoValidException e) {
            System.out.println("Строка не валидна");
        }

    }


    public  List<MyBracket> parser (String string) throws NoValidException {
        //строку в массив чаров перевел
        char[] symbols = string.toCharArray();

        //объявил стак, который будет хранить мои скобки
        Stack <MyBracket> stack = new Stack <>();

        //объявил массив для готовых скобок.
        List <MyBracket> result = new ArrayList <>();

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '['){
                MyBracket myBracket = new MyBracket('[', i);
                stack.push(myBracket);
            }
            else if (symbols[i] == ']') {
                MyBracket endElement = stack.pop();
                if (endElement != null && endElement.getSymbol() == '[') {
                    endElement.setEnd(i);
                    result.add(endElement);
                }
            }


        }
        if (stack.size() != 0){
            throw new NoValidException();
        }
        return result;
    }
}








