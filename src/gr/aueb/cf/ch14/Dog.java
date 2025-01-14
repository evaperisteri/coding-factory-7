package gr.aueb.cf.ch14;

public class Dog extends Animal{
    private String breed;

    public Dog(){


    }

    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("dog ate food");
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }


}
