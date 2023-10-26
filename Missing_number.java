public class Missing_number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,5};
        int n =arr.length;
        int totalsum = n * (n+1) / 2;
        int arrsum = 0;
        for(int i=0; i<n;i++){
            arrsum = arrsum+arr[i];
        }
        int missing = totalsum - arrsum;
        System.out.println(missing);
        
    }
}
