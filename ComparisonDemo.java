class Parent {
    // For Overriding
    void message() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    // DEMONSTRATING OVERRIDING
    @Override
    void message() {
        System.out.println("Message from Child (Overridden)");
    }

    // DEMONSTRATING OVERLOADING
    void calculate(int a, int b) {
        System.out.println("Sum of two: " + (a + b));
    }

    void calculate(int a, int b, int c) {
        System.out.println("Sum of three: " + (a + b + c));
    }
}

public class ComparisonDemo {
    public static void main(String[] args) {
        Child obj = new Child();

        // Testing Overriding
        obj.message();

        // Testing Overloading
        obj.calculate(10, 20);
        obj.calculate(10, 20, 30);
    }
}
