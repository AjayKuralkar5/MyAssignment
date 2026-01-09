package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// Assignment operator(=)
		
		int number= 7;
		
		int a=7;
		int b=2;
		
		//div
		//qutioent (/)
		
		System.out.println(a/b);
		
		//reminder(%)
		System.out.println(a%b);
		
		System.out.println("-----------------------");
		
		int s=10;
		int t=20;
		
		//lessThanOrEqualTo (<=)
		System.out.println(s<=t);
		
		//greaterThanOrEqualTo (>=)
		System.out.println(s>=t);
		
		//NotEqualTo( !=)
		System.out.println(s!=t);
		
		System.out.println("---------------------");
		
		//Logical Operators
		
		//AND ( && ) 2 Condition should be true 
		
		System.out.println(s<=t && s<t);
		
		
		//OR (||) Atleast one condition must be true.
		
		System.out.println(s<=t || s>t);
		
		//Increment 
		
		//postIncrement 
		
		// postIncrement -Increase the value by 1 (p++)
		 int p=12;
		System.err.println(p++); //12
		
		System.err.println(p); //13
		
		// preIncrement -Increase the value by 1 (++p)
		
		System.out.println("preIncrement" +" " + ++p); //14
		
		// decrement
				// postDecrement - Decrease the value by 1 (p--)
		System.out.println("PostDecrement"+" "+ p--); //14
		System.out.println("PostDecrement"+" "+ p); //13
		
		// preDecrement - Decrease the value by 1 (--p)
		System.out.println("preDecrement"+ " "+ --p); // 12
		
		
		
		
		
			
				
		
		

	}

}
