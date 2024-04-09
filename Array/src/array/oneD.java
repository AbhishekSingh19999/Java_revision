package array;

import java.util.Scanner;

public class oneD {

	public static void main(String[] args) {
		
		int empid[]=new int[5];
		String name[]=new String[empid.length];
		float salary[]= {56000,78000,34000,98000,57000};
		float bonus[]=new float[empid.length];
		
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<empid.length;i++)
		{
			System.out.println("Enter Employee ID : ");
			empid[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			name[i]=sc.nextLine();
			
		}
		
		// to print an array
		
		System.out.println("employee Data \n");
		System.out.println("Id\tName");
		for(int i=0; i<empid.length;i++)
		{
			System.out.println(empid[i]+"\t"+name[i]+"\t"+salary[i]);
			
		}

	}

}
