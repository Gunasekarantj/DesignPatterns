package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Educational loan.
 */
public class EducationalLoan extends Loan {

    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
