import java.util.Scanner;
public class Name {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name? ");
    String Name = sc.next();
    System.out.println("Hello " + Name + " Have a good day!");
    sc.close();
    } 
}
