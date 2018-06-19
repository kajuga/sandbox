package mybracket;

public class MyBracket {




    private char symbol;

    //объявил поля экземпляра
    private int begin;
    private int end;

    //конструктор-инициализатор.
    public MyBracket(char symbol, int begin) {
        this.symbol = symbol;
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public char getSymbol() {
        return symbol;
    }
}
