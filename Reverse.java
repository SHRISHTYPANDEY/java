public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int temp = 0;
        for(i=0;i<j;i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    
}
