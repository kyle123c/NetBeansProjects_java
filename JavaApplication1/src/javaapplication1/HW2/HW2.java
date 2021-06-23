package javaapplication1.HW2;

import java.util.Scanner; // imports scanner class

public class HW2 {   //HW

    public static void main(String args[]) {
        // printing headings
        System.out.println("*************************************************"); //print ****
        System.out.println("*********Welcome to my Math tool in Java*********"); //print the sentance
        System.out.println("*************************************************"); // prints ****
        //string of the variables
        String first_name, last_name;   // syntax indentifying the 2 variables
        Scanner in = new Scanner(System.in); // in is the construct scanner object
        //enters first and last name
        System.out.print("\nPlease enter your first name: "); // prints out the phrase and \n enters a newline in the text at this point
        first_name = in.nextLine(); // this method finds and returns the next complete token from the scanner
        System.out.print("Please enter your last name: "); // prints the phrase inside ()
        last_name = in.nextLine(); // reads input including space between the words
        //full name by user
        System.out.println("\nHi " + first_name + " " + last_name + "!"); //\n to skip line "hi adding first and last name with the ! at the end.
        System.out.println("Do you know java performs mathematical operation?"); // prints out the phrase
        int dividend, divisor, quotient, remainder; // assigning variables to integer
        double result; // returns objects in previous arguement.
        
        System.out.print("\nPlease enter a number greater than zero: "); // prints out the phrase in paranthesis 
        dividend = in.nextInt(); 
        System.out.print("Please enter another number greater than zero: ");
        divisor = in.nextInt();
        //variables for remainder which is div/divisor
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        result = (double) dividend / divisor;
        //print out the phrases of div, divisor,quotient,remainder and the outputs
        System.out.println("\nThe dividend is: " + dividend);
        System.out.println("\nThe divisor is: " + divisor);
        System.out.println("\nThe quotient is: " + quotient);
        System.out.println("\nThe remainder is: " + remainder);
        System.out.println("The result of the division is: " + result);
        //phrases printed
        System.out.println("\nNow that you know how these operations work, compute how many quarters are in\ncertain amount of cents and the remaining cents");
        
        int cents; // assigning variable 
        int quarters, cent; // assigning variables
        System.out.print("\n\nPlease enter any amount in cents: "); // prints the phrase
        cents = in.nextInt(); 
        //cent variable
        quarters = cents / 25; // quarters assign to cents / 25
        cent = cents - (quarters * 25); // 
        //phrases printed with variablez
        System.out.println("\nTotal coins after the conversion (quarters plus cents) is ... " + (quarters + cent) + ", java is\namazing!");
        System.out.println(cents + " cents are equal to " + quarters + " quarters and " + cent + " cents");
        System.out.println("\nThank you for using this java tool, " + first_name + "!");

//end of code
    }
// public class 
}