package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Compaarator_Comparable {

    public static void main(String[] args) {

        Set <Human> humanSet = new TreeSet <>();
        humanSet.add(new Human(12));
        humanSet.add(new Human(22));
        humanSet.add(new Human(2));
//        Collections collections = new Collections();


    }


    public static class Human{
        private int age;

        public Human(int i) {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}
