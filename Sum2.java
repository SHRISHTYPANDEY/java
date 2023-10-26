import java.util.Scanner;
public class Sum2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(i = 0; i<=n;i++){
            sum = sum + 2*i;
            sc.close();
        }
        System.out.println("The sum of even numbers: " + sum);
    }
    
    
}
