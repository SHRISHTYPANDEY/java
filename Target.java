public class Target {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found at index" +i);
            }else if(arr[i]!=target){
                System.out.println("Not Found");
            }else{
                System.out.println("Not Found");
            }
        }
    }
    
}
