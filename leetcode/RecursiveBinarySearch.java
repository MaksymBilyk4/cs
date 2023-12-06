import java.util.Arrays;
import java.util.Scanner;

// recursive implementation of binary search
public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }

        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which element's index you would like to know? ");
        int searchNumber = scanner.nextInt();

        int index = binarySearch(arr, 0,  arr.length - 1, searchNumber);
        System.out.println("Element " + searchNumber + " found at index: " + index);
        if (index >= 0) System.out.println(arr[index]);
    }

    static int binarySearch(int[] arr, int start, int end, int searchNumber) {
        if (start <= end) {

            int mid = start + (end - start) / 2;

            if (searchNumber == arr[mid]) {
                return mid;
            } else if (searchNumber > arr[mid]) {
                return binarySearch(arr, mid + 1, end, searchNumber);
            } else if (searchNumber < arr[mid]) {
                return binarySearch(arr, start, mid - 1, searchNumber);
            }
        }

        return -1;
    }


}
