package DesignPatterns.Creational.AbstractFactory.ConcreteFactory;

import DesignPatterns.Creational.AbstractFactory.AbstractFactory.*;
import DesignPatterns.Creational.AbstractFactory.AbstractProducts.*;
import DesignPatterns.Creational.AbstractFactory.ConcreteProducts.*;

public class ForestCreaturesMagicFactory implements ForestCreaturesFactory{
    public TeddyBear createTeddyBear(){
        return new MagicTeddyBear();
    }

    public ToyDragon createToyDragon(){
        return new FlyingToyDragon();
    }

    public SparklyUnicorn createSparklyUnicorn(){
        return new SparklyUnicornToy();
    }
}
