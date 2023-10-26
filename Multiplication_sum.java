import java.util.Scanner;
public class Multiplication_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        for(i = 1;i<=10;i++){
            System.out.printf("%d\n",n*i);
            sum = sum + n*i; 
            sc.close();
        }
        System.out.println(sum);
       
    }
}
