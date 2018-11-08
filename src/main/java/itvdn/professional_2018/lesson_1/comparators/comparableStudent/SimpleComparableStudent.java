package itvdn.professional_2018.lesson_1.comparators.comparableStudent;

import java.util.Arrays;

public class SimpleComparableStudent implements Comparable{
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparableStudent)o).group) {
            return 1;
        }
        if (this.group < ((SimpleComparableStudent)o).group) {
            return -1;
        }
        else {
            return 0;
        }

    }
}

    class Main {
    public static void main(String[] args) {
         SimpleComparableStudent[] myStudents = {
                 new SimpleComparableStudent("Evgen", 333),
                 new SimpleComparableStudent("Aaron", 1233),
                 new SimpleComparableStudent("Caya", 62233),
                 new SimpleComparableStudent("Deryl", 432)};

        Arrays.sort(myStudents);
        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }

}
