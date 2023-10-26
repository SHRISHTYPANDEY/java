public class X_endOfString {
    // to add all x to the end of string
    public static String addX(int count){
        String newString = "x";
        for(int i=1;i<count;i++){
            newString += "x";
        }
        return newString;
    }
    public static void moveAllX(String str, int idx, int count){
        if(idx == str.length()){
            return addX(count);
        }
        if(str.charAt(idx) == 'x'){
            return moveAllX(str, idx+1, count+1);
        } else {
            String newString = moveAllX(str, idx+1, count);
            return str.charAt(idx) + nextStr; 
        }
    }
    public static void main(String[] args) {
        String str = "abxcxdefxghixjkxlxxmn";
        int count = 0;

        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }
    
}
