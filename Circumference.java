import java.util.Scanner;
public class Circumference {
    public static double calculateCircumference(double r){
        double circumference = 2*3.14*r;
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double r = sc.nextFloat();
        double circumference = calculateCircumference(r);

        System.out.println(circumference);
        sc.close();
    }
    
}
