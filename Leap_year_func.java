import java.util.Scanner;

public class Leap_year_func {
    public static void Year(int year){
        if((year%100!=0 && year%4==0)||(year%400==0)){
            System.out.println(year + " is a leap year");
        }
            else{
                System.out.println(year + " is not a leap year");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        Year(year);
        sc.close();
    }
    
}
