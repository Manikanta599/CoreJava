class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }

    void specificCircleMethod() {
        System.out.println("This is a specific circle method");
    }
}

public class Single2 {
    public static void main(String[] args) {
        Shape s1=(Shape) new Circle();
        s1.draw();
        Circle c1=(Circle) s1;
        c1.draw();
        c1.specificCircleMethod();
       
    }
}
