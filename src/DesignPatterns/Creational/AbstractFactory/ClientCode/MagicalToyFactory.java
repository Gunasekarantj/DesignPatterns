package DesignPatterns.Creational.AbstractFactory.ClientCode;

import DesignPatterns.Creational.AbstractFactory.AbstractFactory.*;
import DesignPatterns.Creational.AbstractFactory.AbstractProducts.*;
import DesignPatterns.Creational.AbstractFactory.ConcreteFactory.*;

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
