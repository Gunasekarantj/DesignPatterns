package DesignPatterns.Creational.AbstractFactory.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.AbstractProducts.*;

public interface ForestCreaturesFactory{
    TeddyBear createTeddyBear();
    ToyDragon createToyDragon();
    SparklyUnicorn createSparklyUnicorn();
}
