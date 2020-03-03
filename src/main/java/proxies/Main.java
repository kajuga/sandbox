package proxies;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Man vasya = new Man("Vasya", 40, "Moscow", "Russia");
        //get classloader
        ClassLoader vasyaClassLoader = vasya.getClass().getClassLoader();

        //get all interfaces
        Class[] vacyaInterfaces = vasya.getClass().getInterfaces();

        //create proxy of my vasya
        Person proxyvasya = (Person) Proxy.newProxyInstance(vasyaClassLoader, vacyaInterfaces, new PersonInvocationHandler(vasya));

        proxyvasya.introduce(vasya.getName());

    }
}
