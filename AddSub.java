import java.util.Scanner;
class AddSub {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1 = sc.nextInt();
System.out.println("Enter the second number:");
int num2 = sc.nextInt();
int sum = num1 + num2;
int difference = num1 - num2;
if (difference < 0) {
difference = -difference;
}
System.out.println("The sum of the numbers is: " + sum);
System.out.println("The absolute value of difference is: " + difference);
sc.close(); 
}
}
