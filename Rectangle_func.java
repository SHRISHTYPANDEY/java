import java.util.Scanner;


public class Rectangle_func {
    public static double Perimeter(double length, double breadth){
        double perimeter = (2*length) + breadth;
        return perimeter;
        
    }
    public static double Area(double length, double breadth){
        double area = length * breadth;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        System.out.println("Enter the breadth: ");
        float breadth = sc.nextFloat();
        System.out.println("The perimeter is: "+ Perimeter(length, breadth));
        System.out.println("The area is: " + Area(length, breadth));

    } 
    
}
