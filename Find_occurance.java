public class Find_occurance {
    public static int first = -1;
    public static int last = -1;
    public static void getIndices(String str, char e1, int idx){
        if(idx == str.length()){
            return;
        }
        if(str.charAt(idx) == e1){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        getIndices(str, e1, idx+1);
    }
    public static void main(String[] args) {
        String str = "tabcdfghijakkk";
        char e1 = 'a';
        getIndices(str, e1, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
