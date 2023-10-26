import java.util.Scanner;

public class Sum_of_odd {
    public static int sumOfOddNumbers(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
            sum = sum + i;
        }
    }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sumOfOddNumbers(n);
        //System.out.println("The sum of n odd number is: " + sum); 
        sc.close();
    }

    
    
}
