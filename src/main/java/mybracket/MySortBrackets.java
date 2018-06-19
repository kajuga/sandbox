package mybracket;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Позапихивал в названиях префикс "my" - чтобы в коде не путаться, в финале переделаю-уберу, знаю что неправильно.
 */
public class MySortBrackets {
    private final static String SQUARE_BRACKETS = "[]";
    private final static String SQUIGGLY_BRACKETS = "{}";
    private final static String ROUND_BRACKETS = "()";


    public static void main(String[] args) {
        //моя строка
        String str = new String("{()s(][fd[ss[dd]da]aa])d}k");
        System.out.println(str);
        MySortBrackets mySortBrackets = new MySortBrackets();
        try {
            List <MyBracket> brackets = mySortBrackets.myParserBrackets(str);
            for (MyBracket bracket : brackets) {
                System.out.println("Скобка вида " + bracket.getSymbol() + ": " + "нач. позиция = " + bracket.getBegin() + "; " + "кон. позиция = " + bracket.getEnd() + ".");
            }
        } catch (NoValidException e) {
            System.out.println("Строка не валидна");
        }
    }

    public List <MyBracket> myParserBrackets(String string) throws NoValidException {
        //строку в массив чаров перевел
        char[] symbols = string.toCharArray();
        //объявил стак, который будет хранить мои скобки
        Stack <MyBracket> stackSquare = new Stack <>();
        Stack <MyBracket> stackSquiggly = new Stack <>();
        Stack <MyBracket> stackRound = new Stack <>();
        //объявил массив для готовых скобок.
        List <MyBracket> result = new ArrayList <>();
        for (int i = 0; i < symbols.length; i++) {
            //если символ '[' - то пушится в стек
            if (symbols[i] == '[') {
                MyBracket myBracket = new MyBracket(SQUARE_BRACKETS, i);
                stackSquare.push(myBracket);
            }
            //после if, если следующий символ в цикле не '['  - то перескакиваем сюда и ищем обратную скобку ']'
            //допилил обход ошибки пустого стека!
            else if (symbols[i] == ']' && !stackSquare.empty()) {
                MyBracket endSquare = stackSquare.pop();
                if (endSquare != null && endSquare.getSymbol().equals(SQUARE_BRACKETS)) {
                    endSquare.setEnd(i);
                    result.add(endSquare);
                }
            }
            //если символ '(' - то пушится в стек
            if (symbols[i] == '('){
                MyBracket myBracket = new MyBracket(ROUND_BRACKETS, i);
                stackRound.push(myBracket);
            }
            else if (symbols[i] == ')' && stackRound.size() != 0) {
                MyBracket endRound = stackRound.pop();
                if (endRound != null && endRound.getSymbol().equals(ROUND_BRACKETS)) {
                    endRound.setEnd(i);
                    result.add(endRound);
                }
            }
            //если символ '{' - то пушится в стек
            if (symbols[i] == '{'){
                MyBracket myBracket = new MyBracket(SQUIGGLY_BRACKETS, i);
                stackSquiggly.push(myBracket);
            }
            else if (symbols[i] == '}' && stackSquiggly.size() != 0) {
                MyBracket endSquiggly = stackSquiggly.pop();
                if (endSquiggly != null && endSquiggly.getSymbol().equals(SQUIGGLY_BRACKETS)) {
                    endSquiggly.setEnd(i);
                    result.add(endSquiggly);
                }
            }
        }
        if (stackSquare.size() != 0) {
            throw new NoValidException();
        }
        return result;
    }
}








