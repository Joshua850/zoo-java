package com.zoo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zoo zoo = new Zoo();
        Zookeeper keeperJohn = new Zookeeper("John");
        Zookeeper keeperMary = new Zookeeper("Mary");
        Animal lion = new Animal("Simba", 12, "Lion");

        zoo.addZookeeper(keeperMary);
        zoo.addZookeeper(keeperJohn);
        zoo.addAnimal(lion);

        zoo.assignZookeeperToAnimal(keeperMary, lion);
        System.out.println(lion.getZookeeperNanem());
        System.out.println("Do you want to reassign Lion? (y/n)");
        char A=sc.next().charAt(0);
        if (A=='y') {
            System.out.println("Reassigning animal....");
            zoo.changeZookeepersAssignment(keeperMary, keeperJohn, lion);
            System.out.println("Reassignment complete");
        } else {
            System.out.println("Exiting");
        }
        sc.close();
    }
}