import java.util.Scanner;
public class Netsalary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        float bs = sc.nextFloat();
        float hra = bs*30/100;
        float ta = bs*20/100;
        float da = bs*10/100;
        float pf = 1500;
        double net_salary = (bs + hra + ta + da) - pf;
        System.out.println("Your net salary is: " + net_salary);
        sc.close();


    }
    
}
