import java.util.Scanner;
public class Bmi_index {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in meter: ");
        float height = sc.nextFloat();
        System.out.println("Enter your weight in kg: ");
        float weight = sc.nextFloat();
        float BMI = weight/(height*height);
        System.out.println("Your BMI is: " + BMI);
        sc.close();

    }
    
}
