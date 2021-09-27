/*
Name: Clinton J Schultz
Prof: Dr. Rasib Khan
Class: CSC360
Date: 09/12/19
 */


import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        //initialize variables
        int parsable = 0;
        int notParsable = 0;
        int sum = 0;
        String number = "";

        //instantiate first Scanner to get user input for filename
        Scanner getFileName = new Scanner(System.in);
        //create file instance
        System.out.println("Enter name of .txt file");
        java.io.File file = new java.io.File(getFileName.next());

        //check to see if file exists
        if (file.exists()) {
            System.out.println("File exists");
        }
        else {
            System.out.println("File does not exist");
            System.exit(1);
        }
        //create Scanner for file
        Scanner input = new Scanner(file);

        //read data from file
        while (input.hasNext()) {
            try {
                number = input.nextLine();
                //parse integers and increment sum variable to be used in average operation
                int intNum = Integer.parseInt(number);
                parsable++;
                sum += intNum;
            } catch (Exception ex) {
                System.out.println("Cannot parse " + number + " as an integer.");
                notParsable++;
            }
        }
        System.out.println("Number of parsable lines: " + parsable);
        System.out.println("Average value: " + ((double)sum / parsable));
        System.out.print("Number of non-parsable lines: " + notParsable);

        }
}