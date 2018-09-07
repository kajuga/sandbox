package testing;

/**
 * РЕАЛИЗАЦИЯ ПОСТРОЧНОГО ПЕРЕНОСА
 I
 am
 a
 boy
 */


public class StringExercise {
    public static void main(String[] args) {
        System.out.println("I\nam\na\nboy");
        System.out.printf("I %n am %n a %n boy");

//        System.out.println("I am a boy".replaceAll("\\s+","\n"));
//        System.out.println("I am a boy".replaceAll("\\s+",System.getProperty("line.separator"))); // portable way
    }
}
