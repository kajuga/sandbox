package laboratory.abstractClass;

public interface Flyable {

    public void fly();
    public default void cly(){
        System.out.println(111);
    }
}