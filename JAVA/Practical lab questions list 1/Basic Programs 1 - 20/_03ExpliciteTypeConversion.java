class _03ExpliciteTypeConversion
{
	public static void main(String[] args)
	{
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d = 9;

		f = (float) (d);
		l = (long) (f);
		i = (int) (l);
		s = (short) (i);
		b = (byte) (s);

		System.out.println("Double : " + d);
		System.out.println("Float : " + f);
		System.out.println("Long : " + l);
		System.out.println("Int : " + i);
		System.out.println("Short : " + s);
		System.out.println("Byte : " + b);

	}
}