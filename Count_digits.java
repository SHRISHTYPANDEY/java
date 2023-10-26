import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while(a>0){
            int p = a%10;
            a/=10;
            sum+=1;
            sc.close();


        }
        System.out.println(sum);
        System.out.println(p);


    }
    
}
