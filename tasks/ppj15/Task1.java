package ppj15;
import java.util.Arrays;

// I. Create three random-sized arrays of int variables and fill them with random values.
// Then create an array whose elements will be the previously prepared arrays.
// Display all drawn values using the created two-dimensional array.

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = new int[(int) (Math.random() * 10 + 1)];
        int[] arr2 = new int[(int) (Math.random() * 10 + 1)];
        int[] arr3 = new int[(int) (Math.random() * 10 + 1)];

        int[][] matrix = {arr1, arr2, arr3};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 21);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Sub array number " + (i + 1) + ": " + Arrays.toString(matrix[i]));
        }
    }
}
