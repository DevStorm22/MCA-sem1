class _04AreaPerimeterRectangle
{
	public static void main(String[] args)
	{
		float l = 78.45f, b = 28.54f;
		float area = l * b, perimeter = 2 * (l + b);

		System.out.println("Area of rectangle of length " + l + " cm and breadth " + b + " cm is " + area + " sqcm.\n");
		System.out.println("Perimeter of rectangle of length " + l + " cm and breadth " + b + " cm is " + perimeter + " cm.");
	}
}