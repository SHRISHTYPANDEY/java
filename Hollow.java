import java.util.Scanner;

public class Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(j==1||i==j||i==n||j==n){
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
    
}
