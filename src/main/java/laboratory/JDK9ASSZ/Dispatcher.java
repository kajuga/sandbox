package laboratory.JDK9ASSZ;

public class Dispatcher {
    public static void main(String[] args) {
        Dispatcher dsp = new Dispatcher();
        System.out.println(dsp.addCount(1, 10));


    }
        public int addCount (int start, int finish) {
            int sum = 0;
            for ( int i = start; i <= finish; i++) {
                if (i%2==0) sum++;
            }
            return sum;

        }

}

