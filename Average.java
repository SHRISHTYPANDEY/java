import java.util.Scanner;

public class Average {
    public static float averageOfThreeNumbers (float a, float b, float c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter the third number: ");
        float c = sc.nextFloat();
        float avg = averageOfThreeNumbers(a,b,c);
        System.out.println("The average of three number is:" + avg);
        sc.close();
    }
    
    
}
