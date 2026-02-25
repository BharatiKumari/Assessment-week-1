class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Base class reference pointing to derived class objects
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw(); // Calls Circle's version
        s2.draw(); // Calls Rectangle's version
    }
}
