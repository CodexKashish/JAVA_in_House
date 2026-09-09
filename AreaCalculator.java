import java.util.Scanner;
class AreaCalculator {
public static void main(String...k) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius: ");
  float radius = sc.nextFloat();
  double circle = 3.14*radius*radius;
  System.out.println("Area of Circle: "+ circle );
  System.out.println("Enter length: ");
  int length = sc.nextInt();
  System.out.println("Enter width: ");
   int width = sc.nextInt();
  int rectangle = 2*(length+width);
    System.out.println("Area of Rectangle: "+ rectangle );
    System.out.println("Enter side: ");
   int side = sc.nextInt();
  int square = side*side;
    System.out.println("Area of Square: "+ square );
}
}
