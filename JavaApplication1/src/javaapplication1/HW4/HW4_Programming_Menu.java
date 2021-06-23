package javaapplication1.HW4;

import java.util.Scanner;                                                       //import scanner class        
public class HW4_Programming_Menu {                                                    


   static Scanner sc = new Scanner(System.in);                                   //Used to get input from the user

   public static void main(String[] args) {
       int nLIST[] = new int[9];                                                // making a list of 9 menu items
       int nAmount = 0;                                                         //nAmount variable set starting from 0
       int PRICE = 0;                                                           //PRICE variable starting from 0
       int nTotal = 0;                                                          //nTotal variable starting from 0    

System.out.println("Welcome to Fun tips for kids courses\n");                   //prints string

       
       System.out.print("Please enter your name: ");                            //displays string and user enters whichever name they prefer
       
       String Name = sc.nextLine();                                              //user inputs name
       System.out.println("Menu\n");                                             // displays menu
       System.out.println("1.Intro to Java ......$80");
       System.out.println("2.Html ...............$85");
       System.out.println("3.CSS ................$90");
       System.out.println("4.JavaScript ........$100");
       System.out.println("5.Database ..........$120");
       System.out.println("6.JSP ...............$120");
       System.out.println("7.Spring Framework .$140");
       System.out.println("8.Advanced Java .....$105");
       System.out.println("9.PL/SQL...............$75");
       System.out.println("10.Exit");   
       
       
                                                                                /*       
                                                                                Below prints the output of promotion 1, 2, 3 and how it should look when displayed below the selection      
                                                                                */       
System.out.println("*************************************************************\n" +
"*                  PROMOTION 1                               *\n" +
"* If you select Html, CSS and JavaScript -> $20 OFF          *\n" +
"*          Web Client Development Package                    *\n" +
"**************************************************************\n" +
"\n"+        
"**************************************************************\n" +
"*                  PROMOTION 2                               *\n" +
"*If you select Database, JSP and String Framework-> $50 OFF  *\n" +
"*          Web Server Development Package                    *\n" +
"**************************************************************\n" +
"\n"+        
"**************************************************************\n" +
"*                  PROMOTION 3                               *\n" +
"*          If you select all options -> $80 OFF              *\n" +
"*              Complete Development Package                  *\n" +
"**************************************************************");

       System.out.print("Please select your options:");                         //this while loop explains as long what the number entered is not 10 then the while loop will continue to run to enter another option
       int nOption = nCourses();
       while (nOption != 10) {                                    
           nLIST[nTotal] = nOption;
           nTotal++;
           System.out.print("Enter Another option:");   
           nOption = nCourses();  
       }                                                                        //end of method

       boolean bPROMOTION1 = DISCOUNT1(nLIST, nTotal);                          //The amount of money that will be deducted 
       if (bPROMOTION1) {
           PRICE = 20;   // constant
       }                                                                        //if promo 1 is activated the variable would be 20
       
       boolean bPROMOTION2 = DISCOUNT2(nLIST, nTotal);                          //The amount of money that will be deducted 
       if (bPROMOTION2) {                                               
           PRICE = 50;  // constant
       }                                                                        //if promo 2 is activated the variable would be 50
       
       boolean bPROMOTION3 = DISCOUNT3(nLIST, nTotal, bPROMOTION1, bPROMOTION2);//The amount of money that will be deducted 
       if (bPROMOTION3) {                                                        //if promo 3 is activated the variable would be 80 
           PRICE = 80;  // constant
       }

       nAmount = calcnAmount(nLIST, nTotal);                                    //The calculation of tax rate
       nAmount -= PRICE; 
       double dTax = nAmount * (6.5 / 100);                                     // dividing the sales Tax by 100 calculations

       System.out.println("Thank you for ordering with fun tips for kids , "    //string + user name
               + Name);
       System.out.println("Total Courses Ordered :" + nTotal);                  //string + total

       System.out.print("Prices for the courses :$" + nAmount);
       if (bPROMOTION1 == true || bPROMOTION2 == true || bPROMOTION3 == true) { 
           System.out.println("<Discount already applied>");
       }                                                                        
       System.out.println("Sales Tax :$" + dTax);
       System.out.println("Total amount due :$" + (nAmount + dTax));                   //will calculate the Taxes on the courses selected
       System.out.println("You saved :$" + PRICE);                              

   }

   private static boolean DISCOUNT3(int[] LIST, int nAmount, boolean Select1, boolean Select2) { //Going through each ticker in the list flags 1,8,9 which selects discount 3 
       boolean PROMO3 = false;
       int nTicker1 = 0, nTicker2 = 0, nTicker3 = 0;                                        // counters that will determine which discount to apply
       for (int Index = 0; Index < nAmount; Index++) {                                      //for loop thats increasing index by one every loop
           if (LIST[Index] == 1) {                                                          //conditional going through each index of the list
               nTicker1 = 1;
           }
           if (LIST[Index] == 8) {
               nTicker2 = 1;
           }
           if (LIST[Index] == 9) {
               nTicker3 = 1;
           }

       }
       if (nTicker1 == 1 && nTicker2 == 1 && nTicker3 == 1 && Select1 == true && Select2 == true) {
           PROMO3 = true;                                                       //Flag indicating whether answer is true
       }
       else 
       {
           
           PROMO3 = false;                                                      //Flag indicating whether answer is false
       }
       return PROMO3;
   }                                                                            //end of promotion 3 method     

   private static boolean DISCOUNT2(int[] LIST, int nAmount) {                  //Going through each ticker in the list flags 5,6,7 which selects discount 2 
       boolean PROMO2 = false;
       int nTicker1 = 0, nTicker2 = 0, nTicker3 = 0;
       for (int Index = 0; Index < nAmount; Index++) {
           if (LIST[Index] == 5) {
               nTicker1 = 1;
           }
           if (LIST[Index] == 6) {
               nTicker2 = 1;
           }
           if (LIST[Index] == 7) {
               nTicker3 = 1;
           }

       }                                                                        
       
       if (nTicker1 == 1 && nTicker2 == 1 && nTicker3 == 1) {
           PROMO2 = true;
       } 
       else 
       {
           PROMO2 = false;
       }
       return PROMO2;
   }                                                                            //returns discount 2 promotions

   private static int calcnAmount(int[] LIST, int nAmount) {                    //calculates the amount in the list going through each integer in increments
       int nTotal = 0;
       int NEST[] = { 80, 85, 90, 100, 120, 120, 140, 105, 75 };
       for (int Index = 0; Index < nAmount; Index++) {
           nTotal += NEST[LIST[Index] - 1];
       }
       return nTotal;
   }                                                                            //returns the total
   
                                                                                
   private static boolean DISCOUNT1(int[] LIST, int nAmount) {                  //Going through each ticker in the list flags 2,3,4 which selects discount 1 
       boolean PROMO1 = false;
       int nTicker1 = 0, nTicker2 = 0, nTicker3 = 0;
       for (int Index = 0; Index < nAmount; Index++) {
           if (LIST[Index] == 2) {
               nTicker1 = 1;
           }
           if (LIST[Index] == 3) {
               nTicker2 = 1;
           }
           if (LIST[Index] == 4) {
               nTicker3 = 1;
           }

       }
       if (nTicker1 == 1 && nTicker2 == 1 && nTicker3 == 1) {
           PROMO1 = true;
       } 
       else 
       {
           PROMO1 = false;
       }
       return PROMO1;
   }                                                                            //End of Discount 1 Conditional
                                                                                
   private static int nCourses() {                                              // anything integer less 1 or higher than 10 with output invalid
       int nOption;
       while (true) {
           nOption = sc.nextInt();
           if (nOption < 1 || nOption > 10) {                                   
               System.out.println("** Invalid Choice.Must be between 1-10 **");
           } 
           else
               break;
       }
       return nOption;

   }                                                                            //end of arguement

}                                                                               //end main method 