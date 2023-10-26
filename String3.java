public class String3 {
    public static void main(String[] args){
        String letter = "Dear <|name|> , Thanks a lot!";
        letter  = letter.replace("<|name|>","Shrishty");
        System.out.println(letter);
    }
    
}
