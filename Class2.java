import java.util.Arrays;
public class Class2 {
    public static void main(String[] args) {
      /*   //Step 1 Declare
        int[][] int2DArray;
        //Step 2 instantiate
        int2DArray = new int[2][2];
       //step 3 Initialization
       int2DArray[0][0] = 1;
       int2DArray[0][1] = 2;
       int2DArray[1][0] = 3;
       int2DArray[1][1] = 4;
       System.out.println(Arrays.deepToString(int2DArray));
       // all together
       String s2DArray[][] = {{"a","b"},{"c","d"}};
       System.out.println(Arrays.deepToString(s2DArray)); */
       TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
       sda.insertValueInTheArray(0, 1, 10);
       //System.out.println(Arrays.deepToString(sda.arr));
       sda.insertValueInTheArray(1, 1, 20);
       sda.insertValueInTheArray(1, 02, 30);
       sda.insertValueInTheArray(0, 0, 5);
       //sda.accessCell(1,2);
       sda.traverse2DArray();
       sda.searchingValue(20);
       sda.deleteValue(1, 1);
       System.out.println(Arrays.deepToString(sda.arr));
       
    }
}
