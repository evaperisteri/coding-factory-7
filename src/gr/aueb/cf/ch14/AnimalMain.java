package gr.aueb.cf.ch14;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog(5, "Tommy", "Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog);
    }

    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
