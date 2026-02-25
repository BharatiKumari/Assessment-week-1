class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Calling method from Base Class
        myDog.eat();
        // Calling method from Derived Class
        myDog.bark();
    }
}
