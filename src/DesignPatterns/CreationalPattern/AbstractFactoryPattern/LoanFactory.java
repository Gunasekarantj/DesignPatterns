package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Loan factory.
 */
public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getbank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        } else if (loan.equalsIgnoreCase("Education")) {
            return new EducationalLoan();
        }
        return null;
    }
}
