package testing.THRASH_TESTING_HERE;


/**
 * Тестовый хуман
 */
public class Human implements Comparable<Human> {
    private String name;
    private int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Human human) {
        return name.compareTo(human.name);
    }

    @Override
    public String toString() {
        return "Human name: " + name + ", " + "age: " + age + ".";
    }
}
