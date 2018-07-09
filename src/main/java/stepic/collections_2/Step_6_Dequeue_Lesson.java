package stepic.collections_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Step_6_Dequeue_Lesson {

    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        System.out.println("states.add(\"Germany\") -  " + states);
        states.add("France");
        System.out.println(states);
        states.push("UK");
        System.out.println(states);
        states.offerLast("Norway");
        System.out.println(states);

        String sFirst = states.pop();
        System.out.println("states.pop() - " + states);
        String s = states.peek();
        System.out.println("states.peek() - " + states);

        String sLast = states.peekLast();
        System.out.println("states.peekLast() - " + states);

        states.offer(sFirst);
        String s1 = states.pollLast();

        while (states.peek() != null) {
            System.out.print(states.pop());
        }

    }
}
