public class TwoDimensionalArray {
    int arr[][] = null;
    //constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }
    //inserting value in the array
    public void insertValueInTheArray(int row,int col,int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else{
                System.out.println("This cell is already occupied1");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");

        }
    }
        //Accessing cell value of array
        public void accessCell(int row, int col){
            System.out.println("\nAccessing row" + row + ",Col" + col);
            try{
                System.out.println("Cell value is:" + arr[row][col]);

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index for 2D array");
            }
        }
        //Traverse 2D array
        public void traverse2DArray(){
            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr[0].length;col++){
                    System.out.println(arr[row][col] + " ");
                }
                System.out.println();
            }
        }
        // searching a simgle value in array
        public void searchingValue(int value){
            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr[0].length;col++){
                    if(arr[row][col] == value){
                        System.out.println("Value is found at row: " + row + " col: " + col);

                    }
                }
            }
        }
        // Deleting a value from array
        public void deleteValue(int row, int col){
        try{
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This index is invlaid for array");
        }
    }
}
