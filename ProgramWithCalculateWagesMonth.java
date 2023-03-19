package com.bridgelabz.employeewagecomputation;

public class ProgramWithCalculateWagesMonth {
   public static final int PARTTIME =1;
   public static final int FULLTIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
   public static final int WORKING_DAY = 2;
   
   public static void main(String[] args) {
	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0;
	
	for (int day = 0; day<WORKING_DAY; day++) {
	int empCheck =(int)Math.floor(Math.random() *10) %3;	
	switch (empCheck) {
	case PARTTIME : 
	empHrs = 4;
	break;
	
	case FULLTIME :
		empHrs = 8;
		break;
		
	default :
		empHrs=0;
	
	}
	empWage = empHrs * EMP_RATE_PER_HOUR;
	totalEmpWage +=empWage;
	System.out.println(" Emp Wage :" + empWage);
	}	
	System.out.println("Total Emp Wage: "  + totalEmpWage);
   }
}
