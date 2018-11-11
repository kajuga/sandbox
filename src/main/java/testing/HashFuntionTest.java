package testing;

public class HashFuntionTest {
    public static void main(String[] args) {
        String abn = new String("ABBA");

        //переопределенный хэш стринга
        System.out.println(abn.hashCode());
        System.out.println();
        //идентификационный хеш объекта (не переопределенный)
        System.out.println(System.identityHashCode(abn));
        System.out.println(System.identityHashCode(abn));



    }


}
