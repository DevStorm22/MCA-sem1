class Iteration {
	public static void main (String [] args) {
		System.out.println("For loop:");
		for (int i = 1; i < 11; i++)
		{
			System.out.println("i = " + i);
		}
		System.out.println("For-each loop:");
		int a[] = {1, 2, 3, 4, 5};
		int j = 0;
		for(int i: a)
		{
			System.out.printf("a[%d] = %d\n" , j++, i);
		}
		System.out.println("While loop:");
		j = 1;
		while(j < 11)
		{
			System.out.println("j = " + j);
			j++;
		}
		System.out.println("Do-while loop:");
		j = 1;
		do {
			System.out.println("j = " + j);
			j++;
		} while(j < 11);
	}
}