package DesignPatterns.CreationalPattern.FactoryPattern.AllPlans;

import DesignPatterns.CreationalPattern.FactoryPattern.Parent.Plan;

/**
 * The type Institutional plan.
 */
public class InstitutionalPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
};
