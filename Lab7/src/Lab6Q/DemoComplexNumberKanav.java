/*  Kanav Gupta
    251160137
    14th march, 2021
    This program has 4 files,
    in MyMethod we coded some of the Math functions from the scratch.
    in the RecComplexNum and PolarComplexNum we changed the forms and coded display functions
    this the driver class. we coded a program that would ask user to choose between conversations ot exiting the program.
    then if the user chooses a conversation it ask for input and then do it and display the needful
 */
package Lab6Q;

import java.util.Scanner;

public class DemoComplexNumberKanav {
    public static void main(String [] args) {

        MyMethod.printHeader(6,1);// calls the header method
        // declaring objects and variables
        RecComplexNum recNum;
        PolarComplexNum polNum;
        double real, imaginary, magnitude ,angle ,values;
        Scanner in = new Scanner(System.in); // initializing the scanner
        int choice;
        while(true){ // while loop to keep repeating the process for ever
            System.out.println("\n" +
                    "**** Complex Number Conversion *****\n" +
                    "*************************************\n" +
                    "1) Rectangular/Cartesian to Polar\n" +
                    "2) Polar to Rectangular/Cartesian\n" +
                    "3) Exit!\n" +
                    "*************************************");
            System.out.print("What conversion would you like to perform? ");
            choice = in.nextInt();
            switch (choice) { // switch statement to work on the choice the user would chose.
                case 1: // asks for the inputs and converts them from rec to polar
                    System.out.println("\nConverting Rectangular/Cartesian To Polar:");
                    System.out.print("Enter real value: ");
                    real = in.nextDouble();
                    System.out.print("Enter imaginary value: ");
                    imaginary = in.nextDouble();
                    recNum = new RecComplexNum(real,imaginary);
                    System.out.println("\nResult in Polar form:\n" +
                            "--------------------------");
                    recNum.displayRecForm();
                    polNum = recNum.getPolarFromRec(); // calls the function to change the form
                    polNum.displayPolarForm(); // calls the display function
                    break;
                case 2: // asks for the inputs and converts them from polar to rec
                    System.out.println("\nConverting Polar to Rectangular/Cartesian form:");
                    System.out.print("Enter magnitude value: ");
                    magnitude = in.nextDouble();
                    System.out.print("Enter angle value in degree: ");
                    angle = in.nextDouble();
                    polNum = new PolarComplexNum(magnitude,angle);
                    System.out.println("\nResult in Rectangular Form\n" +
                            "---------------------------------");
                    polNum.displayPolarForm();
                    recNum = polNum.getRecFromPolar();
                    System.out.print("Given Rectangular Form "); // calls the function to change the form
                    recNum.displayRecForm(); // call the display function
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice! Enter any choice between 1 and 3:");
                    break;
            }
            if (choice ==3) break; // if the user chose 3 this break will break the loop.

        } // while loops ends
        MyMethod.printFooter("Goodbye from Kanav"); // calls the print footer method
    }
}
