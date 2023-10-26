import java.util.Scanner;

public class Reverse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
           }
            System.out.println();

        }
        sc.close();
    }
    
}
