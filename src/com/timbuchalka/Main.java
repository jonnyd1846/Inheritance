package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Animal kensey = new Animal("Kensey", 1,1, 1, 20);
        Animal milo = new Animal("Milo", 1, 1, 1, 20);
        Dog dog = new Dog("Bad Dog", 1,1, 5, 25, 1, 20, "silky");
        dog.eat();
        dog.walk();




    }

}
