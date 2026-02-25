import java.util.*;
public class Gradesystem {
    static void main() {
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter marks (0-100): ");
                int marks = sc.nextInt();

                // Divide by 10 to get the tens digit for the switch
                switch (marks / 10) {
                    case 10:
                    case 9:
                        System.out.println("Grade: A");
                        break;
                    case 8:
                        System.out.println("Grade: B");
                        break;
                    case 7:
                        System.out.println("Grade: C");
                        break;
                    case 6:
                        System.out.println("Grade: D");
                        break;
                    default:
                        System.out.println("Grade: F");
                        break;
                }
            }
        }


