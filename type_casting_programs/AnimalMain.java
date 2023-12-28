class Animal {
    public void roam() {
        System.out.println("Animal roaming...");
    }
}

class WildAnimal extends Animal {
    public void hunt() {
        System.out.println("WildAnimal hunting...");
    }
}

class Lion extends WildAnimal {
    public void rule() {
        System.out.println("Lion ruling...");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        
        WildAnimal a1 = (WildAnimal) new Lion();
        a1.hunt(); 
        a1.roam();

        
        Animal a = (Animal) a1;
        a.roam(); 

        
        WildAnimal w = (WildAnimal) a;
        w.hunt();
        w.roam();

       
        Lion l = (Lion) w;
        l.roam();
        l.hunt();
        l.rule(); 
    }
}
