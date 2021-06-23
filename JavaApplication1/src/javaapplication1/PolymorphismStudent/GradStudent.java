
public class GradStudent extends Student{
    private int nGradId;    
    private static int nNextGradId = 12345;
    public GradStudent(){
    nGradId = nNextGradId;
    nNextGradId++;    
    }
    
    
    public GradStudent(String sName, double dQuiz1, double dQuiz2, double dQuiz3, String sGrade) {
        super(sName, dQuiz1, dQuiz2, dQuiz3, sGrade);
        this.nGradId = nGradId;
        nGradId = nNextGradId;
        nNextGradId++;
    }
    
    

    @Override
    public void computeGrade(){
        if(getTestAverage()>75){
            super.setGrade("Pass");
        }
        else {
            super.setGrade("Fail");
        }
}//end compute
    
    @Override
    public String toString(){
     String sMsg = " ";
     sMsg+=super.toString();
     sMsg+="This is a GradStudent with id: " + nGradId + "\n";
     sMsg+="Student grade: " + super.getGrade();
     return sMsg;   
        
    }//end toString
    public int getGradId() {
        return nGradId;
    }

    public void setGradId(int nGradId) {
        this.nGradId = nGradId;
    }


}