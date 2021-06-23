package javaapplication1.HW5;

import java.io.File; //needed to read file.            //allows the text file to be read    
import java.io.FileNotFoundException;                   //allows the program to run incase the txt file is missing                         
import java.util.Scanner;                               //allows for the user interaction
import java.util.ArrayList;                             //allows for Arraylist for the created and used
public class FacultyApplication {

//The main program read the objects based on Faculty data in an ArrayList and displays it    
public static void main(String[] args) throws FileNotFoundException {
//declaring variables 
ArrayList<Faculty> myList = new ArrayList<Faculty>(); //array list to store faculty object
generateFacultyList(myList);
//Heading for the report
System.out.println("\nFACULTY REPORT");
System.out.println("\nNumber of Instructors: " + myList.size()); //number of instructors
System.out.println("");

//The for loop to display the info from faculty array list
for(int nIndex = 0; nIndex < myList.size(); nIndex++){
printFacultyInfo(myList.get(nIndex));
System.out.println("");

}//end for loop
   
    }//end main method

public static void printFacultyInfo(Faculty Fac){           //Method used to the information that will be displayed

System.out.println("Faculty ID: " + Fac.getId()); //Gets & displays the ID from Arraylist
System.out.println("Name: " + Fac.getFirstName().toUpperCase() + " " + Fac.getLastName().toUpperCase());  //Gets / displays the name both first/last name in uppercase from array list
System.out.println("Hire date: " + Fac.getHireDate());  //gets and displays the hire date from array list
System.out.println("Phone: ("+ Fac.getPhone().substring(0, 3)+") " + Fac.getPhone().substring(3, 6) + "-" + Fac.getPhone().substring(6, 10)) ; //get and displays phone number in right format from array list
System.out.println("Email: " + Fac.getEmail()); //gets & displays the email from array list
System.out.println("Address: " + Fac.getStreet() + " " + Fac.getCity() + " " + Fac.getState().trim() + " " + Fac.getZipCode()); //displays the street,city,state,zip for address
System.out.println("Department Name: " + Fac.getDepartmentId());
}//end of printFacultyInfo



 
public static void generateFacultyList(ArrayList<Faculty> list) throws FileNotFoundException{ //Setting Array List
String sFileName = "Faculty.txt"; //my txt file
File fileToOpen = new File(sFileName);
Scanner inputFile = new Scanner(fileToOpen);    
String sInputLine = ""; //variable to hold the name of the file
String[] saTokens = null; //array to split the data 


//while to read the faculty file and store it in the array list
while(inputFile.hasNext()){
    sInputLine = inputFile.nextLine(); //reads the lines from the faculty file
    saTokens = sInputLine.split(":");  //split the line read from the file into individual attributes
    Faculty nNumberOfObjects = new Faculty(); //setting the OBJECTs
    //setting id, firstname,lastname,hiredate,title,salary,street,city,state,zip,phone,email,department and replacing the numbers with departments
    nNumberOfObjects.setId(saTokens[0]); 
    nNumberOfObjects.setFirstName(saTokens[1]);
    nNumberOfObjects.setLastName(saTokens[2]); 
    nNumberOfObjects.setHireDate(saTokens[3]);
    nNumberOfObjects.setTitle(saTokens[4]);
    nNumberOfObjects.setSalary(Double.parseDouble(saTokens[5]));
    nNumberOfObjects.setStreet(saTokens[6]);
    nNumberOfObjects.setCity(saTokens[7]);
    nNumberOfObjects.setState(saTokens[8]);
    nNumberOfObjects.setZipCode(Integer.parseInt(saTokens[9]));
    nNumberOfObjects.setPhone(saTokens[10]);
    nNumberOfObjects.setEmail(saTokens[11]);
    nNumberOfObjects.setDepartmentId(saTokens[12].replace("2006", "Counselor Education").replace("2000", "Music").replace("2011","Teaching and Learning").replace("2012","Accounting").replace("2014","Finance").replace("2016", "Information Technology and Operations Management").replace("2019","Architecture").replace("2020","Criminology & Criminal Justice").replace("2024","Civil, Environment, & Geometric Engineering").replace("2025", "Ocean & Mechanical Engineering").replace("2026","Computer & Electrical Engineering and Computer Science").replace("2028","Medicince").replace("2030","Chemistry & Biochemistry"));
    list.add(nNumberOfObjects); //saving the object in my list variable
}//end while loop
    }//end method generateFacultyList
        }//end class 
