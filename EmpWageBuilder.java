package com.bridgelabz.employeewagecomputation;

import java.util.ArrayList;

interface ComputeEmpWageMultipleCompanies {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth);
    void computeEmpWage();
}

public class EmpWageBuilder implements ComputeEmpWageMultipleCompanies {

    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;


	private ArrayList<CompanyEmpWage> companyEmpWageList;

	public  EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHourPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= companyEmpWage.maxHourPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days :" + "totalWorkingDays" + "Emp Hr:" + empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Amenora", 22, 3, 24);
		empWageBuilder.addCompanyEmpWage("PHINIX", 20, 2, 25);
		empWageBuilder.computeEmpWage();
	}

}