package com.mahdi_abdurrahman.utilities;

public class Calculator {
    //Instance Variables
    public static final int MONTHS_IN_YEAR = 12;
    public static final int BODY_MASS_INDEX = 703;

    /**
     * calculateFutureValue - calculates the future value
     * @param monthlyPayment - a double represents the monthly payment
     * @param yearlyInterestRate - a double represents the interest rate
     * @param years - an integer represents the number of years
     * @return double - returns a double representing the future value
     */
    public static double calculateFutureValue(double monthlyPayment,
                                              double yearlyInterestRate, int years) {
        int months = years * MONTHS_IN_YEAR;
        double monthlyInterestRate = yearlyInterestRate / MONTHS_IN_YEAR / 100;
        double futureValue = 0;

        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyPayment) * (1 + monthlyInterestRate);
        }

        return futureValue;

    }//end of the calculateFutureValue Method

    /**
     * calculateBodyMassIndex - calculates the body mass index based on the input of standard
     * measurements in pounds and inches.
     * @param weight - a double represents the weight in pounds
     * @param height - a double represents the height in inches
     * @return double - returns a double representing the Body Mass Index
     */
    public static double calculateBodyMassIndex(double weight, double height) {
        return (weight / (height * height) * BODY_MASS_INDEX);

    }//end of the calculateBodyMassIndex Method
}//end of the Calculator Class
