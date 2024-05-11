package DesignPatterns.Creational.AbstractFactory.ConcreteProducts;

import DesignPatterns.Creational.AbstractFactory.AbstractProducts.*;

public class SparklyUnicornToy implements SparklyUnicorn{
    public void sparkle(){
        System.out.println("Sparkly unicorn toy dazzles with its magical glow");
    }
}
