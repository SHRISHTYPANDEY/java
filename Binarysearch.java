public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key=6;
        int index = Binarysearch(arr,key);
        if(index == -1){
            System.out.println("Element not found in array");
        
        }
        else{
            System.out.println("index is" + index);
 
        }
        
    }
    
}
