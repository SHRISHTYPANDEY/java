import java.util.Scanner;

public class Average_temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days temperature: ");
        int numDays = sc.nextInt();
        int[] temp = new int[numDays];
        // record temperatures and find average
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i + 1) + "'s high teperature");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }
        double average = sum / numDays;
        // Count days of average
        int above = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average) {
                above++;
            }
        }
        sc.close();
        System.out.println();
        System.out.println("Average temperature = " + average);
        System.out.println(above + " days above temperature");
    }
    

}
