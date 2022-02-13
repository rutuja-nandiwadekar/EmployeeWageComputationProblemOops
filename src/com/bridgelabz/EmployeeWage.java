package com.bridgelabz;

/*This is refactor Code 
 * to write a Class Method 
 * to Compute Employee Wage 
*/
public class EmployeeWage {
	// initialization
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int PART_TIME = 1;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		computeEmpWage(); // calling method
	}

	/*
	 * This method is used to Calculate Wages till a condition of total working
	 * hours or days is reached for a month
	 */
	public static void computeEmpWage() {
		// variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		// computation
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < WORKING_DAYS) {
			totalWorkingDays++;
			// Used ((RANDOM)) for Attendance Check
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
			System.out.println("For Day" + totalWorkingDays + " : Employee Maximum Working Hours are " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * WAGE_PER_HR;
		System.out.println("Total Employee Wage for month is " + totalEmpWage);
	}
}
