package dynamic_Proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        IPerson personproxy = (IPerson) Proxy.newProxyInstance(Person.class.getClassLoader(),
                Person.class.getInterfaces(),
                new NeverSleepingEye(person));

        personproxy.setName("Гриша");
        String h = personproxy.getName();
        personproxy.rename("Вася");

    }

}
