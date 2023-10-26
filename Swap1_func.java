import java.util.Scanner;

public class Swap1_func { 
    public static void Swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("first is: " + a +" second is: "+b);
    }
    public static void Swap2(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("First is: " + a + " second is: " + b);
    }
    public static void Swap3(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("First is: " + a + " second is: " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("the value before swapping: " + a + "and" + b);
        Swap(a, b);
        Swap2(a, b);
        Swap3(a, b);
        sc.close();

    }
    
}
