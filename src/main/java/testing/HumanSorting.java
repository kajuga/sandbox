package testing;

import java.util.*;

public class HumanSorting {

    public static void main(String[] args) {
        Human human1 = new Human("Serg", 23);
        Human human2 = new Human("Alex", 44);
        Human human3 = new Human("Yndex", 13);
        Human human4 = new Human("Beeline", 66);
        Human human5 = new Human("Zed", 5);

        List<Human> humanList = new ArrayList <>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);

        //сортировка по имени, заданная в классе хуман
        Collections.sort(humanList);
        for (Human human : humanList) {
            System.out.print(human + " ");
        }
        System.out.println();

        //задаю сортировку через компаратор - по возрасту
        Collections.sort(humanList, new Comparator <Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Human human : humanList) {
            System.out.print(human + " ");
        }
    }
}
