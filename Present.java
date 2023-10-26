public class Present {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int num = 6;
        boolean isInArray = false;
        for(int element : a){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }
   }
    
}
