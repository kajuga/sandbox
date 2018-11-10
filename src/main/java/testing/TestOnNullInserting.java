package testing;

import java.util.*;

public class TestOnNullInserting {
    public static void main(String[] args) {

        //SETz
        Set <Integer> nullHashSet = new HashSet <>();
        System.out.println(nullHashSet.add(null));
        //НИЗЗЯ!!!!
//        Set <Integer> nullTree = new TreeSet <>();
//        System.out.println(nullTree.add(null));
        LinkedHashSet <Integer> nullLinkedHashSet = new LinkedHashSet<>();
        System.out.println(nullLinkedHashSet.add(null));

        //LIST
        List <Integer> nullArrayList = new ArrayList <>();
        System.out.println(nullArrayList.add(null));
        List <Integer> nullLinked = new LinkedList <>();
        System.out.println(nullLinked.add(null));
        System.out.println(nullLinked.add(15));
        System.out.println(nullLinked);

        //STACK
        Stack <Integer> nullStack = new Stack <>();
        System.out.println(nullStack.add(22));
        System.out.println(nullStack.add(null));
        System.out.println(nullStack.pop());
        System.out.println(nullStack.pop());
        System.out.println(nullStack.empty());

        //QUEUE
        PriorityQueue<Integer> nullPriority = new PriorityQueue <>();
        System.out.println(nullPriority.add(1));
        System.out.println(nullPriority.add(4));
//        System.out.println(nullPriority.add(null));
        System.out.println(nullPriority.poll());







    }


}
