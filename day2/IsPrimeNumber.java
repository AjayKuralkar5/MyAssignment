package week1.day2;

public class IsPrimeNumber {
	
	public static void main(String[]args){
		
		int num=9;
		
		boolean isPrime=true;
		
		if(num<=1) {
			isPrime =false;
		}
		else {
			for(int i=2; i<=num/2; i++)
			if(num%i==0) {
				isPrime =false;
				break;
				
				
			}
			
			if(isPrime)
			{
				System.err.println(num+" "+ "is the prime number");
			}
			else {
				System.out.println(num+" "+ "is not the prime number");
			}
				
			
		}
		
		
		
		
		

		
			
			
		
				
		
		
		
		
		

		
	}
}



