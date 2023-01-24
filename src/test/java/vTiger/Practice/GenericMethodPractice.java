package vTiger.Practice;

public class GenericMethodPractice {
	
	//caller
	public static void main(String[] args) {
		
		add(10,20);//
		add(26,36);
		add(40,35);
		int c=add(67,32);
		System.out.println(c);
				
		
	}

	//called
	public static int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	//called - Subtraction
	
	//Caller - multiplication
}
