package DesignPatterns.Creational.abstractFactory.ClientCode;

import DesignPatterns.Creational.abstractFactory.AbstractFactory.*;
import DesignPatterns.Creational.abstractFactory.AbstractProducts.*;
import DesignPatterns.Creational.abstractFactory.ConcreteFactory.*;

public class MagicalToyFactory{
    public static void main(String[] args){
        ForestCreaturesFactory forestFactory = new ForestCreaturesMagicFactory();
        TeddyBear teddyBear = forestFactory.createTeddyBear();
        teddyBear.hug();
        ToyDragon toyDragon = forestFactory.createToyDragon();
        toyDragon.fly();
        SparklyUnicorn sparklyUnicorn = forestFactory.createSparklyUnicorn();
        sparklyUnicorn.sparkle();
    }
}
