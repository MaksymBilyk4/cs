package array;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("ADD START ---> " + Arrays.toString(addStart(array, 20)));
        System.out.println("ADD END ---> " + Arrays.toString(addEnd(array, 1111)));
        System.out.println("INSERT AFTER ---> " + Arrays.toString(insertAfter(array, 4, 111)));
        System.out.println("SEARCH ---> " + search(array, 10));
        System.out.println("DELETE ---> " + Arrays.toString(delete(array, 5)));
        replace(array, 5, 1111);
        System.out.println("REPLACE ---> " + Arrays.toString(array));
    }

    public static int[] addStart(int[] arr, int element) {
        int[] copy = new int[arr.length + 1];

        copy[0] = element;

        for (int i = 0; i < arr.length; i++) copy[i + 1] = arr[i];


        return copy;
    }

    public static int[] addEnd(int[] arr, int element) {
        int[] copy = new int[arr.length + 1];
        copy[copy.length - 1] = element;

        for (int i = 0; i < arr.length; i++) copy[i] = arr[i];

        return copy;
    }

    public static int[] insertAfter(int[] arr, int posAfter, int value) {
        if (posAfter == arr.length - 1) return addEnd(arr, value);

        int[] clone = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) clone[i] = arr[i];

        int tmp;
        int current = clone[posAfter];
        for (int i = posAfter; i < clone.length - 1; i++) {
            tmp = clone[i + 1];
            clone[i + 1] = current;
            current = tmp;
        }

        clone[posAfter] = value;

        return clone;
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

    public static void replace(int[] arr, int oldVal, int newVal) {
        int index = search(arr, oldVal);
        if (index == -1) return;
        arr[index] = newVal;
    }
}
