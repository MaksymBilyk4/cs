package ppj16;


import java.util.Arrays;

//Write a program that will create (and display to the console) a one-dimensional array
//containing all the elements contained in the two-dimensional array tab.
public class Task1 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int vectorLength = 0;

        for (int i = 0; i < matrix.length; i++) {
            vectorLength += matrix[i].length;
        }

        int[] vector = new int[vectorLength];
        int prevIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                vector[prevIndex] = matrix[i][k];
                prevIndex++;
            }
        }

        System.out.println("Transformed matrix in one-dimensional array -> " + Arrays.toString(vector));
    }
}
