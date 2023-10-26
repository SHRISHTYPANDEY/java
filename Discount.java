import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ammount");
        double bill = sc.nextDouble();
        double dis = 0;
        if(bill<1000){
            dis = 0;
        } else if(bill<=5000){
            dis = bill*0.05;

        }else if(bill<=10000){
            dis = bill*0.1;
        }else{
            dis = bill*0.5;
        }
        System.out.println("Discount is " + dis);
        bill = bill-dis;
        System.out.println("Bill is" + bill);
        sc.close();
    }
    
}
