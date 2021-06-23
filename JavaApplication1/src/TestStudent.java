
import javaapplication1.HW6.Student;
import javaapplication1.HW6.UnderGrad;
import javaapplication1.HW6.GradStudent;

//this is hw6
public class TestStudent {


    public static void main(String[] args) {
//Create an Undergrad student
   //Student s = new Student();
//Using the common methods defined in the superclass   
   
    //CASE 1:
   GradStudent s = new GradStudent(); 
   s.setName("Karl");
   s.setQuiz1(75);
   s.setQuiz2(85);
   s.setQuiz3(95);
   //s.computeGrade();
   //s.setGradId(1111);
   showStudent(s);
   //System.out.println(s);
   System.out.println ("");
   
   //CASE 2:
   Student s2 = new UnderGrad();
   s2.setName("Dylan");
   s2.setQuiz1(85);
   s2.setQuiz2(85);
   s2.setQuiz3(90);
   s2.computeGrade();
   System.out.println(s2);
}//end main method argument
   
  public static void showStudent (Student stu){
  if(stu instanceof GradStudent){
      GradStudent grad = (GradStudent) stu;
      grad.computeGrade();
      System.out.println(grad);
  } 
  else if (stu instanceof UnderGrad)  {
  UnderGrad underGrad = (UnderGrad)stu;
  underGrad.computeGrade();
  System.out.println(underGrad);
  }
    } 
}// end test student
