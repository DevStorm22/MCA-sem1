class _12BitwiseOperator
{
	public static void main(String[] args)
	{
		byte b1 = 2, b2 = 4;
		System.out.println(b1 + " << " + b2 + " : " + (b1 << b2));
		System.out.println(b1 + " >> " + b2 + " : " + (b1 >> b2));
		System.out.println(b1 + " & " + b2 + " : " + (b1 & b2));
		System.out.println(b1 + " | " + b2 + " : " + (b1 | b2));
		System.out.println(b1 + " ^ " + b2 + " : " + (b1 ^ b2));
	}
}