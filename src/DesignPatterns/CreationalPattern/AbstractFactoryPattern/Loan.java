package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Loan.
 */
abstract class Loan {
    /**
     * The Rate.
     */
    protected double rate;

    /**
     * Gets interest rate.
     *
     * @param rate the rate
     */
    abstract void getInterestRate(double rate);

    /**
     * Calculate loan payment.
     *
     * @param loanAmount the loan amount
     * @param years      the years
     */
    public void calculateLoanPayment(double loanAmount, int years) {
        double EMI;
        int n;

        n = years * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
        System.out.println("Your monthly EMI is"+EMI+"for the amount"+loanAmount+"you have borrowed");
    }
}
