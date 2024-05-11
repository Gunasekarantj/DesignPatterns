package DesignPatterns.Creational.abstractFactory.ConcreteFactory;

import DesignPatterns.Creational.abstractFactory.AbstractFactory.*;
import DesignPatterns.Creational.abstractFactory.AbstractProducts.*;
import DesignPatterns.Creational.abstractFactory.ConcreteProducts.*;

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
