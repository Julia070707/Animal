package L17;

public class L17Main {
    public static void main(String[] args) {

        // Создание объектов для других классов и вывод информации с помощью метода toString
        Cat cat = new Cat("Whiskers", "Gray");
        Cow cow = new Cow("Bessie", 5);
        Dog dog = new Dog("Buddy", "Labrador");

        System.out.println(cat.toString());
        System.out.println(cow.toString());
        System.out.println(dog.toString());
    }
}
