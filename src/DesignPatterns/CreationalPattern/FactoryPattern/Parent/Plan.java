package DesignPatterns.CreationalPattern.FactoryPattern.Parent;

/**
 * The type Plan.
 */
public abstract class Plan {
    /**
     * The Rate.
     */
    public double rate;

    /**
     * Gets rate.
     */
    public abstract void getRate();

    /**
     * Calculate bill.
     *
     * @param units the units
     */
    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
