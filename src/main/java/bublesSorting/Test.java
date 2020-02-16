package bublesSorting;

public class Test {
    public static void main(String[] args) {

        int[] num = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        int n = num.length;

        bubbleSort(num);

        for (int h = 0; h < n; h++)
            System.out.print(num[h] + " ");
    }

    static  void bubbleSort (int[] numbers) {

        int n = numbers.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if(numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j -1] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
    }
}

