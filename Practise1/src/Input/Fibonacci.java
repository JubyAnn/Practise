package Input;

public class Fibonacci {

	int arr[];
	int a;
	int temp;
	
	Fibonacci(int size)
	{
		this.arr = new int[size];
		this.a = 0;
		this.temp = 0;
		
	}
	
	public void Fib()
	{
	  arr[0] = 0;
	  arr[1] =1;
	  temp = arr[0] + arr[1];
			  
	  for(int i=2;i<arr.length;i++)
	  {
		  arr[i] = temp;
		  temp = arr[i] + arr[i-1];
	  }
	  
	}
	
	public void print()
	{
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println("Fibonacci = " +arr[i]);
	  }
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci fib = new Fibonacci(10);
		
		fib.Fib();
		fib.print();
		
		

	}

}
