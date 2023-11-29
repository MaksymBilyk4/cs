package ppj15;

import java.util.Arrays;

// Create and fill (with random values) a two-dimensional rectangular array of int elements.
// Then calculate and display the index of the "row" for which the sum of the elements is the largest and the index of the "column" for which the sum of the elements is the smallest.

public class Task4 {
    public static void main(String[] args) {

        final int matrixLen = (int) (Math.random() * 10 + 1);

        int[][] matrix = new int[matrixLen][matrixLen];

        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
            }
            System.out.println("Array " + (i) + " -> " + Arrays.toString(matrix[i]));
        }


        // row
        int maxSumRowIndex = 0;
        int prevRowSum;
        int rowSum = 0;

        // column
        int minColumnSumIndex = 0;
        int prevColumnSum;
        int columnSum = Integer.MAX_VALUE;

        for (int i = 0; i < matrixLen; i++) {
            prevRowSum = 0;
            prevColumnSum = 0;
            for (int j = 0; j < matrixLen; j++) {
                prevRowSum += matrix[i][j];
                prevColumnSum += matrix[j][i];
            }
            if (prevRowSum > rowSum) {
                rowSum = prevRowSum;
                maxSumRowIndex = i;
            }
            if (prevColumnSum < columnSum) {
                columnSum = prevColumnSum;
                minColumnSumIndex = i;
            }

        }

        System.out.println("Max sum row index: " + maxSumRowIndex);
        System.out.println("Sum of ROW elements -> " + Arrays.toString(matrix[maxSumRowIndex]) + ": " + rowSum);
        System.out.println("---------------------------");
        System.out.println("Min sum column index: " + minColumnSumIndex);
        System.out.println("Sum of COLUMN elements -> " + columnSum);
    }
}
