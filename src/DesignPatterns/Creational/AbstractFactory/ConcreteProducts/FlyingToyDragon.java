package DesignPatterns.Creational.AbstractFactory.ConcreteProducts;

import DesignPatterns.Creational.AbstractFactory.AbstractProducts.*;

public class FlyingToyDragon implements ToyDragon{
    public void fly(){
        System.out.println("Flying toy dragon soars through the sky");
    }
}
