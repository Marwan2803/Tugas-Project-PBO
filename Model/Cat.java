package model;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow!");
    }
}
