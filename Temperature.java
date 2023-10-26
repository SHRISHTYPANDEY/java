import java.util.Scanner;
public class Temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        float temp = sc.nextFloat();
        float fehrenheit = temp* 9/5 + 32;
        System.out.println("The converted temp is:" + fehrenheit);
        sc.close();

    }
    
}
