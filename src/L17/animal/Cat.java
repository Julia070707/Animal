package L17.animal;

public class Cat extends Animal {
    private String furColor;

    public Cat(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', furColor='" + furColor + "'}";
    }
}
