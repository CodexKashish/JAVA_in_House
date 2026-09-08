import java.util.Scanner;
class SwappingUsingThirdVar{
  public static void main(String...k) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a: ");
        int a = sc.nextInt();
    System.out.println("Enter b: ");
        int b = sc.nextInt();
System.out.println("Numbers before Swapping: ");
    System.out.println("a= "+ a +", b= "+ b);
    int c = a;
    a = b;
    b = c;
System.out.println("After Swapping: ");
    System.out.println("a= "+ a +", b= "+ b);
  }
}

