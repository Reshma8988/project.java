package tenary;
import java.util.Scanner;
public class java_tenary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner =new Scanner(System.in);
		
		System.out.println("enter first number:");
		int num1=Scanner.nextInt();
		System.out.println("enter second number: ");
		int num2=Scanner.nextInt();
		//using ternary operator to find the maximum
		int max =(num1>num2)?num1:num2;
		System.out.println("the maximum num is "+max);

	}
}
		
		