package dsa;

public class Recursion {
	
	static void fibonacci(int a, int b,int c)
	{
		int fibo = a+b;
		System.out.print(","+fibo);
		a=b;
		b=fibo;
		c=c-1;
		if(c>2)
			fibonacci(a,b,c);
		else
			return;
	}
	
	public static void main(String[] args)
	{
		System.out.print("0,1");
		fibonacci(0,1,10);
	}
}
