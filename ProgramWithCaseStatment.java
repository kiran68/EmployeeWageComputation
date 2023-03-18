package com.bridgelabz.employeewagecomputation;

public class ProgramWithCaseStatment {

	public static final int PARTTIME = 1;
	public static final int FULLTIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
   public static void main(String[] args) {
	
	   int empHrs = 0;
	   int empWage = 0;
	   
	   int empcheck = (int) Math.floor(Math.random() * 10) % 3;
    switch (empcheck) {
    case PARTTIME :
    	empHrs = 4;
    break;
    case FULLTIME :
    	empHrs = 8;
    	break;
    
    	default:
    		empHrs = 0;
    }
   
   empWage = empHrs * EMP_RATE_PER_HOUR;
   System.out.println("Emp Wage " + empWage);
   
   }      
   
}
