package DesignPatterns.CreationalPattern.FactoryPattern.Factory;

import DesignPatterns.CreationalPattern.FactoryPattern.AllPlans.CommercialPlan;
import DesignPatterns.CreationalPattern.FactoryPattern.AllPlans.DomesticPlan;
import DesignPatterns.CreationalPattern.FactoryPattern.AllPlans.InstitutionalPlan;
import DesignPatterns.CreationalPattern.FactoryPattern.Parent.Plan;

/**
 * The type Get plan factory.
 */
public class GetPlanFactory {
    /**
     * Gets plan.
     *
     * @param planType the plan type
     * @return the plan
     */
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
