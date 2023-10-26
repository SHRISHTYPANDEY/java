import java.util.Scanner;
    public class Reverse_table{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            for(int i=10;i>=1;i--){
                System.out.printf("%d X %d = %d\n",a,i,a*i);
            }
            sc.close();
        }
    }
