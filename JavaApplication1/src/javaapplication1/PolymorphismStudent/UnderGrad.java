
public class UnderGrad extends Student {
    @Override
    public void computeGrade(){ //the override method makes this subclass its own cause its already in Student tab already

    if(getTestAverage() > 70){
        super.setGrade("Pass");
}
    else{
        super.setGrade("Fail");
}

}//end compute grade

@Override    
public String toString(){
    String sMsg = " ";
    sMsg += super.toString();
    sMsg += "This is an Undergrad student \n";
    sMsg += "Student Grade: " + getGrade();
    return sMsg;
}

    }
