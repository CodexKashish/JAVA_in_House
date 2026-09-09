import java.util.Scanner;
class DayNumber {
public static void main(String...k) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter day name: ");
String dayname = sc.nextLine();
switch(dayname) {
case "Monday": 
System.out.println("Day Number: 1");
break;
case "Tuesday": 
System.out.println("Day Number: 2");
break;
case "Wednesday": 
System.out.println("Day Number: 3");
break;
case "Thursday": 
System.out.println("Day Number: 4");
break;
case "Friday": 
System.out.println("Day Number: 5");
break;
case "Saturday": 
System.out.println("Day Number: 6");
break;
case "Sunday": 
System.out.println("Day Number: 7");
break;
default: 
System.out.println("Your entered day name is invalid!");
}
}
}
