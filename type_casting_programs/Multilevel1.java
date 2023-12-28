class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog
{
    public void learn()
    {
        System.out.println("puppy learning ");
    }
}

/**
 * Multilevel1
 */
public class Multilevel1 {

    public static void main(String[] args) {
        Dog d1=(Dog) new Puppy();
        d1.bark();
        d1.speak();
        Animal a=(Animal) new Dog();
        a.speak();
        
       

    }
}