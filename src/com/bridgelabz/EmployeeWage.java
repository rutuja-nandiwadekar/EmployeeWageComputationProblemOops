package com.bridgelabz;

/*
 * Program to Compute Employee Wage and Save the Total Wage for Each Company
*/

public class EmployeeWage {
	// initialization
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHours;
	private int totalEmpWage;

	// parameterized constructor
	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHours) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHours = maxHours;
	}

	@Override
	public String toString() {
		return "Company Name : " + company + " Employee rate per hour : " + empRatePerHour
				+ " Number of working Days : " + numOfWorkingDays + " Max working hours per month : " + maxHours
				+ " Total Employee Wage for company " + company + " is: " + totalEmpWage;
	}

	/*
	 * This method is used to Compute Employee Wage for multiple companies
	 */
	public void computeEmpWage() {
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		EmployeeWage dMart = new EmployeeWage("Dmart", 25, 22, 100);
		EmployeeWage IKEA = new EmployeeWage("IKEA", 40, 25, 200);
		dMart.computeEmpWage();
		System.out.println(dMart);
		IKEA.computeEmpWage();
		System.out.println(IKEA);
	}
}
