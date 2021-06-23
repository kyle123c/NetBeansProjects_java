package javaapplication1.LoanCalculator;

import java.util.Scanner;

public class LoanCalculator {


    public static void main(String[] args) {
    //Main method
        
   //Create a Scanner
   Scanner input = new Scanner(System.in);
   
   //Enter annual interest rate
   System.out.print("Enter annual interest rate, for example, 3.25: ");
   double annualInterestRate = input.nextDouble();
   
   //Enter number of years
   System.out.print("Enter number of years as an integer: ");
   int numberOfYears = input.nextInt();
        
   //Enter loan amount
   System.out.print("Enter loan amount, for example, 50000.00: ");
   double loanAmount = input.nextDouble();
   
   //Create a Loan Object
   Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
   
   //Display loan date, monthly payment, and total payment 
   System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
        
    }
    
}
