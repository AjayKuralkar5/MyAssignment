package week1.day2;

public class IsPalindrome {
	
	public static void main(String[]args) {
		int num =121;
		int original=num;
		int reverse =0;
		int temp=0;
		
		//loop1 =121
		//loop2=12
		//loop3=1
		
		for (int i=num;i!=0; i/=10) {
			temp=i%10;
			reverse= reverse*10+temp;
			System.out.println(reverse);
			
		}
		if(original==reverse) {
			System.out.println(num+" "+ "is a Palindrome number");
		}
		else
		{
			System.out.println(num+" "+ "is not a prime number");
		}
			
		}
	}


