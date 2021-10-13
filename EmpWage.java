package com.company1.EmployeeWageComputationUsingOOps;

interface EmpWage {
    void wagesForWorkingHourAndDays();
    void addEmpWage(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_HRS_IN_MONTH);
    int getTotalWage(String company);
}
