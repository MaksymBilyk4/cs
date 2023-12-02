package ppj16;


import java.util.Arrays;

// Write a program that creates a two-dimensional rectangular array of int elements, then zeros all rows and columns that contain at least one occurrence of the value zero (0).
// No more than 2 additional one-dimensional arrays are allowed.
public class Task2 {
    public static void main(String[] args) {

        int length = 4;

        int[][] matrix = new int[length][length];
        int[][] columnZeroMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);

            }
            System.out.println("Matrix element " + i + ": " + Arrays.toString(matrix[i]));
        }

        System.out.println();

        // fill columnZeroMatrix
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                if (matrix[k][i] == 0) {
                    for (int x = 0; x < length; x++) {
                        columnZeroMatrix[x][i] = 0;
                    }
                    break;
                    // i = 3, k = 0
                }else {
                    columnZeroMatrix[k][i] = matrix[k][i];
                }
            }
        }

        System.out.println("COLUMNS ZERO: ");
        for (int[] ints : columnZeroMatrix) {
            System.out.println(Arrays.toString(ints)
            );
        }

        System.out.println();

        // fill existing array rows with zero
        for (int i = 0; i < length; i++) {

            // rows
            for (int k = 0; k < length; k++) {
                if (matrix[i][k] == 0) {
                    for (int x = 0; x < length; x++) {
                        matrix[i][x] = 0;
                    }
                    break;
                }
            }
        }

        System.out.println("ROWS ZERO");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints)
            );
        }

        System.out.println();
        System.out.println("COMBINED");
        int[][] combinedZeros = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                if (matrix[i][k] == 0 || columnZeroMatrix[i][k] == 0) {
                    combinedZeros[i][k] = 0;
                } else {
                    combinedZeros[i][k] = matrix[i][k];
                }
            }
            System.out.println(Arrays.toString(combinedZeros[i]));
        }
    }
}
