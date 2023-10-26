import java.util.Scanner;
public class Comparison {
    public static void main(String[] args){
        int a = 80;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>a);
        sc.close();

    }
    
}
