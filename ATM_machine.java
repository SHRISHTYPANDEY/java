import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        int balance=1000; 
        int withdrawl;
        int deposite;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdrawl");
            System.out.println("Choose 2 for deposite");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Choose a operation you want to do");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter money to be withdrawn:");
                withdrawl = sc.nextInt();
                if(balance>=withdrawl){
                    balance = balance-withdrawl;
                    System.out.println("Please collect your money");
                }
                else{
                    System.out.println("Insufficient balance");
                }
                System.out.println();
                break;
                case 2:
                System.out.println("Enter money to be deposited:");
                deposite = sc.nextInt();
                balance = balance+deposite;
                System.out.println("Your money has been successfully deposited");
                System.out.println();
                break;
                case 3:
                System.out.println("Balance: " + balance);
                break;
                case 4:
                System.exit(0);
                break;
            }
            sc.close();
    }
}
    
    
}
