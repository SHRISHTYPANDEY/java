import java.util.Scanner;

public class Upper_func {
    public static String Uppercase(String str){
        String a = str.toUpperCase();
        return a;
    }
    public static String Lowercase(String str){
        String b = str.toLowerCase();
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1 = sc.nextLine();
        String s = Uppercase(s1);
        String t = Lowercase(s);
        System.out.println(s);
        System.out.println(t);
       
    }
    
}
