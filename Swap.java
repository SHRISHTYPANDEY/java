import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values you want to swap");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        System.out.println("Before swapping: " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
        System.out.println();
        sc.close();

        

    }
    
}
