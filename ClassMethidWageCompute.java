package com.bridgelabz.employeewagecomputation;

public class ClassMethidWageCompute {
	public static final int PARTTIME =1;
	   public static final int FULLTIME = 2;
	   public static final int EMP_RATE_PER_HOUR = 20;
	   public static final int WORKING_DAY = 20;
	   public static final int HRS_IN_MONTH = 100;
	   
	   public static void employeeWage() {
		int empHrs =0, totalEmpHrs = 0, totalWorkingDays =0;
		
		while (totalEmpHrs <= HRS_IN_MONTH &&
				totalWorkingDays < WORKING_DAY) {
			totalWorkingDays++;
			
			int empCheck = (int) Math.floor(Math.random() * 10) %3;
      switch (empCheck) {
      case PARTTIME :
      empHrs = 4;
      break;
      
      case FULLTIME :
      empHrs = 8;
      break;
      default:
      empHrs = 0;
	}
			totalEmpHrs +=empHrs;
			System.out.println("Day:" + totalWorkingDays +  "Emp Hr" + empHrs);
	}
     int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
     System.out.println("Total Emp Wage :" + totalEmpWage);
	   }
	   
	  public static void main(String[] args) {
		   employeeWage();
	}
	   }
	   

	

