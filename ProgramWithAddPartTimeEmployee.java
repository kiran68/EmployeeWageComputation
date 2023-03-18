package com.bridgelabz.employeewagecomputation;

public class ProgramWithAddPartTimeEmployee {
 public static void main(String[] args) {
	
	 int fulltime = 1;
	 int parttime= 2;
	 int emp_rate_per_hour = 20;
	 
	 int empHrs = 0;
	 int empWage = 0;
	 
	 double empcheck = Math.floor(Math.random() * 10) % 3;
	 
	 if (empcheck == parttime )
	 empHrs = 4;
	 else if (empcheck == fulltime)
		 empHrs = 8;
	 else 
		 empHrs = 0;
	 empWage = empHrs * emp_rate_per_hour;
	 System.out.println("Emp Wage :" + empWage);
}
}
