import java.util.Scanner;
public class Vote {
    public static int vote(int age){
        if(age>=18){
            System.out.println("you can vote");
            return age;
        } else { 
            System.out.println("you cannot vote");
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        vote(age);
        sc.close();

    }
    
}
