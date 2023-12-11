import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 4, 5, 10, 2, 11, -5};

        System.out.println("Before sort" + Arrays.toString(arr));
        System.out.println();
        System.out.println("After sort" + Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        int[] sorted = new int[arr.length];
        int[] copy = Arrays.copyOf(arr, arr.length);
        int min;

        for (int i = 0; i < arr.length; i++) {
            min = findMin(copy);
            sorted[i] = min;
            copy = delete(copy, min);
        }

        return sorted;
    }

    public static int findMin (int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }

        return smallest;
    }


    public static int[] delete(int arr[], int val) {
        if (search(arr, val) == -1) {
            System.out.println("Cannot find element with value " + val);
            return arr;
        }

        int valIndex = search(arr, val);
        int[] copy = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (i == valIndex) break;
            copy[i] = arr[i];
        }
        for (int i = valIndex; i < copy.length; i++) {
            copy[i] = arr[i + 1];
        }

        return copy;
    };

    public static int search(int[] arr, int val) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                index = i;
                break;
            }
        }

        return index;
    }

}
