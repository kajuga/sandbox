package itvdn.professional_2018.lesson_2.SimpleStack;

public class SimpleStack {

    private  int maxSize;
    private long[] stackArray;
    private int top;


    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    //возвращает, удаляя
    public long pop() {
        return stackArray[top--];

    }

    //возвращает не удаляя элемент свержины, по аналогии с реализацией самого стека
    public long peek() {
        return stackArray[top];
    }
}
 class StackMain {
     public static void main(String[] args) {
         SimpleStack simpleStack = new SimpleStack(10);
         simpleStack.push(10);
         simpleStack.push(20);
         simpleStack.push(30);
         simpleStack.pop();
         System.out.println(simpleStack.peek());
     }

 }


