package L17.animal;

public class Cow extends Animal {
    private int age;

    public Cow(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public String toString() {
        return "Cow{name='" + name + "', age=" + age + "}";
    }
}

