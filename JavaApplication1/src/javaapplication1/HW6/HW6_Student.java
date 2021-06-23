package javaapplication1.HW6;


public class HW6_Student {
    private String sFirstName;//attribute to hold the student first name
    private String sLastName;  //attribute to hold the student last name
    private int nQuiz1; //attribute to hold quiz 1
    private int nQuiz2;//attribute to hold quiz 2
    private int nQuiz3;//attribute to hold quiz 3
    private int nStudentId = 0;//attribute to hod student ID
    private static int nNextStudentId = 1001; //counts nthe next ID
    private static int QUIZZES = 3; //number of quizzes
   
    
    //Default constructor 
    public HW6_Student(){
    System.out.println("");
    nStudentId = nNextStudentId;
    nNextStudentId++;   //increase the next student ID by 1        
    }//End Default constructor
    
    
    //Overloaded constructor
    public HW6_Student(String sStudentName, String sStudentLastname, int nInitQuiz1, int nInitQuiz2, int sInitQuiz3){
    nStudentId = nNextStudentId;
    nNextStudentId++;    
    sFirstName = sStudentName;
    sLastName = sStudentLastname;
    nQuiz1 = nInitQuiz1;
    nQuiz2 = nInitQuiz2;
    nQuiz3 = sInitQuiz3;
    }//End Overload constructor 
    
public int getStudentId(){
return nStudentId;
        }    
public int getNextStudentId(){
return nNextStudentId;
}
public String getFirstName(){    
 return sFirstName;   
}    
public String getLastName(){
return sLastName;
}
public int getQuiz1(){
return nQuiz1;
}
public int getQuiz2(){
return nQuiz2;
}    
public int getQuiz3(){
return nQuiz3;
}    
//void for  first and last name
public void setFirstName(String sNewFirstName){
sFirstName = sNewFirstName;
}
public void setLastName(String sNewLastName){
sLastName = sNewLastName;
}    
//void for Quizzes
public void setQuiz1(int nNewQuiz1){
nQuiz1 = nNewQuiz1;
}
public void setQuiz2(int nNewQuiz2){
nQuiz2 = nNewQuiz2;
}
public void setQuiz3(int nNewQuiz3){
nQuiz3 = nNewQuiz3;
}
//calculating the average
    public double calculateQuizAverage(){
    double dQuizAvg = 0.0;
    dQuizAvg = (double)(nQuiz1 + nQuiz2 + nQuiz3)/QUIZZES;
    return dQuizAvg;
    } //End calulate quiz average
    
    public String showStudentFullName(){
    String sFullName = "";
    sFullName = "sFirstName" + "sLastName";
    return sFullName;
    
    }//End showStudent Full Name
    
    
    public String computeStudentGrade(){
    double dQuizAverage = 0.0;
    String sGrade = "";
    dQuizAverage = calculateQuizAverage();
    
    if (dQuizAverage >= 93){
        sGrade = "A";
        }   
        else if (dQuizAverage >= 90 && dQuizAverage < 93){
        sGrade = "A-";
       }
        else if (dQuizAverage >= 87 && dQuizAverage <= 90){
           sGrade = "B+";
       }
       else if (dQuizAverage >= 83 && dQuizAverage <= 87){
           sGrade = "B";
       }
       else if (dQuizAverage >= 80 && dQuizAverage <= 83){
           sGrade = "B-";
       }
       else if (dQuizAverage >= 77 && dQuizAverage <= 80){
           sGrade = "C+";
       }
       else if (dQuizAverage >= 73 && dQuizAverage <= 77){
           sGrade = "C";
       }
       else if (dQuizAverage >= 70 && dQuizAverage <= 73){
           sGrade = "C-";
       }
       else if (dQuizAverage >= 67 && dQuizAverage <= 70){
           sGrade = "D+";
       }
       else if (dQuizAverage >= 63 && dQuizAverage <= 67){
           sGrade = "D";
       }
       else if (dQuizAverage >= 60 && dQuizAverage <= 63){
           sGrade = "D-";
       }
       else if(dQuizAverage >= 0 && dQuizAverage < 60){
           sGrade = "F";
       }
       return sGrade;
    } //End of computing student Grade
     
   
//prints all student info
    public void printStudentInfo(){
    System.out.println("Student Account Informnation: ");
    System.out.println("StudentId: #" + nStudentId);
    System.out.println("Quiz Score1: " + nQuiz1);
    System.out.println("Quiz Score2: " + nQuiz2);
    System.out.println("Quiz Score3: " + nQuiz3);
    System.out.println("Quiz Average: " + calculateQuizAverage());
    System.out.println("Student Grade: " + computeStudentGrade());
    System.out.println("Student Full name: " + showStudentFullName());
    }   
    
}//end class Student
