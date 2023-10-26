import java.util.Scanner;

public class Hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if (i == 1 || k == 1 || i == n || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();

    }
}
    
}
