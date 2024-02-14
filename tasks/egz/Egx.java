package egz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

class Egx {
    public static void main(String[] args) {
//        int[] values = {0b11111111, 0401, 517, 0x201}; // 255, 257, 517, 513 в десятичной форме

//        int sum = 0;
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(i + 1 + ". Number: " + values[i]);
//            sum += values[i];
//        }

//        System.out.println("Sum of numbers: " + Integer.toBinaryString(sum));

        // Запись значений в файл
//        try (FileOutputStream fos = new FileOutputStream("ints.bin")) {
//            for (int value : values) {
//                fos.write(value); // Запись 1 байта каждого значения
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileInputStream fis = new FileInputStream("ints.bin")) {

//            System.out.println(Arrays.toString(fis.readAllBytes()));

//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        int[][] matrix = printAndGenerateMatrix(5, 5);

        try {
            int count = findElementsWithCharInMatrix('+', matrix);
        }catch (UnknownCharException exception) {
            exception.printStackTrace();
        }

    }

    public static int[][] printAndGenerateMatrix(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 21 - 11);
            }
            System.out.println("Row " + (i + 1) + ": " + Arrays.toString(matrix[i]));
        }

        return matrix;
    }

    public static int findElementsWithCharInMatrix(char sign, int[][] matrix) throws UnknownCharException{

        if (sign != '+' && sign != '-') throw new UnknownCharException("Provided sign should be + or -");


        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (sign =='+' && matrix[i][j] > 0) count++;
                else if(sign =='-' && matrix[i][j] < 0) count++;
            }
        }

        String result = "Amount of " + (sign == '+' ? "positive" : "negative") + " numbers is " + count;
        System.out.println(result);

        return count;
    }



}


class UnknownCharException extends Exception {

    public UnknownCharException(String message) {
        super(message);
    }


}
