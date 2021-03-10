package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.AllPlans.CommercialPlan;
import DesignPatterns.FactoryPattern.AllPlans.DomesticPlan;
import DesignPatterns.FactoryPattern.AllPlans.InstitutionalPlan;
import DesignPatterns.FactoryPattern.Parent.Plan;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
