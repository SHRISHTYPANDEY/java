import java.util.Scanner;
public class Pass_fail {
    public static void main(String[] args){
    byte sub1 , sub2 , sub3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first subject marks: ");
    sub1 = sc.nextByte();
    System.out.println("Enter your second subject marks: ");
    sub2 = sc.nextByte();
    System.out.println("Enter your third subject marks: ");
    sub3 = sc.nextByte();
    Float avg = (sub1 + sub2 + sub3)/3.0f;
    System.out.println("Your percentage is: " + avg);
    if(avg>=40 && avg>=30){
        System.out.println("congratulations! You have been promoted");
    }
    else{
        System.out.println("You are fail!,Please try again");
    }
    sc.close();
    }
}
