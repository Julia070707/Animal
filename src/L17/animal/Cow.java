package L17.animal;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Cow cow = (Cow) obj;
        return age == cow.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public String toString() {
        return "Cow{name='" + name + "', age=" + age + "}";
    }
}

