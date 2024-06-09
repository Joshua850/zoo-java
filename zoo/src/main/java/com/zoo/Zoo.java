package com.zoo;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Animal> animals;
    private List<Zookeeper> zookeeper;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.zookeeper = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addZookeeper(Zookeeper newKeeper) {
        zookeeper.add(newKeeper);
    }

    public void assignZookeeperToAnimal(Zookeeper zookeeper, Animal animal) {
        animal.setZookeeper(zookeeper);
        zookeeper.assignAnimal(animal);
    }

    public void changeZookeepersAssignment(Zookeeper oldKeeper, Zookeeper newKeeper, Animal animal) {
        if (animal.getZookeeper() == oldKeeper) {
            oldKeeper.removeAnimal(animal);
            animal.setZookeeper(newKeeper);
            newKeeper.assignAnimal(animal);
        } else {
            System.out.println("The specified zookeeper is not assigned to this animal");
        }
    }
}