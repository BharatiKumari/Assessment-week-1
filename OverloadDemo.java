public class OverloadDemo {
    // Method with 2 parameters
    static void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    // Overloaded method with 3 parameters
    static void display(int a, int b, int c) {
        System.out.println("Three parameters: " + a + ", " + b + ", " + c);
    }

    // Overloaded method with different data type
    static void display(String s) {
        System.out.println("String parameter: " + s);
    }

    public static void main(String[] args) {
        display(10, 20);
        display(10, 20, 30);
        display("Hello Java");
    }
}
