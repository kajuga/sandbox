package mybracket;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Позапихивал в названиях префикс "my" - чтобы в коде не путаться, в финале переделаю-уберу, знаю что неправильно.
 */
public class MySortBrackets {
    private final static String SQUARE_BRACKETS = "[]";
    private final static String ROUND_BRACKETS = "()";
    private final static String SQUIGGLY_BRACKETS = "{}";

    public static void main(String[] args) {
        String str = new String("((())s([fd[ss[dd()]da]aa])d{k})");
        System.out.println("The string is: " + str);

        try {
            MySortBrackets mySortBrackets = new MySortBrackets();
            List <MyBracket> brackets = mySortBrackets.myParserBrackets(str);
            for (MyBracket bracket : brackets) {
                System.out.println("Скобка вида " + bracket.getSymbol() + ": " + "нач. позиция = " + bracket.getBegin() + "; " + "кон. позиция = " + bracket.getEnd() + ".");
            }
        } catch (NoValidException e) {
            System.out.println("Строка не валидна");
        }
    }

    public List <MyBracket> myParserBrackets(String string) throws NoValidException {
        char[] symbols = string.toCharArray();
        Stack <MyBracket> stackSquare = new Stack <>();
        Stack <MyBracket> stackSquiggly = new Stack <>();
        Stack <MyBracket> stackRound = new Stack <>();
        List <MyBracket> result = new ArrayList <>();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '[') {
                MyBracket myBracket = new MyBracket(SQUARE_BRACKETS, i);
                stackSquare.push(myBracket);
            } else if (symbols[i] == ']' && stackSquare.empty()) {
                throw new NoValidException();
            } else if (symbols[i] == ']' && !stackSquare.empty()) {
                MyBracket endSquare = stackSquare.pop();
                if (endSquare != null && endSquare.getSymbol().equals(SQUARE_BRACKETS)) {
                    endSquare.setEnd(i);
                    result.add(endSquare);
                }
            }
            if (symbols[i] == '(') {
                MyBracket myBracket = new MyBracket(ROUND_BRACKETS, i);
                stackRound.push(myBracket);
            } else if (symbols[i] == ')' && stackRound.empty()) {
                throw new NoValidException();
            } else if (symbols[i] == ')' && !stackRound.empty()) {
                MyBracket endRound = stackRound.pop();
                if (endRound != null && endRound.getSymbol().equals(ROUND_BRACKETS)) {
                    endRound.setEnd(i);
                    result.add(endRound);
                }
            }
            if (symbols[i] == '{') {
                MyBracket myBracket = new MyBracket(SQUIGGLY_BRACKETS, i);
                stackSquiggly.push(myBracket);
            } else if (symbols[i] == '}' && stackSquiggly.empty()) {
                throw new NoValidException();
            } else if (symbols[i] == '}' && !stackSquiggly.empty()) {
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
        if (stackRound.size() != 0) {
            throw new NoValidException();
        }
        if (stackSquiggly.size() != 0) {
            throw new NoValidException();
        }
        return result;
    }
}








