package week1.day2;

public class FindFibonacciSeries {

	public static void main(String[] args) {
	
		int n= 7;
		int a=0;
		int b=1;
		
		System.out.println("Fibonacci series:");
		
		for(int i=0; i<=n; i++) {
			System.out.print(a +" ");
			int c=a+b;
			a=b;
			b=c;
			
			
		}

	}

}
