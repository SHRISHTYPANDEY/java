import java.util.Scanner;
public class StringCombination {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totalength = 0;
        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totalength +=array[i].length();
        
        }
        System.out.println("The total length is: " + totalength);
        sc.close();
        }
    
}
