import java.util.Scanner;

public class Armstrong {
    public static int length(int num){
        int count=0;
        while(num != 0){

        num /=10;
        count++;
        }
        return count;
    }


    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       
    }


