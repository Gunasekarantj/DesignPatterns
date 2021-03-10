package DesignPatterns.FactoryPattern.AllPlans;

import DesignPatterns.FactoryPattern.Parent.Plan;

public class InstitutionalPlan extends Plan {
    @Override
    public void getRate(){
        rate=5.50;
    }
};
