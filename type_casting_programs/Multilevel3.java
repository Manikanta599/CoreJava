class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Multilevel3 {
    public static void main(String[] args) {
        // Example 2: Upcasting and Downcasting with Shapes
        Shape shape1 = new Circle(); // Upcasting
        shape1.draw(); // Calls the draw method of the Circle class

       
            Circle circle1 = (Circle) shape1; // Downcasting
            circle1.draw(); // Calls the draw method of the Circle class
        

        Shape shape2 = new Square(); // Upcasting
        shape2.draw(); // Calls the draw method of the Square class

        
            Square square1 = (Square) shape2; // Downcasting
            square1.draw(); // Calls the draw method of the Square class
        
    }
}
