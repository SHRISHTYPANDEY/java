public class Simple_interest_func {
    public static double SimpleInterest(double p, double t, double r){
        double SI = (p*r*t)/100;
        return SI;

    }
    public static void main(String[] args) {
        System.out.println("Simple interest is: " + SimpleInterest(3200, 2, 5));
        
    }
    
}
