public class Missing_Number2 {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 3, 7, 5, 4 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int totalsum = 0;
        int arrsum = 0;
        for (int e : arr) {
            if (e < min) {
                min = e;

            }

        }
        System.out.println("The minimum value of array is:" + min);

        for (int e : arr) {
            if (e > max) {
                max = e;
            }

        }
        System.out.println("The maximum value of array is:" + max);
        for(int i=0; i<arr.length;i++){
            arrsum = arrsum+arr[i];
        }
        System.out.println("The sum of array element is:"+ arrsum);
        for(int i=min;i<=max;i++){
            totalsum = totalsum+i;
            
        }
        System.out.println("The total sum of array is:" + totalsum);
        int missing = totalsum - arrsum;
        System.out.println(missing);

    }
}