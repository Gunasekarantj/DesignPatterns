package DesignPatterns.FactoryPattern.AllPlans;


import DesignPatterns.FactoryPattern.Parent.Plan;

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
