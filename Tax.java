import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        float income = sc.nextFloat();
        if(income <=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5.0f && income<10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10f - 5.0f);
            tax =  tax +0.03f * (income - 10.0f);
        }
        System.out.println("The total tax paid by an employee is: " + tax);
        sc.close();
    }

    }
