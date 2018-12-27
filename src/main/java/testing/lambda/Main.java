package testing.lambda;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        Main main = new Main();
        EqualInterface equalInterface = (x) -> x % 2 == 0;

        System.out.println(summator(arr, equalInterface));
    }

    private static int summator(int[] arr, EqualInterface eq) {
        int result = 0;
        for (int i : arr) {
            if(eq.isEqual(i)) {
                result += i;
            }
        }
        return result;
    }
}



