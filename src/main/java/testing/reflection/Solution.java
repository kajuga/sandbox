//package testing.reflection;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//
//public class Solution {
//
//
//
//
//    public static void main(String[] args) throws InterruptedException {
////        MyClass myBase = new MyClass();
//        myBase.setName("SASHOK");
//        myBase.setNumber(666);
//
//
////        MyClass myClass = new MyClass();
//        int number = myBase.getNumber();
//        String name = null; //no getter =(
//        System.out.println(number + " " +  name);//output 0null
//        try {
//            Field field = myBase.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            name = (String) field.get(myBase);
//            Thread.sleep(500);
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(number + " " +  name);//output 0default
//        try {
//            Field field = myBase.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            field.set(myBase, "newSASHOK");
////            name = (String) field.get(myBase);
//
//            System.out.println("new value of name: " + (String) field.get(myBase));
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.print("private method from myBase: ");
//        printData(myBase);// output 0new value
//        //so if me private method has a prameters
//        MyClass myClass = null;
//        try {
//            Class clazz = Class.forName(MyClass.class.getName());
//            myClass = (MyClass) clazz.newInstance();
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(myClass);//output created object reflection.MyClass@60e53b93
//
//
//
//    }
//
//    public static void printData(Object myClass){
//        try {
//            Method method = myClass.getClass().getDeclaredMethod("printData");
//            method.setAccessible(true);
//            method.invoke(myClass);
////            method.invoke(myClass, args); - add arguments
//        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
