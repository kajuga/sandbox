package testing.steamAPI;

public class Example {

    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x + " ");
        }
    }
}
