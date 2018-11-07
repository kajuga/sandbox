package itvdn.professional_2018.lesson_2.queueRealisation;

public class SimpleQueue {
     private int maxSize;
     private long[] queueArray;
     private int front;
     private int rear;
     private int nItems;

    public SimpleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long element) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = element;
        nItems++;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public long remove() {
        long temp = queueArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }
}


class QueueMain {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue(10);
        
        simpleQueue.insert(10);
        simpleQueue.insert(20);
        simpleQueue.insert(30);
        simpleQueue.insert(40);
        simpleQueue.insert(50);
        simpleQueue.insert(60);
        simpleQueue.insert(70);
        simpleQueue.insert(80);
        simpleQueue.insert(90);
        simpleQueue.insert(100);
        simpleQueue.insert(110);
        simpleQueue.insert(120);
        simpleQueue.insert(130);
        simpleQueue.insert(140);
        simpleQueue.insert(150);
        simpleQueue.insert(160);
        simpleQueue.insert(170);
        simpleQueue.insert(180);
        simpleQueue.insert(190);
        while (!simpleQueue.isEmpty()){
            long n = simpleQueue.remove();
            System.out.println(n + " ");
        }


    }


}
