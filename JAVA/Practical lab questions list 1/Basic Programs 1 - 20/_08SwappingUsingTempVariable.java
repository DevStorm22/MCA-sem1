class _08SwappingUsingTempVariable
{
	public static void main(String[] args)
	{
		int a = 20, b = 40, t;
		System.out.println("Before swapping a = " + a + " and b = " + b);
		t = a;
		a = b;
		b = t;
		System.out.println("After swapping a = " + a + " and b = " + b);
	}
}