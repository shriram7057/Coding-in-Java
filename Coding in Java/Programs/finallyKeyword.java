//finally keyword
class finallyKeywordDemo
{
	public static void main(String args[])
	{
		int x,a=10,b=5,c=5;
		try
		{
			x=a/(b-c);
			System.out.println("Division="+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error is occurred");
		}
		finally
		{
			System.out.println("finally block always executed");
		}
	}
}