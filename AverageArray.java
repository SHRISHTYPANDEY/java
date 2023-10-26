public class AverageArray {
    public static void main(String[] args) {
        float [] marks = {88.5f,45f,34.5f,67.5f,88f};
        float sum = 0;
        for(float element : marks){
            sum = sum+element; 
        }
        System.out.println("The average marks is: " + sum/marks.length);
    }
    
}
