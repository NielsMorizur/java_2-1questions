import java.util.Scanner;

class MortgageCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = 0;
        double r = 0;
        double n = 0;
        double A = 0;
        
        System.out.println("Mortgage Calculator");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Enter the Principle");
            P = sc.nextDouble();
        System.out.println("Enter the Rate");
            r = sc.nextDouble();
        System.out.println("Enter the years");
            n = sc.nextDouble();
        A = P*Math.pow(1+r,n);
        System.out.println("Your mortgage is: " + A);
    }
}