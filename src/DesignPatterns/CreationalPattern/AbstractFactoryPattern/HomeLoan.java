package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Home loan.
 */
public class HomeLoan extends Loan {

    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
