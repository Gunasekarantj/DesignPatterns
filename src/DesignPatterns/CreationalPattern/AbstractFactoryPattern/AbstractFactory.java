package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Abstract factory.
 */
abstract class AbstractFactory {
    /**
     * Gets .
     *
     * @param bank the bank
     * @return the
     */
    public abstract Bank getbank(String bank);

    /**
     * Gets loan.
     *
     * @param loan the loan
     * @return the loan
     */
    public abstract Loan getLoan(String loan);
}
