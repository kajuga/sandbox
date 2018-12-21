package testing.THRASH_TESTING_HERE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QickIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList <>();
        list.add("Bbob");
        list.add("Aux");
        list.add("Zodo");
        list.add("Frodo");
        list.add("Bbob");
        for (String s : list) {
            System.out.println(s);
        }

        ArrayList<Human> humanList = new ArrayList <>();
        humanList.add(new Human("Botox", 14));
        humanList.add(new Human("Abraox", 22));
        humanList.add(new Human("Zeox", 4));
        humanList.add(new Human("Kolox", 56));
        System.out.println(humanList.get(0));
        for (int i = 0; i < humanList.size(); i++) {
            System.out.println(humanList.get(i));
        }

        for (Human human : humanList) {
            System.out.println(human);
        }


        Iterator <Human> iterator = humanList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }





    }


}
