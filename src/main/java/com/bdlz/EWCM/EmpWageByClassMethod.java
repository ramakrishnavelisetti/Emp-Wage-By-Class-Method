package com.bdlz.EWCM;

public class EmpWageByClassMethod {
    public static void main(String[] args) {
        System.out.println("Welcome to EmpWage program by Class Method");
        empPresentOrAbsent();
    }
    public static void empPresentOrAbsent() {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is Present");
        } else {
            System.out.println("employee is Absent");
        }
    }
}
