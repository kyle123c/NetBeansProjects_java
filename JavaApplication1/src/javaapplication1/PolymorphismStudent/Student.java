
public class Student {
//Attributes data members
    private String sName;
    private double dQuiz1;
    private double dQuiz2;
    private double dQuiz3;
    private String sGrade;
    
//Constrants for the class
    final public static int NUM_QUIZZES = 3;

//CONTRUCT N/A
    public Student() {
    }


//CONSTRUCT ALL FIELDS
    public Student(String sName, double dQuiz1, double dQuiz2, double dQuiz3, String sGrade) {
        this.sName = sName;
        this.dQuiz1 = dQuiz1;
        this.dQuiz2 = dQuiz2;
        this.dQuiz3 = dQuiz3;
        this.sGrade = sGrade;
    }//END CONSTRUCTOR

    @Override
    public String toString() {
    String sMsg = " ";
    sMsg += "Student Name: " + sName + "\n";
    sMsg += "Student test average: " + getTestAverage() + "\n";    
    return sMsg;
    }// end of Student@7852e922 which will be change to whatver name u want

public void computeGrade(){
if(getTestAverage()> 65){
    sGrade = "Pass";
}
else {
    sGrade = "Fail";
    
    }
}    
    
  //test avg calculation  
public double getTestAverage(){
double dTestAvg = 0.0;
dTestAvg = (dQuiz1 + dQuiz2 + dQuiz3) / NUM_QUIZZES;
return dTestAvg;
}    







//Getter and Setter / Encapsulate fields and REMOVE ALL S AND D WHEN INIATED! EX. getsName to getName 

    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public double getQuiz1() {
        return dQuiz1;
    }

    public void setQuiz1(double dQuiz1) {
        this.dQuiz1 = dQuiz1;
    }

    public double getQuiz2() {
        return dQuiz2;
    }

    public void setQuiz2(double dQuiz2) {
        this.dQuiz2 = dQuiz2;
    }

    public double getQuiz3() {
        return dQuiz3;
    }

    public void setQuiz3(double dQuiz3) {
        this.dQuiz3 = dQuiz3;
    }

    public String getGrade() {
        return sGrade;
    }

    public void setGrade(String sGrade) {
        this.sGrade = sGrade;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//end student class

