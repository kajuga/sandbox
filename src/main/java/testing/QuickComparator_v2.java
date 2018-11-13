package testing;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class QuickComparator_v2 {

    public static void main(String[] args) {
        StudentComparator sc = new StudentComparator();
        Student s1 = new Student("Vova", 23);
        Student s2 = new Student("Abba", 233);
        Student s4 = new Student("Iona", 33);
        Student s5 = new Student("Bercut", 53);
        Student s3 = new Student("Zoya", 13);

        Set<Student> studentSet = new TreeSet <>(sc);
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s3);

        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare (Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}




    class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}