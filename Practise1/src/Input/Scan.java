package Input;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int Sum = 0;
		int Avg =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name = scan.next();
		
		/*System.out.println("Enter Score1");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Score2");
		int num2 = scan.nextInt();
		
		System.out.println("Enter Score3");
		int num3 = scan.nextInt();
		
		int num4 = scan.nextInt();*/
		
		System.out.println("Enter Scores");
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Array =" +arr[i]);
			
			Sum = Sum + arr[i];
		
		}
		Avg = Sum/10;
		
		System.out.println("Name =" +name);
		System.out.println("Sum =" +Sum);
		System.out.println("Avg =" +Avg);
		
		//int avg = (num1+num2+num3+num4)/4;
		
		//System.out.println("Average Score = " +avg);
	}

}
