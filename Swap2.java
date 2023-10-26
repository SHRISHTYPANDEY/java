import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping: " + a + " " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: " + a + " " + b);
        sc.close();
    }
    
}
