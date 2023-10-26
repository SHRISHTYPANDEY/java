import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println("Even is:" + i);
            } else {
                if(i%2!=0){
                    System.out.println("odd is: " + i);
                }
            }
        }
        
    }
    
}
