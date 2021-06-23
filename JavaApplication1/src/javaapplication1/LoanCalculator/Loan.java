package javaapplication1.LoanCalculator;



public class Loan {
private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
private java.util.Date loanDate;

//Default contructor
public Loan(){
this(2.5, 1, 1000);       
}
//Contructing a loan with specified annual interest rate, number of years, and loan amount
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }
//Return annualInterestRate
public double getannualInterestRate(){
return annualInterestRate;
}    
//Set a new annualInterestRate
public void setannualInterestRate(double annualInterestRate){
this.annualInterestRate = annualInterestRate;
}
//Return numberOfYears
public int getnumberOfYears(){
return numberOfYears;
}
//Set a new numberOfYears
public void setnumberOfYears(int numberOfYears){
this.numberOfYears = numberOfYears;
}
//Return loanAmount
public double getloanAmount(){
return loanAmount;
}
//Set a new loanAmount
public void setloanAmount(double loanAmount){
this.loanAmount = loanAmount;
}
//Find monthly payment
public double getMonthlyPayment(){
double monthlyInterestRate = annualInterestRate / 1200;
double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
return monthlyPayment;
}
//Find total payment 
public double getTotalPayment(){
double totalPayment = getMonthlyPayment() * numberOfYears * 12;
return totalPayment;
}
//Return loan date 
public java.util.Date getLoanDate(){

return loanDate;
}




}
