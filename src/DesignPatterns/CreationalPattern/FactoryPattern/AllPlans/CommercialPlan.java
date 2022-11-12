package DesignPatterns.CreationalPattern.FactoryPattern.AllPlans;


import DesignPatterns.CreationalPattern.FactoryPattern.Parent.Plan;

/**
 * The type Commercial plan.
 */
public class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 10.50;
    }
}
