package com.bridgelabz.employeewagecomputation;

import java.util.ArrayList;
import java.util.HashMap;


class EmployeeWageComputation implements IEmployeeWageComputation
{
    // class constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    // instance variables
    ArrayList<CompanyEmpWage1> companies;
    HashMap<String, Integer> totalEmpWages;

    public EmployeeWageComputation()
    {
        companies = new ArrayList<>();
        totalEmpWages = new HashMap<>();
    }

    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        CompanyEmpWage1 company = new CompanyEmpWage1(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
        companies.add(company);
        totalEmpWages.put(companyName,0);
    }

    int generateEmployeeType()
    {
        return (int) (Math.random() * 100) % 3;
    }

    int getWorkingHrs(int empType)
    {
        switch (empType)
        {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    public void calculateTotalWage()
    {
        for (CompanyEmpWage1 company : companies)
        {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmpWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(CompanyEmpWage1 companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.company + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.empRatePerHour
                && totalWorkingHrs <= companyEmpWage.empRatePerHour; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        totalEmpWages.put(companyEmpWage.company, totalWage);
        return totalWage;
    }

    void printTotalEmpWages()
    {
        System.out.println("The Companies and their total Employee Wages are:");
        for (String companyName : totalEmpWages.keySet())
        {
            System.out.println(companyName + ": " + totalEmpWages.get(companyName));
        }

    }

    public static void main(String args[])
    {
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        employeeWageComputation.calculateTotalWage();
        employeeWageComputation.printTotalEmpWages();
    }
}