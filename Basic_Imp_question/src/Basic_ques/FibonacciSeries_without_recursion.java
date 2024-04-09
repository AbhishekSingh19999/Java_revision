 package Basic_ques;

public class FibonacciSeries_without_recursion {

	public static void main(String[] args) {
		
		int n=234; 
		int rem;
		int result=0;
		while(n!=0)
		{
			rem=n%10;
		
		 result=result*10+rem;// it has rem =4
		 n=n/10;
		 
		
		 
	}
		 System.out.println(result);
}
}