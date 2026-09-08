import java.util.Scanner;
class PersonalInfo{
public static void main(String...k) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name: ");
  String name = sc.nextLine();
  System.out.println("Enter your age: ");
  int age = sc.nextInt();
  System.out.println("Enter your salary: ");
  double salary = sc.nextDouble();
  System.out.println("Enter your contact number: ");
  long contactno = sc.nextLong();
  sc.nextLine(); //including because of input buffer
  System.out.println("Enter your address: ");
  String address = sc.nextLine();
  System.out.println("Enter your email: ");
  String email = sc.nextLine();
  System.out.println("Name: "+ name);
    System.out.println("Age: "+ age);
  System.out.println("Salary: "+ salary);
  System.out.println("Contact Number: "+ contactno);
  System.out.println("Address: "+ address);
  System.out.println("Email: "+ email);
}
}


  
