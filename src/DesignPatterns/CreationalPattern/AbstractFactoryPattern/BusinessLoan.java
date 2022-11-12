package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Business loan.
 */
public class BusinessLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
