public class Palindrome {
    public static void main(String[] args){
        String a= "Radar" , reverse = "";
        int aLength = a.length();
        for (int i = (aLength - 1); i>=0; i--){
            reverse = reverse + a.charAt(i);
        }
        if (a.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println(a + " is a palindrome string");
        }
        else{
            System.out.println(a + "is not a palindrome string");
        }

    }
    
}
