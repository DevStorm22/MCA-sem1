class TypeCasting {
	public static void main(String []args) {
		byte b = 1;
		short s = 100;
		int i = 10000;
		long l = 1000000;
		float f = 10.2f;
		double d = 10000.8978;

		byte b1 = (byte) (s);
		short s1 = (short) (i);
		int i1 = (int) (l);
		long l1 = (long) (f);
		float f1 = (float) (d);

		double d2 = f;
		float f2 = l;
		long l2 = i;
		int i2 = s;
		short s2 = b;

		System.out.println("Implisite Conversion\nbyte = " + b1 + "\nshort = " + s1 + "\nint = " + i1 + "\nlong = " + l1 + "\nfloat = " + f1);
		System.out.println("Implisite Conversion\nbyte = " + b1 + "\nshort = " + s1 + "\nint = " + i1 + "\nlong = " + l1);
	}
}