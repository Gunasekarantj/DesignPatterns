package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Bank factory.
 */
public class BankFactory extends AbstractFactory {
    @Override
    public Bank getbank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if (bank.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
