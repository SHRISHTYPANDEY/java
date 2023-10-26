import java.util.Scanner;
public class Avg_marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your class: ");
        int c = sc.nextInt();
        System.out.println("Enter your marks: ");
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int bio = sc.nextInt();
        int maths = sc.nextInt();
        int eng = sc.nextInt();
        float avg = (phy + chem + bio + maths + eng)/5;  
        System.out.println("Your average marks is: " + avg);
        sc.close();

        
    }
    
}
