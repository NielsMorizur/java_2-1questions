import java.util.Scanner;

class AreaToRadius {
 public static void main (String [] args) {
     Scanner sc = new Scanner(System.in);
     double r = 0;
     double area = 0;
     
     System.out.println("Circle radius calculator");
     System.out.println("------------------------");
     System.out.println("");
     System.out.println("Enter the area of the circle");
     area = sc.nextDouble();
     
     r = Math.sqrt(area / Math.PI);
     System.out.println("The circle with area "+area+" units^2 has a radius of "+r+" units.");
     
    }
}
