/*
 * Design a SavingsAccount class that stores a savings account’s annual interest rate and balance. The class constructor
 * should accept the amount of the savings account’s starting balance. The class should also have methods for subtracting
 * the amount of a withdrawal, adding the amount of a deposit, and adding the amount of monthly interest to the balance.
 * The monthly interest rate is the annual interest rate divided by twelve. To add the monthly interest to the balance, 
 * multiply the monthly interest rate by the balance, and add the result to the balance.
 * 
 * Test the class in a program that calculates the balance of a savings account at the end of a period of time. It should
 * ask the user for the annual interest rate, the starting balance, and the number of months that have passed since the 
 * account was established. A loop should then iterate once for every month, performing the following:
 *		a. Ask the user for the amount deposited into the account during the month. Use the class method to add this
 *		   amount to the account balance.
 * 		b. Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract
 * 		   this amount from the account balance.
 * 		c. Use the class method to calculate the monthly interest.
 * 		   After the last iteration, the program should display the ending balance, the total amount of deposits, the total
 * 		   amount of withdrawals, and the total interest earned.
 */

public class SavingsAccount {

    private double startingbalance = 0.0;
    private double annualRate = 0.0, accRate;
    private double monthlyRate = 0.0;
    private double aDeposits = 0, aWithdrawals = 0;

    // Constructors
    public SavingsAccount() {

        startingbalance = 0.0;

    }

    public SavingsAccount(double b) {

        startingbalance = b;

    }

    public SavingsAccount(String bS) {

        startingbalance = Double.parseDouble(bS);
        //annualRate = Double.parseDouble(aRS);
    }

    // Setters
    public void withdraw(double wAmount) {
        startingbalance -= wAmount;
        aWithdrawals += wAmount;
    }

    public void deposit(double dAmount1) {
        startingbalance += dAmount1;
        aDeposits += dAmount1;
    }

    public void sumMInterest() {
        accRate += startingbalance * (annualRate / 12);
        startingbalance += startingbalance * (annualRate / 12);

    }

   
    public void setbBalance(double b) {
        startingbalance = b;
    }

    public void setARate(double aR) {
        annualRate = aR;
    }

    // Getters
    public double getbBalance() {
        return startingbalance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public double getMInterest() {
        return startingbalance * (annualRate / 12);
       
    }

    public double getAccInterest() {
        return accRate;
    }

    public double getAccDeposits() {
        return aDeposits;
    }

    public double getAccWithdrawals() {
        return aWithdrawals;
    }
}
