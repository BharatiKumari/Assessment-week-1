import java.util.*;
public class largest {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && b>c){
            System.out.println("Greatest number is a: "+ a);
        } else if (b>a && b>c) {
            System.out.println("Greatest number is b: "+b);

        }
        else{
            System.out.println("Greatest number is c: "+c);
        }
    }
}
