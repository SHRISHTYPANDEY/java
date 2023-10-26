public class Pivot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,10};
        int n=arr.length;
        int totalSum = 26;
        int leftSum = 0;
        int rightSum = totalSum;
        for(int i=0;i<n;i++){
            rightSum = rightSum-arr[i];
            if(leftSum == rightSum){
                System.out.println(i);
                break;
            }
            leftSum += arr[i];
        }
        
    }
    
}
