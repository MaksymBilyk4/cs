import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 1, 5, 10, 8, 2};
        bubbleSort(arr);
        System.out.println("Sorted -> " + Arrays.toString(arr));
    }

    public static void bubbleSort (int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
