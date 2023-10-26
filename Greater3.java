import java.util.Scanner;
public class Greater3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        System.out.println((a>b && a>c)?"a is greater":(b>a && b>c)?"b is greater":"C is greater");
        sc.close();


    }
    
}
