import java.util.Scanner;
class VowelVerification {
public static void main(String...k) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter an alphabet: ");
char ch = sc.next().charAt(0);
if (ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u'  || ch=='i'  || ch=='A'  || ch=='E'  || ch=='I'  || ch=='O'  || ch=='U')
System.out.println("The entered character is a Vowel!");
else
System.out.println("The entered character is a Consonant!");
}
}

