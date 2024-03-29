public class SingleDimensionalArray {
    int arr[] = null;
    public SingleDimensionalArray(int sizeOfArray)
    {
        arr = new int [sizeOfArray];
        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;

        }
    }
    // Array insertion
    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
            arr[location] = valueToBeInserted;
            System.out.println("Successfully Inserted");

        }else{
            System.out.println("This cell is already occupied");
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid index to access array!");
    }
}
//Array traversal
    public void traverseArray(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i] + " ");
            } 
        }catch (Exception e){
                System.out.println("Array is no longer exists!");
            }
            }
        // Element searching in array
        public void searchInArray(int valueToSearch){
            for(int i =0;i<arr.length;i++){
                if(arr[i] == valueToSearch){
                    System.out.println("Value is found at the index of "+i);
                    return;
                }
            } 
            System.out.println(valueToSearch + " is not found");
        }
        // Delete value from array
        public void deleteValue(int valueToBeDeleted){
            try{
                arr[valueToBeDeleted] = Integer.MIN_VALUE;
                System.out.println("The value is deleted successfully");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The value that is provided is not in the range of array");
            }
        } 
    
    }

