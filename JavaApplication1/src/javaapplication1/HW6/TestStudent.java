package javaapplication1.HW6;

import javaapplication1.HW6.HW6_Student;
import java.util.Scanner;
public class TestStudent {

//Main method
public static void main(String[] args) {
//variables    
Scanner input = new Scanner(System.in);
int nOption=0;
HW6_Student s = null;
String sFirstName = "";
String sLastName = "";
int nQuiz1=0; 
int nQuiz2=0; 
int nQuiz3=0;




//Menu for user to select and enters information
System.out.println("\n\nSTUDENT PROCESSING MENU");
System.out.println("1. Create new Student – empty Account");
System.out.println("2. Create new Student – information available");
System.out.println("3. Set Student First Name:");
System.out.println("4. Set Student Last Name:");
System.out.println("5. Enter Quiz1 Score:");
System.out.println("6. Enter Quiz2 Score:");
System.out.println("7. Enter Quiz3 Score:");
System.out.println("8. Get Quiz Average:");
System.out.println("9. Get Student Id");
System.out.println("10. Get Next Available Id");
System.out.println("11. Compute Student Grade");
System.out.println("12. Print Student Information");
System.out.println("13. Exit");

System.out.print("Please enter your preferred option: ");
nOption = input.nextInt();

// Getting the input entered by the user
while (nOption !=13){

if (nOption == 1){
s=new HW6_Student();
System.out.println("Student successfully created");
System.out.println("StudentId #" + s.getStudentId());
}//end of 1

else if (nOption == 2){
System.out.print("Please enter Student First Name:");
sFirstName=input.next();// user enter first name


System.out.print("Please enter Student Last Name:");
sLastName=input.next();// user enters last name


System.out.print("Enter Quiz1 Score: ");
nQuiz1 = input.nextInt();//user enters quiz1


System.out.print("Enter Quiz2 Score: ");
nQuiz2 = input.nextInt();//user enters quiz2


System.out.print("Enter Quiz3 Score: ");
nQuiz3 = input.nextInt();//user enters quiz3

s = new HW6_Student (sFirstName, sLastName, nQuiz1, nQuiz2, nQuiz3);
System.out.println("Student successfully created");
System.out.println("Student ID " + s.getStudentId());        
       
}//end of 2

else if (nOption == 3){
System.out.print("Please enter Student First Name:");
sFirstName = input.next();//user will enter first name
s.setFirstName(sFirstName);

}//end nOption 3

else if (nOption == 4){
System.out.print("Please enter Student Last Name:");
sLastName=input.next();//user enter last name
s.setLastName(sLastName);

}//end of 4

else if (nOption == 5){
System.out.print("Enter Quiz1 Score:");
nQuiz1=input.nextInt(); //user enter the inputore of quiz1
s.setQuiz1(nQuiz1);

}//end of 5

else if (nOption == 6){
System.out.print("Enter Quiz2 Score:");
nQuiz2=input.nextInt(); //user enter the inputore of quiz2
s.setQuiz2(nQuiz2);

}// end of 6

else if (nOption == 7){
System.out.print("Enter Quiz3 Score:");
nQuiz3=input.nextInt(); //user enter the inputore of quiz3
s.setQuiz3(nQuiz3);

}//end of 7

else if (nOption == 8){
System.out.println("Quiz Average :"+s.calculateQuizAverage());

}// will calculate the average of quizes

else if (nOption == 9){
System.out.println("Student ID#: "+s.getStudentId());

}// Student ID will he printed

else if (nOption == 10){
System.out.println("Next StudentID#: " + s.getNextStudentId());

}// Next student ID will print here

else if (nOption == 11){
System.out.println("Student Grade: " + s.computeStudentGrade());

}

else if (nOption == 12){
System.out.println("Student Account Infomation");
s.printStudentInfo(); // all student account info will be printed
}//end option twelve

System.out.println("");
System.out.println("Please enter your preferred option: ");
nOption = input.nextInt();
}//end while loop

if (nOption == 13){
System.out.println("Program Exited"); // Program ends here
}//end of 13
    }//end of main class method
}//end of class
