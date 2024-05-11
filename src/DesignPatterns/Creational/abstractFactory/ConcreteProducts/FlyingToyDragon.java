package DesignPatterns.Creational.abstractFactory.ConcreteProducts;

import DesignPatterns.Creational.abstractFactory.AbstractProducts.*;

public class FlyingToyDragon implements ToyDragon{
    public void fly(){
        System.out.println("Flying toy dragon soars through the sky");
    }
}
