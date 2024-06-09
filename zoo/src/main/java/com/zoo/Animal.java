package com.zoo;

class Animal {
    private int age;
    private String name;
    private String species;
    private Zookeeper zookeeper;

    public Animal( String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Zookeeper getZookeeper() {
        return this.zookeeper;
    }

    public String getZookeeperNanem(){
        return this.zookeeper.getName();
    }

    // Setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
}
