package DesignPatterns.Creational.abstractFactory.ConcreteProducts;

import DesignPatterns.Creational.abstractFactory.AbstractProducts.*;

public class SparklyUnicornToy implements SparklyUnicorn{
    public void sparkle(){
        System.out.println("Sparkly unicorn toy dazzles with its magical glow");
    }
}
