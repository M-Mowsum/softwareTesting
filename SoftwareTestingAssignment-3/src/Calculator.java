import java.util.*;

public class Calculator {

	public long add(long a, long  b) {
		return a+b;
	}
	
	public long add(long a, long b, long c) {
		return a+b+c;
	}
	
	public long add(List<Long>a) {
		
		long temp=0;
		for (long num : a) {
			temp+=num;
		}
		return temp;
		
	}
	public long subtract(long a, long b) {
		return a-b;
	}
	
	public float divide(float a, float b) {
		return a/b;
	}
	
	public long multiply(long a, long b) {
		return a*b;
	}
	
	/////////////////// Main Method for Debugging Purpose ////////////////
	
	/*public static void main(String[] args) {
		
		System.out.println("Debug Calculator");
		Calculator c=new Calculator();
		System.out.println(c.multiply(a,b));      //////////// a,b = inputs
		
		List a=new ArrayList();                  //////// for add(list) method
		a.add((long) 2147483647);
		a.add((long) 0);
		a.add((long) 3);
		Calculator c=new Calculator();
		System.out.println(c.add(a));
	}*/
}
