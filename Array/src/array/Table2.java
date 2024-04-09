package array;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
//		int a[]=new int[10];
//		
//		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		System.out.println("enter any number");
//		int n =sc.nextInt();
//		
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=n*(i+1);
//			System.out.println(" a["+i+"]:"+a[i]); // till now its for table 
//			 sum=sum+a[i]; // adding of arrays elements 
//			}
		
		// insertion at any index 
//		int a[]= {12,23,21,67,89,87};
//		
//		int idx=3; int item=45;
//		for(int i=a.length-1; i>=idx; i--)
//		{
//			a[i]=a[i-1];
//		}
//		a[idx]=item;
//			
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		int a[]= {12,23,21,67,89,87};
		int temp=0;
		
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
