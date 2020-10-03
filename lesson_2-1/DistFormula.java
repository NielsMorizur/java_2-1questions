import java.util.Scanner;

class DistFormula {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double distance = 0;
        
        System.out.println("Distance Calculator");
        System.out.println("----------------");
        System.out.println("");
        System.out.println("Enter the x-coordinate of the first point");
            x1 = sc.nextDouble();
        System.out.println("Enter the y-coordinate of the first point");
            y1 = sc.nextDouble();
        System.out.println("First point: "+ x1 +" "+ y1);
        System.out.println("Enter the x-coordinate of the second point");
            x2 = sc.nextDouble();
        System.out.println("Enter the y-coordinate of the second point");
            y2 = sc.nextDouble();
        System.out.println("Second point: "+ x2 +" "+ y2);
            distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance between the points: " + distance + " units");
    }
}