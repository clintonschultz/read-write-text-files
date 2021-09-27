/*
Name: Clinton J Schultz
Prof: Dr. Rasib Khan
Class: CSC360
Date: 09/11/19
 */

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {

        //instantiate Scanner object
        Scanner input = new Scanner(System.in);

        //declare variables
        boolean continueInput = true;
        int number1 = 0;
        int number2 = 0;
        double sumOfIntegers;

        //begin first do-while loop to get first integer input
        do {
            try {
                System.out.print("Enter first integer: ");
                number1 = input.nextInt();

                // Display the result
                System.out.println("The number entered is " + number1);

                continueInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("Try again moron. (" + "Incorrect input: an integer is required)");
                input.nextLine(); // discard input
            }
        } while (continueInput);

        //begin second do-while loop to get second integer input
        do {
            try {
                System.out.print("Enter second integer: ");
                number2 = input.nextInt();

                // Display the result
                System.out.println("The number entered is " + number2);

                continueInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("Try again idiot. (" + "Incorrect input: an integer is required)");
                input.nextLine(); // discard input
                continueInput = true;
            }
        } while (continueInput);

        //get sum of the two integers, show the sum, and call it a day!
        sumOfIntegers = number1 + number2;
        System.out.println("Sum is " + (int)sumOfIntegers);
        input.close();

    }

}

/*
Enter first integer: hi
Try again moron. (Incorrect input: an integer is required)
Enter first integer: six
Try again moron. (Incorrect input: an integer is required)
Enter first integer: 6
The number entered is 6
Enter second integer: five
Try again idiot. (Incorrect input: an integer is required)
Enter second integer: 5
The number entered is 5
Sum is 11

Process finished with exit code 0
 */