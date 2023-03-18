package com.bridgelabz.employeewagecomputation;

public class ProgramOfCalculateEmployeeWage {

	public static void main(String[] args) {
	
		int fulltime = 1;
		int emprateperhour = 20;
		
		int empHour = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
       if (empCheck == fulltime) 
    	   empHour = 8;
     
       else 
    	   empHour = 0;
    	  
    	   empWage = empHour * emprateperhour;
    	   System.out.println("Emp Wage:" + empWage);
       }
	

}





