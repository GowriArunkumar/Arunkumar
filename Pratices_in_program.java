package Interview;

import java.util.Scanner;

public class Pratices_in_program {

	public static void main(String[] args) {
		Pratices_in_program p=new Pratices_in_program();
		p.multiples();
		System.out.println("-------------------------");
		p.diviser();
		System.out.println("-------------------------");
		p.count_of_diviser();
		System.out.println("-------------------------");
		p.primre_number();
		System.out.println("-------------------------");
		p.prime();
	}

	private void prime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no=sc.nextInt();
		//int no=10000;
		int count=0;
		int div=2;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println("is not prime number ");
				count++;
				break;
			}
			div++;
		}
		
		if(count==0)
		{
			System.out.println("is prime number ");
		}
		System.out.println(count);
		
	}

	private void primre_number() {
		// TODO Auto-generated method stub
		int no=100;
		int count=0;
		int div=2;
		while(div<no)
		{
			if(no%div==0)
			{
				count++;
			}
			div++;
		}
		if(count==0)
		{
			System.out.println("prime number ");
		}
		else
		{
			System.out.println("not prime number ");
		}
		System.out.println(count);
	}

	private void count_of_diviser() {
		// TODO Auto-generated method stub
		int no=100;
		int count=0;
		int div=2;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				count++;
			}
			div++;
		}
		System.out.println(count);
	}

	private void diviser() {
		// TODO Auto-generated method stub
		int no=100;
		int div=1;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div);
			}
			div++;
		}
	}

	private void multiples() {
		// TODO Auto-generated method stub
		int i=1;
		int count=0;
		while(i<60)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println(count);
		
	}

}
