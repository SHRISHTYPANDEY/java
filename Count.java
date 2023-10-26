import java.util.Scanner;

public class Count {
    public static void main(String args[]){
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        System.out.println("Press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1){
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            } else if(number<0){
                negative++;
            } else{
                zeroes++;
            }
            System.out.println("Press 1 to continue 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("positives: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("zeroes: " + zeroes);
    }
    
}
