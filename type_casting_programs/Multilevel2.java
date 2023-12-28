// Base class
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Derived class 1
class Mammal extends Animal {
    public void giveBirth() {
        System.out.println("Mammal giving birth");
    }
}

// Derived class 2
class Bird extends Animal {
    public void fly() {
        System.out.println("Bird flying");
    }
}

// Derived class 3
class Dolphin extends Mammal {
    public void swim() {
        System.out.println("Dolphin swimming");
    }
}

public class Multilevel2 {
    public static void main(String[] args) {
        // Upcasting: Dolphin is a Mammal, and Mammal is an Animal
        Animal animal1 = new Dolphin();
        animal1.makeSound(); // Calls the makeSound method of Animal

        // Downcasting: Animal to Mammal
       
            Mammal mammal1 = (Mammal) animal1;
            mammal1.giveBirth(); // Calls the giveBirth method of Mammal
        

        // Upcasting: Bird is an Animal
        Animal animal2 = new Bird();
        animal2.makeSound(); // Calls the makeSound method of Animal

        // Downcasting: Animal to Bird
        if (animal2 instanceof Bird) {
            Bird bird1 = (Bird) animal2;
            bird1.fly(); // Calls the fly method of Bird
        }

        // Upcasting: Dolphin is a Mammal, and Mammal is an Animal
        Animal animal3 = new Dolphin();
        animal3.makeSound(); // Calls the makeSound method of Animal

        // Downcasting: Animal to Dolphin
       
            Dolphin dolphin1 = (Dolphin) animal3;
            dolphin1.swim(); // Calls the swim method of Dolphin
        
    }
}
