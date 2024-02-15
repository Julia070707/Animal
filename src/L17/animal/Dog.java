package L17.animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "'}";
    }
}
