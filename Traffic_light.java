import java.util.Scanner;
public class Traffic_light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of light");
        char color = sc.next().charAt(0);
        switch(color){
            case 'r':
            case 'R':
            System.out.println("Stop");
            break;
            case 'y':
            case 'Y':
            System.out.println("ready");
            break;
            case 'g':
            case 'G':
            System.out.println("Go");
            break;
            default:
            System.out.println("Please enter a valid color");
            break;
        }
        sc.close();

    }
    
}
