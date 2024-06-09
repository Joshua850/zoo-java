package com.zoo;

import java.util.ArrayList;
import java.util.List;

class Zookeeper {
    private String name;
    private List<Animal> assignedAnimals;

    public Zookeeper(String name) {
        this.name = name;
        this.assignedAnimals = new ArrayList<>();
    }

    public void setName(String newName){
        this.name=newName;
    }

    public void assignAnimal(Animal animal) {
        assignedAnimals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        assignedAnimals.remove(animal);
    }

    public List<Animal> getAssignedAnimals() {
        return assignedAnimals;
    }
    public String getName(){
        return this.name;


    }
}
