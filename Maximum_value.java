public class Maximum_value {
    public static void main(String[] args) {
        int []arr={1,3,76,89,100,43,2,5};
        int max = Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of maximum array element is: " + max);
    }
    
}
