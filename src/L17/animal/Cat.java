package L17.animal;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return Objects.equals(name, cat.name) && furColor.equals(cat.furColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, furColor);
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', furColor='" + furColor + "'}";
    }
}
