import java.util.Scanner;
public class Percentage{
    public static void main(String[] args) {
        System.out.println("Enter your marks of five subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st subject marks: ");
        float a = sc.nextFloat();
        System.out.println("Enter your 2nd subject marks: ");
        float b = sc.nextFloat();
        System.out.println("Enter your 3rd subject marks: ");
        float c = sc.nextFloat();
        System.out.println("Enter your 4th subject marks: ");
        float d = sc.nextFloat();
        System.out.println("Enter your 5th subject marks: ");
        float e = sc.nextFloat();
        System.out.println("Your percentage is: ");
        float total = (a+b+c+d+e);
        float percentage = (total/500)*100;
        System.out.println(percentage);
        sc.close();
    }
}