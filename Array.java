public class Array{
    public static void main(String[] args) {
        int arr[] = {3,56,32,78,23,16};
        int secmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.println("the max element is:" + max);
        System.out.println("The sec max value is:" + secmax);
    }
}