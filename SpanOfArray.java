public class SpanOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of maximum element of array element is: " + max );
        for(int e:arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The value of minimum element of array is:" + min);
        System.out.println("The span of array is:" + (max - min));
    }
    
    
}
