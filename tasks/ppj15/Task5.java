package ppj15;

import java.util.Arrays;

// Prepare a rectangular array (with random natural positive dimensions) of int variables and fill it with random values from the interval [0,10).
// Display the largest value of the row with the largest sum of elements and the smallest value of the column with the smallest sum of elements.
public class Task5 {
    public static void main(String[] args) {
        final int matrixSize = (int) (Math.random() * 10 + 1);
        int[][] matrix = new int[matrixSize][matrixSize];

        System.out.println();
        System.out.println("Radnom generated matrix length ---> " + matrixSize);

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }

            System.out.println("Matrix index: " + i + " -> " + Arrays.toString(matrix[i]));
        }

        // row
        int prevRowSum;
        int maxRowSum = 0;
        int maxSumRowIndex = 0;

        // column
        int prevColumnSum;
        int minColumnSum = Integer.MAX_VALUE;
        int minSumColumnIndex = 0;

        for (int i = 0; i < matrixSize; i++) {
            prevRowSum = 0;
            prevColumnSum = 0 ;

            for (int k = 0; k < matrixSize; k++) {
                prevRowSum += matrix[i][k];
                prevColumnSum += matrix[k][i];
            }
            if (prevRowSum > maxRowSum) {
                maxRowSum = prevRowSum;
                maxSumRowIndex = i;
            }
            if (prevColumnSum < minColumnSum) {
                minColumnSum = prevColumnSum;
                minSumColumnIndex = i;
            }
        }

        System.out.println("---------------------------");
        System.out.println("Max sum row index: " + maxSumRowIndex);
        System.out.println("Sum of ROW elements -> " + Arrays.toString(matrix[maxSumRowIndex]) + ": " + maxRowSum);
        System.out.println("---------------------------");
        System.out.println("Min sum column index: " + minSumColumnIndex);
        System.out.println("Sum of COLUMN elements -> " + minColumnSum);

        int[] minColumnArray = new int[matrixSize];
        int minEl = Integer.MAX_VALUE;
        for (int i = 0; i < matrixSize; i++) {
            minColumnArray[i] = matrix[i][minSumColumnIndex];
            if (matrix[i][minSumColumnIndex] < minEl) {
                minEl = matrix[i][minSumColumnIndex];
            }
        }
        System.out.println("Min column array ---> " + Arrays.toString(minColumnArray));

        int maxEl = matrix[maxSumRowIndex][0];

        for (int i = 1; i < matrixSize; i++) {
            if (matrix[maxSumRowIndex][i] > maxEl) {
                maxEl = matrix[maxSumRowIndex][i];
            }
        }

        System.out.println("---------------------------");
        System.out.println("Max ROW element -> " + maxEl);
        System.out.println("Min COLUMN element -> " + minEl);

    }
}
