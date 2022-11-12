package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Factory creator.
 */
public class FactoryCreator {
    /**
     * Gets factory.
     *
     * @param choice the choice
     * @return the factory
     */
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
