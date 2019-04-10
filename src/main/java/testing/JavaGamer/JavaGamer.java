package testing.JavaGamer;

public class JavaGamer
{
    public static void main(String args[])
    {
        int[] day= new int[] { 1, 2, 52234123 };

        System.out.println("Вы играете уже " + day[0] + " " + declension(day[0]));
        System.out.println("Вы играете уже " + day[1] + " " + declension(day[1]));
        System.out.println("Вы играете уже " + day[2] + " " + declension(day[2]));
    }

    public static String declension(int count)
    {
        String one = "день";
        String two = "дня";
        String five = "дней";

        if(count > 100)
            count %= 100;

        if(count > 20)
            count %= 10;

        switch(count)
        {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }
}