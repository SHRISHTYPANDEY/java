import java.util.Scanner;
public class Table{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
            }
        sc.close();
        }
    }
    

