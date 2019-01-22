package com.timbuchalka;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    public void chew() {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called calls chew() and super.eat()");
        chew();
        super.eat();
    }


    public void move(int speed) {
        System.out.println("dog.move() called " + speed);
        super.move(speed);
    }

    public void walk() {
        System.out.println("dog.walk() called calls super.move()");
        super.move(5);
    }

    public void run() {
        System.out.println("dog.run() called ");
        super.move(10);
    }





}
