import java.util.Scanner;
public class Net_Sal_func {
    public static double HRA(double basic_sal){
        double hra = basic_sal*30/100;
        return hra;
    }
    public static double DA(double basic_sal){
        double da = basic_sal*10/100;
        return da;
    }
    public static double TA(double basic_sal){
        double ta = basic_sal*20/100;
        return ta;
    }
    public static double Tax(double basic_sal){
        double tax = 0;
        
        if(basic_sal <=10000){
            tax = tax + 0;
        }
        else if(basic_sal>10000 && basic_sal<20000){
            tax = 0.1*(basic_sal-10000);
        }
        else if(basic_sal>20000 && basic_sal<30000){
            tax = (0.2*(basic_sal-200000))+(0.1*(basic_sal-10000));
        }
        else{
            tax = 0.3*(basic_sal-30000)+(0.2*(basic_sal-200000))+(0.1*(basic_sal-10000));
        }
        return tax;
    }
    public static double Gross(double basic_sal, double hra, double da,double ta)
    {
        double gross = basic_sal+hra+da+ta;
        return gross;
    }
    public static double Net_sal(double gross, double tax){
        double net_sal = gross-tax;
        return net_sal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your basic salary amount");
        double basic_sal = sc.nextInt();

        double hra = HRA(basic_sal);
        System.out.println(hra);
        double da = DA(basic_sal);
        System.out.println(da);
        double ta = TA(basic_sal);
        double tax = Tax(basic_sal);
        System.out.println(tax);
        double gross = Gross(basic_sal, hra, da, tax);
        System.out.println(gross);

    }
    
}
