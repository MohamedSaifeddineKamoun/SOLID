package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        Duck batta = new Duck();
        Duck electricDuck = new ElectronicDuck();
        Duck elBatta = new ElectronicDuck();
        quack(donaldDuck, batta);
        electronicQuack(electricDuck, elBatta);
        swim(donaldDuck, batta);
        electronicSwim(electricDuck, elBatta);
        
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    private void electronicQuack(ElectronicDuck... electronicDucks)
    {
        for (ElectronicDuck electronicDuck : electronicDucks) {
            electronicDuck.turnOn();
            electronicDuck.electronicQuack();
            electronicDuck.turnOff();
        }
    }

    private void electronicSwim(ElectronicDuck... electronicDucks)
    {
        for (ElectronicDuck electronicDuck : electronicDucks) {
            electronicDuck.turnOn();
            electronicDuck.electronicSwim();
            electronicDuck.turnOff();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
