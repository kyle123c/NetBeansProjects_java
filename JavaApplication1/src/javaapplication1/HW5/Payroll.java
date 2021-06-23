package javaapplication1.HW5;

import java.util.Scanner; 
public class Payroll
{ 
    public static void main(String[] args) 
    {// Beginning of main method 
        //scan class to read inputs.
        Scanner scan = new Scanner(System.in); 

        // required variables for program.
        int EmployeeID[] = {5658845,4520125,7895122,8777541,8451277,1302850,7580489}; //Array in list
        int SIZE =  EmployeeID.length;
        int Hours_Worked[] = new int[SIZE];
        float Hourly_Rate[] = new float[SIZE];
        int nIndex,daHighest = -1, daLowest = -1, daMostHours = -1; //stores the index values that follows
        float dMax,Gross_Wage;
        double High_Gross_Wage = -1.0, Low_Gross_Wage = 100000.0;
        int Most_Hours=-1;
        System.out.println("Bi-Weekly Payroll \n------------------"); // displays statement to user
         

         System.out.println("Please enter the number of hours that each each employee has worked this pay period.");// displays statement to user

          // reading and validating input of hours worked.
         for(int nCount=0; nCount<SIZE; nCount++){ //beginning of for loop
              System.out.print("Hours for "+ EmployeeID[nCount]+": ");
              nIndex=scan.nextInt(); //user input

              // checks wheather hours worked is less than zero.
              if(nIndex < 0){//beginning of if statement
                   System.out.println("Invalid Entry. Please enter a value greater than 0.");
                   nCount--;
                   continue;
                   }//end of if to compute the index value
               Hours_Worked[nCount] = nIndex;
           }// end of loop
           
 
           System.out.println("\nPlease enter the hourly pay rate for each employee.");

             // reading and validating input of hourly pay rate.
             for(int nCount=0; nCount<SIZE; nCount++){//beginning of for loop
              System.out.print("Hourly pay rate for "+ EmployeeID[nCount]+": ");
              dMax = scan.nextFloat();

              // checks wheather pay is less than the minimum rate allowed ($6).
              if(dMax < 6){//beginning of if statement
                   System.out.println("Invalid Entry. $6.00 is the minimum rate allowed.");
                   nCount--;
                   continue;
                   }//end of if to compute the index value
               Hourly_Rate[nCount] = dMax;
           }//end of for loop

    System.out.println("\nEmploypeeID   Hours Worked   Hourly Rate   Gross Wage");
    System.out.println("-----------------------------------------------------");

    //Display complete data.
    for(int nCount=0; nCount<SIZE; nCount++){ //beginning of for loop
            Gross_Wage = Hourly_Rate[nCount] * Hours_Worked[nCount]; 

            //Calculates the hightest Gross_Wage wage.
            if( High_Gross_Wage < Gross_Wage ){//beginning of if statement
                  High_Gross_Wage = Gross_Wage;
                    daHighest=nCount;
               }//end of if to compute the index value for highest gross wage

              //Calculates the hightest Gross_Wage wage.
            if( Low_Gross_Wage > Gross_Wage ){//beginning of if statement
                  Low_Gross_Wage = Gross_Wage;
                   daLowest=nCount;
                 }//end of if to compute the index value for lowest gross wage

              //Calculates Most hours worked.
            if( Most_Hours < Hours_Worked[nCount] ){//beginning of if statement
                  Most_Hours = Hours_Worked[nCount];
                     daMostHours = nCount;
                  }//end of if to compute the index value for most hours worked

            System.out.printf("%7d       %d             $%5.02f        $%.02f\n", EmployeeID[nCount],Hours_Worked[nCount],Hourly_Rate[nCount],Gross_Wage);
      }//end of for loop

  System.out.println("\nEmployee #" +  EmployeeID[daHighest] + " has the highest gross wage.");
  System.out.println("Employee #" +  EmployeeID[daLowest] + " has the lowest gross wage.");
  System.out.println("Employee #" +  EmployeeID[daMostHours] + " worked the most hours this week.");
 }// ending of main method
}// end of payroll homework