public class Grade {
    public static void main(String[] args){
         char grade = 'B';
         grade = (char)(grade + 8);  // encrypting the grade
         System.out.println(grade);
         grade = (char)(grade - 8);  //Decrypting the grade
         System.out.println(grade);
    }
    
}
