import java.util.Scanner;
class SwappingTwoVar {
  public static void main(String...k) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a: ");
    int a = sc.nextInt();
    System.out.println("Enter b: ");
    int b = sc.nextInt();
    System.out.println("Before Swapping: ");
    System.out.println("a= "+ a +", b= "+ b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After Swapping: ");
    System.out.println("a= "+ a +", b= "+ b);
  }
}



    
