package DesignPatterns.Creational.abstractFactory.AbstractFactory;

import DesignPatterns.Creational.abstractFactory.AbstractProducts.*;

public interface ForestCreaturesFactory{
    TeddyBear createTeddyBear();
    ToyDragon createToyDragon();
    SparklyUnicorn createSparklyUnicorn();
}
