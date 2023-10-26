public class Tower_of_hanoi {
    public static void tower_of_hanoi(int n, String a,  String b,  String c){
        if(n==1){
            System.out.println("Move disk" + n + "from" + a + "to" + c);
            return;
        }
        tower_of_hanoi(n-1, a, c, b);
        System.out.println("move disk" + n + "from" + a + "to" + b);
        tower_of_hanoi(n-1, b, a, c);
    }
    public static void main(String[] args) {
        int n=3;
        tower_of_hanoi(n, "A", "B", "C");
        
    }
    
}
