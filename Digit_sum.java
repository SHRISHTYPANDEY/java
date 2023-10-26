import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while(a>0){
            int p = a%10;
            a/=10;
            sum+=p;


        }
        System.out.println(sum);

    }
    
}
