package com.bridgelabz.employeewagecomputation;
import java.lang.Math;

public class ProgramWithEmpPresentOrNot {

	public static void main(String[] args) {
	

	int fulltime =1;
	
	double empCheck = Math.floor(Math.random() * 10 %2);
	if (empCheck == fulltime) {
		System.out.println("Employee is Present");
	}
	else 
		System.out.println("Employee is Absent");
	
	
	}
	
}

	
		
		
	


