class ShortCircuitOperators
{
	public static void main(String [] args)
	{
		System.out.println("(10 < 20) | (30 < 40) = " + ((10 < 20) | (30 < 40)));
		System.out.println("(10 < 20) || (30 < 40) = " + ((10 < 20) || (30 < 40)));
		System.out.println("(10 < 20) & (30 > 40) = " + ((10 < 20) & (30 > 40)));
		System.out.println("(10 < 20) && (30 > 40) = " + ((10 < 20) && (30 > 40)));
	}
}
	