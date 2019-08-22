class fact
{
	public int factorial(int a)
	{	
		if(a>0)
{
		int f = 1;
		for(int i=1;i<=a;i++)
		{
			f*=i;
			
		}
		return f;
}
	}	


	public static void main(String args[])
	{
		fact obj = new fact();
		System.out.print("factorial of number is "+ obj.factorial(-5));

	}
}