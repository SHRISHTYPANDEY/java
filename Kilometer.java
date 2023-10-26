import java.util.Scanner;
public class Kilometer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value which have to be converted: ");
        double a = sc.nextFloat();
        double miles = a*0.62137119;
        System.out.println(miles);
        sc.close();
    }
    
}
