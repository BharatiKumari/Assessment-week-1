class Student {
    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();

        // Using Parameterized Constructor
        Student s2 = new Student("Rahul", 101);

        System.out.print("Object 1: ");
        s1.display();
        System.out.print("Object 2: ");
        s2.display();
    }
}
