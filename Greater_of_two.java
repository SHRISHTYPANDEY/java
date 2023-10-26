import java.util.Scanner;

public class Greater_of_two {
    public static int greaterOfTwoNumber(int a, int b){
        //int greater;
        if(a>b){
           // greater = a;
            System.out.println("greatest number: " + a);
            return a;
        } else { 
            //greater = b;
            System.out.println("greatest number: " + b);
            return b;
        }
    }
       public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number a: ");
            int a = sc.nextInt();
            System.out.println("Enter number b: ");
            int b = sc.nextInt();
            greaterOfTwoNumber(a, b);
        }
}