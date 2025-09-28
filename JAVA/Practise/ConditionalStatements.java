class ConditionalStatements
{
	public static void main(String [] args)
	{
		int i = 10;
		System.out.println("Simple if");
		if (i <= 10)
		{
			System.out.println("i <= 10");
		}
		System.out.println("If-else");
		if (i < 0)
		{
			System.out.println("i < 0");
		}
		else
		{
			System.out.println("i >= 0");
		}
		System.out.println("Else-if ladder");
		if (i == 0)
		{
			System.out.println("i == 0");
		}
		else if (i < 0)
		{
			System.out.println("i < 0");
		}
		else
		{
			System.out.println("i > 0");
		}
		System.out.println("Switch Case");
		switch (i)
		{
			case 10:
				System.out.println("i > 0");
				break;
			case -1:
				System.out.println("i < 0");
				break;
			default:
				System.out.println("i == 0");
		}
	}
}