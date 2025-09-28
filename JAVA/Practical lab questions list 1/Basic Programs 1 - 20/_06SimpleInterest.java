class _06SimpleInterest
{
	public static void main(String[] args)
	{
		float p = 7500.50f, r = 2.4f;
		int t = 4;
		float simpleInterest = (p * t * r) / 100;
		System.out.println("Simple interest of the principle Rs. " + p + " on ROI " + r + " % for " + t + " years is Rs. " + simpleInterest);
	}
}