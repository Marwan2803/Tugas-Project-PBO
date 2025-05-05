package model;

public class Dog extends Pet implements Trainable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public void train() {
        System.out.println(getName() + " is learning to fetch!");
    }
}
