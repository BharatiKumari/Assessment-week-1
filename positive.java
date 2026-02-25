import java.util.*;
public class positive {
    static void main() {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
        if (n == 0) {
            System.out.println(n + " is Zero");
        } else {
            // Use the sign-propagating right shift (>>)
            // Positive: sign will be 0
            // Negative: sign will be -1
            int sign = (n >> 31);

            if (sign == 0) {
                System.out.println(n + " is Positive");
            } else {
                System.out.println(n + " is Negative");
            }
        }
    }


}

