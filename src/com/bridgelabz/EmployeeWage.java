package com.bridgelabz;

/*Program to compute Employee Wage for Multiple Company 
 * in Procedural Way Using Class Method function parameters
*/

public class EmployeeWage {
	// initialization of constant variables
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		EmployeeWage dMart = new EmployeeWage();
		dMart.computeEmpWage("Dmart", 25, 22, 100);
		EmployeeWage relianceDigital = new EmployeeWage();
		relianceDigital.computeEmpWage("IKEA", 40, 25, 200);
	}

	/*
	 * This method is used to Compute Employee Wage for multiple companies
	 */
	public int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHours) {
		// variables
		int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
		// computation
		while (totalEmpHrs < maxHours && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			// Using ((RANDOM)) for Attendance Check
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Company Name : " + company);
		System.out.println("Employee rate per hour : " + empRatePerHour);
		System.out.println("Number of working Days : " + numOfWorkingDays);
		System.out.println("Max working hours per month : " + maxHours);
		System.out.println("Total Employee Wage for company " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}
}
