import java.util.Scanner;
public class Rotate_array {
    static void rotate(int[] arr,int n){
        int temp = arr[n-1];
        for(int i = n-2; i>=0;i--){
        arr[i+1] = arr[i];
    }
    arr[0] = temp;
    }
    static void rotatebyk(int[] arr , int n, int k){
        while(k>0){
            int temp = arr[n-1];
        for(int i = n-2; i>=0;i--){
        arr[i+1] = arr[i];

        }
        arr[0] = temp;
        k--;
    }
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        int n = arr.length;
        //rotate(arr , n);
        rotatebyk(arr, n, k);
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();

}
} 
