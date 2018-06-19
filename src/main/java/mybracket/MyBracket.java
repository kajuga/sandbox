package mybracket;

public class MyBracket {




    private String symbol;

    //объявил поля экземпляра
    private int begin;
    private int end;

    //конструктор-инициализатор.
    public MyBracket(String symbol, int begin) {
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

    public String getSymbol() {
        return symbol;
    }
}
