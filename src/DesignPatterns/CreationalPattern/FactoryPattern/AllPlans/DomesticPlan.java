package DesignPatterns.CreationalPattern.FactoryPattern.AllPlans;


import DesignPatterns.CreationalPattern.FactoryPattern.Parent.Plan;

/**
 * The type Domestic plan.
 */
public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
