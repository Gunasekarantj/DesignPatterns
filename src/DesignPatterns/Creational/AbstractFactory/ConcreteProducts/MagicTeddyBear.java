package DesignPatterns.Creational.AbstractFactory.ConcreteProducts;

import DesignPatterns.Creational.AbstractFactory.AbstractProducts.*;

public class MagicTeddyBear implements TeddyBear{
    public void hug(){
        System.out.println("Magical teddy bear gives warm hugs");
    }

}
