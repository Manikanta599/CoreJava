class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

/**
 * Single1
 */
public class Single1 {

    public static void main(String[] args) {
        Animal a1=(Animal) new Dog();
        a1.speak();
        Dog d1=(Dog) a1;
        d1.bark();
    }
}
