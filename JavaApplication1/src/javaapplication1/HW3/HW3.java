package javaapplication1.HW3;

import java.util.Scanner;                                                       //import scanner class

public class HW3 {                                                              // homework 3 
/*
this program is a series of 5 Employee groups showing different attributes
of their employee paycheck depending on the amount of hours they work and depending
on their group category    
*/
    public static void main(String[] args) {                                    //beginning of arg

Scanner sc = new Scanner(System.in);                                            // scanner allowing to read values 

       System.out.print("Please enter your first name: ");                      // output string
       String firstname = sc.next();                                            //syntax = method finds and return next toekn from scanner
       System.out.print("Please enter your last name: ");                       // output string
       String lastname = sc.next();                                             //syntax = method finds and return next toekn from scanner
       System.out.print("Please enter hour worked: ");                          // output string
       int hr = sc.nextInt();                                                   // assigning hr for a integer
       System.out.print("Employee group(1. Silver, 2. Golden, 3. Platinum): "); //output string
       int group = sc.nextInt();                                                // group assigned
       
       if (group == 1){                                                         //group 1 
           System.out.println("Employee name: "+firstname+" "+lastname);        //output string for first+last name
           System.out.println("Employee group: Silver");                        //string output
           System.out.println("Total hours worked: "+ hr);                      //output string + hours
           System.out.println("Hourly Pay rate: $20.0");                        // output string  of $20
          
           double gross = 0.0;                                                  //assigning decimal
           if (hr<=80) gross = hr * 20.0;                                       // if hr is less than or equal gross, hours * 20
           else gross = (80 * 20.0) + ((hr - 80) * 20.0 * 1.5);                 // else computes output
           
           System.out.println("Gross pay: $"+gross);                            //outputs string $ + gross
           System.out.println("Retirement deduction: $"+ (gross*0.02));         //prints string +gross * .02
           System.out.println("insurance deduction: $250");                     //prints string + gross
           System.out.println("Employee taxes: $"+ (gross*0.01));               //prints taxes + gross * .01
           double netPay = gross - (gross * 0.03) - 250;                        //method
           System.out.println("Net Pay: $"+ netPay);                            // prints netpay 
       }                                                                        //end of if statement for group 1    
       
       else if (group == 2){                                                    //group 2
           System.out.println("Employee name: "+firstname+" "+lastname);        //output string for first+last name
           System.out.println("Employee group: Golden");                        //string output
           System.out.println("Total hours worked: "+ hr);                      // output string + hours
           System.out.println("Hourly Pay rate: $25.0");                        //output string 
           double gross;                                                        //gross
           if (hr<=80) gross = hr * 25.0;                                       //if hours is less or equal to gross = hours times 25.0
           else gross = (80 * 25.0) + ((hr - 80) * 25.0 * 2.0);                 //else gross output
           System.out.println("Gross pay: $"+gross);                            //prints gross pay
           System.out.println("Retirement deduction: $"+ (gross*0.03));         //prints retirement deduction
           System.out.println("insurance deduction: $200");                     //prints insurance deduction
           System.out.println("Employee taxes: $"+ (gross*0.01));               //prints employee taxes
           double netPay = gross - (gross * 0.04) - 200;                        //gross * .04 - 200
           System.out.println("Net Pay: $"+ netPay);                            //prints netpay
       }                                                                        // end of else if statement    
       
       else if (group == 3){                                                    //group 3 else if statement
           System.out.println("Employee name: "+firstname+" "+lastname);        //output string for first+last name
           System.out.println("Employee group: Platinum");                      //output string
           System.out.println("Total hours worked: "+ hr);                      //putput string plus hours
           System.out.println("Hourly Pay rate: $30.0");                        //output strings
           double gross = 0.0;                                                  //assigning decimal
           if (hr<=80) gross = hr * 30.0;                                       // if hours is less or equal to 80 = hours times 30
           else gross = (80 * 30.0) + ((hr - 80) * 30.0 * 2.5);                 //else gross output
           System.out.println("Gross pay: $"+gross);                            //prints + gross output
           System.out.println("Retirement deduction: $"+ (gross*0.035));        //PRINTS retirement
           System.out.println("insurance deduction: $150");                     //prints insurance deduction
           System.out.println("Employee taxes: $"+ (gross*0.01));               //prints empoyee taxes
           double netPay = gross - (gross * 0.045) - 150;                       // netpay object
           System.out.println("Net Pay: $"+ netPay);                            //prints netpay
       }
       
       else System.out.println("Not a valid group");                            //if nothing complied the method will revert to this

           
    }
    
}
