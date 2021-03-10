package DesignPatterns.FactoryPattern.AllPlans;


import DesignPatterns.FactoryPattern.Parent.Plan;

public class CommercialPlan extends Plan {
    @Override
    public void getRate(){
        rate=10.50;
    }
}
