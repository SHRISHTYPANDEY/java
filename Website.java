import java.util.Scanner;
public class Website {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name: ");
        String website  = sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is a organisational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
            sc.close();
        }
    }
    
}
