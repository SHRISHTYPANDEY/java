import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n<=1){
            System.out.print("Number is not prime");
        }
        for (int i = 1;i<n/2; i++){
            if(n%i==0){
                count++;
            }
            else if(count>1){
                System.out.println("The number is not prime");
            }else{
            System.out.print("Number is prime");
            }
    }
    sc.close();
}
}
