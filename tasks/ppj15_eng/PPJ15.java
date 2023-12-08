package ppj15_eng;

import java.util.Arrays;

public class PPJ15 {
    public static void main(String[] args) {

        // 1
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray(vector);
        printArray(matrix);

        System.out.println();

        // 2
        int val = 5;
        System.out.println("Before modifyValue() ---> " + val);
        modifyValue(val);
        System.out.println("After modifyValue() ---> " + val);

        // 3
        System.out.println();
        System.out.println("Random from 0 to 10 ---> " + getRandom(10));
        System.out.println("Random from 15 to 25 ---> " + getRandom(15, 25));
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void printArray(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    static void modifyValue(int val) {
        System.out.println("Argument of method ---> " + val);
        val = val * 5;
        System.out.println("Modified argument ---> " + val);
    }

    static int getRandom(int n) {
        return (int)(Math.random() * (n + 1));
    }

    static int getRandom (int min, int max) {
        return min + ((int) (Math.random() * (max - min) + 1));
    }

    static String getOddsAndEvens (int[][] matrix) {



        return  "";
    }
}
