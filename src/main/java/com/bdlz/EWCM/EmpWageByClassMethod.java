package com.bdlz.EWCM;

public class EmpWageByClassMethod {

    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static  double empCheck = Math.floor(Math.random() * 10) % 2;

    public static void main(String[] args) {
        System.out.println("Welcome to EmpWage program by Class Method");
        empPresentOrAbsent();
        empDailyWage();
    }
    public static void empPresentOrAbsent() {
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is Present");
        } else {
            System.out.println("employee is Absent");
        }
    }
    public static void empDailyWage() {
        int empHrs = 0;
        int empWage = 0;
        if ( empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:" + empWage);
    }
}
