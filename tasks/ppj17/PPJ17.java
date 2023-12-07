package ppj17;

import java.util.Arrays;

public class PPJ17 {

    public static void main(String[] args) {

        // 1
        show(10);
        System.out.println();

        // 2
        int val = 5;
        System.out.println("Before modifyValue() ---> " + val);
        modifyValue(val);
        System.out.println("After modifyValue() ---> " + val);

        System.out.println();

        // 3
        System.out.println("Task 3. ---> " + findMax(110, 15, 12));
        System.out.println();

        // 4
        System.out.println("Task 4. ---->\n" + Arrays.toString(splitToDigitsArr(2895)));
        System.out.println();

        // 5
        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8},
                {9, 10}
        };
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10}
        };

        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        System.out.println("Task 5 (result 1). ----> " + isMatrixEquals(matrix1, matrix2));
        System.out.println("Task 5 (result 2). ----> " + isMatrixEquals(mat1, mat2));

        // 6
        char[] chars = {'a', 'l', 'a', 'm', 'a', 'k', 'o', 't', 'a'};
        charInArrCount(chars);
    }

    static void show(int val) {
        System.out.println("Task 1. Value ---> " + val);
    }

    static void modifyValue(int val) {
        System.out.println("Task 2. Argument of method ---> " + val);
        val = val * 5;
        System.out.println("Task 2. Modified argument ---> " + val);
    }

    static int findMax(int v1, int v2, int v3) {
        if (v1 > v2 && v1 > v3) return v1;
        if (v2 > v1 && v2 > v3) return v2;
        return v3;
    }

    static int[] splitToDigits(int digit) {
        int[] digitsArr = new int[String.valueOf(digit).length()];

        for (int i = 0; i < digitsArr.length; i++)
            digitsArr[i] = Integer.parseInt(String.valueOf(String.valueOf(digit).charAt(i)));

        return digitsArr;
    }

    static int[] splitToDigitsArr(int digit) {
        int digitsCount = 0;
        int digitCopy = digit;

        while (digitCopy != 0) {
            digitCopy /= 10;
            digitsCount++;
        }

        int[] digitsArr = new int[digitsCount];

        for (int i = digitsCount - 1; i >= 0; i--) {
            digitsArr[i] = digit % 10;
            digit /= 10;
        }

        return digitsArr;
    }


    static boolean isMatrixEquals(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) return false;

        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }

            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


    static int charInArrCount(char[] vector, char foundElement) {
        int charCount = 0;

        for (char el : vector) {
            charCount += foundElement == el ? 1 : 0;
        }

        return charCount;
    }

    static void charInArrCount(char[] vector) {
        int[] charCounts = new int[256];

        for (char ch : vector) {
            charCounts[ch]++;
        }

        System.out.println(Arrays.toString(charCounts));

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println("'" + (char) i + "': " + charCounts[i] + " times");
            }
        }
    }
}
