class IncDec {
	public static void main(String [] args)
	{
		int a = 10;
		System.out.println("Before Post increment:\na = " + a);
		int b = a++;
		System.out.println("After Post increment:\nb = " + b + "\na = " + a);
		a = 10;
		System.out.println("Before Pre increment:\na = " + a);
		b = ++a;
		System.out.println("After Pre increment:\nb = " + b + "\na = " + a);
		a = 10;
		System.out.println("Before Post decrement:\na = " + a);
		b = a--;
		System.out.println("After Post decrement:\nb = " + b + "\na = " + a);
		a = 10;
		System.out.println("Before Pre decrement:\na = " + a);
		b = --a;
		System.out.println("After Pre decrement:\nb = " + b + "\na = " + a);
	}
}