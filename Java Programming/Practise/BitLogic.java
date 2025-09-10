class BitLogic {
	public static void main(String [] args) {
		String binary [] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		int a = 3, b = 6;
		System.out.println("a | b = " + binary[(a | b)]);
		System.out.println("a & b = " + binary[(a & b)]);
		System.out.println("a ^ b = " + binary[(a ^ b)]);
		System.out.println("~a & 0x0f = " + binary[(~a & 0x0f)]); //0x represents HEXADECIMAL
	}
}