public class Strictly_inc_array {
    public static boolean chechIfIncreasing(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(!chechIfIncreasing(arr, idx+1)){
            return false;
        }
        return arr[idx] < arr[idx+1];
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,6,3,4,5};
        if(chechIfIncreasing(arr1, 0)){
            System.out.println("Strictly increasing");
        } else{
            System.out.println("Not strictly increasing");
        }
    }
    
}
