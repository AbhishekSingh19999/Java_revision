package Basic_ques;
import java.util.Scanner;
public class Swapping_without_third_variable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		a=a+b;  // lets take an ex a= 20 and b=30
		b=a-b; //  now b have value of a 
		a=a-b; //  and a have a value of b 
		
		System.out.println("new Value of a is :"+a);
		System.out.println("new value of b is :"+b);

	}

}
