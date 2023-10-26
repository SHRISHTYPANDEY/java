public class Minnimum_value {
    public static void main(String[] args) {
        int []arr = {455,24,78,01,56,87};
        int min = Integer.MAX_VALUE;
        for(int e : arr){
            if(e<min){
                min = e;
               
            }
          

        } 
        System.out.println("The minimum value of array is: " + min);
    }
    
}
