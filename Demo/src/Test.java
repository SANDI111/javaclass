
public class Test {
	
int a;
public static int sum(int a, int b )
{
	int c; 
	c= a+b;
	return c;
	
}
	
public static int sub(int a, int b )
{
	int c; 
	c= a-b;
	return c;
	
}
	
public static int mul (int a, int b )
{
	int c; 
	c= a*b;
	return c;
	
}
	
public static void div (int a, int b )
{
	int c; 
	c= a/b;
	System.out.println(" result of second expression "  +c);
	
}

	
	public static void main (String args[])
	{
	//	Test t1= new Test();
		
	int sub_result=	sub(10, 2);
	//System.out.println('1'+sub_result);
	int sum_result = sum(sub_result,2);
	//System.out.println('1'+sum_result);
		sub_result=sub(sum_result, 2);
	int mul_result = mul(sub_result, 2);
	//System.out.println('1'+mul_result);
	div(mul_result,2);
		
	//System.out.println(div_result);
		
	}
	
	
	
	

}
