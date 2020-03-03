package rmi;

public class ReverseImpl implements Reverse {
    @Override
    public String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
