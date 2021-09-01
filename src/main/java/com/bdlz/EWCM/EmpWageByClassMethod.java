package com.bdlz.EWCM;

public class EmpWageByClassMethod {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;

    public static  double empCheck = Math.floor(Math.random() * 10) % 3;

    public static int empHrs = 0;
    public static int empWage = 0;
    public static int totalEmpWage = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to EmpWage program by Class Method");
//        empWagePerMonth();
//        empDailyWage();
//        empPartTimeWage();
//        wageUsingSwitchCase();
        empWagePerMonth();

    }
    public static void empPresentOrAbsent() {
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is Present for Full Time");
        } else if (empCheck == IS_PART_TIME) {
            System.out.println("employee is present for Part Time");
        } else {
            System.out.println("employee is Absent");
        }
    }
    public static void empDailyWage() {
        if ( empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:" + empWage);
    }
    public static void empPartTimeWage() {
        if ( empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Salary for Full Time");
        } else if (empCheck == IS_PART_TIME) {
            empHrs = 4;
            System.out.println("Salary for Part Time");
        }else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:" + empWage);
    }
    public static void wageUsingSwitchCase() {
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Salary for Full Time");
                break;
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Salary for Part Time");
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
    public static void empWagePerMonth() {
        for (int day = 1; day<=NO_OF_WORKING_DAYS; day++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage For Month: " + totalEmpWage);
    }
}
