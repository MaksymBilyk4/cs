package ppj16;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] oldMatrix = {
                {
                        (int) (Math.random() * 6 + 1),
                        (int) (Math.random() * 6 + 1)
                }
        };

        System.out.println();
        System.out.println("Generated dices by default -> " + Arrays.toString(oldMatrix[0]));
        System.out.println();

        int matrixLengthCounter = 1;

        while (true) {
            System.out.println("Choose a command: ");
            System.out.println("\t - (s)how -> show history of dices");
            System.out.println("\t - (r)oll -> generate dice throwing");
            System.out.println("\t - (e)xit -> leave a program");
            System.out.println("--------------------------------------");
            System.out.print("Type here -----> ");
            char userChoice = scanner.next().toLowerCase().charAt(0);

            if (userChoice != 'e' && userChoice != 'r' && userChoice != 's') {
                System.out.println("Incorrect option");
            } else if (userChoice == 'e') {
                System.out.println("Bye Bye!");
                break;
            } else {
                if (userChoice == 's') {
                    System.out.println();
                    System.out.println("Dices history (matrix): ");

                    for (int i = 0; i < oldMatrix.length; i++) {
                        System.out.println((i + 1) + ". ---> " + Arrays.toString(oldMatrix[i]));
                    }

                    System.out.println();
                }

                if (userChoice == 'r') {
                    System.out.println();
                    System.out.println("Generating random dices... ");
                    int dice1 = (int) (Math.random() * 6 + 1);
                    int dice2 = (int) (Math.random() * 6 + 1);
                    System.out.println("RANDOM DICES ----> [ " + dice1 + ", " + dice2 + " ]");

                    matrixLengthCounter = matrixLengthCounter + 1;
                    int[][] newMatrix = new int[matrixLengthCounter][2];


                    for (int i = 0; i < matrixLengthCounter - 1; i++) {
                        newMatrix[i] = oldMatrix[i];
                    }

                    newMatrix[matrixLengthCounter - 1] = new int[]{
                            dice1,
                            dice2
                    };
                    oldMatrix = newMatrix;
                    System.out.println();
                }
            }
        }

    }
}
