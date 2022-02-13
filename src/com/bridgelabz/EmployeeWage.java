package com.bridgelabz;

public class EmployeeWage {
	// initialization
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int PART_TIME = 1;
	public static final int WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		computeEmpWage(); // calling method
	}

	/*
	 * This method is used to Calculate Wages for a Month. used Switch Case
	 * Statement
	 */
	public static void computeEmpWage() {
		// variables
		int FullDayHours = 0;
		int dailyWage = 0;
		int totalWage = 0;

		for (int day = 1; day <= WORKING_DAYS; day++) {
			System.out.println("FOR DAY " + day);
			// Used ((RANDOM)) for Attendance Check
			int empCheck = (int) (Math.random() * 100) % 3;
			// computation
			switch (empCheck) {
			case FULL_TIME:
				FullDayHours = 16;
				dailyWage = FullDayHours * WAGE_PER_HR;
				System.out.println("Employee is present for full time \n And Salary is " + dailyWage);
				break;
			case PART_TIME:
				FullDayHours = 8;
				dailyWage = FullDayHours * WAGE_PER_HR;
				System.out.println("Employee is present for part time \n And Salary is " + dailyWage);
				break;
			default:
				FullDayHours = 0;
				dailyWage = FullDayHours * WAGE_PER_HR;
				System.out.println("Employee is absent \n And Salary is " + dailyWage);
				break;
			}
			totalWage += dailyWage;
		}
		System.out.println("Total wage for a month is " + totalWage);
	}
}
