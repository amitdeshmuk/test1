package automation;

public class D {
	public static void main(String[] args) {

		//   binary number system

		// 1 byte = 8 bits
		// 1 byte = 0 to 255 = -128 to +127 ( -

		byte b1 = (byte)100;
		System.out.println(b1);


		// numeric , 1,2,3,33,45,654
		// byte - 1 byte = 2^8
		//short - 2 byte = 2^16
		//int - 4 byte = 2^32
		//long - 8 byte = 2^64

		short s1 = 89;
		int i1 = 67;
		long k1 = 789_670_565;
		System.out.println(k1);
		// floating, 2,4,6.5		


		int m = 56;
		System.out.println(m);
		int m1 = 070;
		System.out.println(m1);
		int m2 = 0x56;
		System.out.println(m2);


		float h9 = 2.6f;
		System.out.println(h9);

		double db = 8.9d;
		System.out.println(db);


		boolean h8 = false;
		System.out.println(h8);


		char ch = 'b';
		System.out.println(ch);

		int charVa = (int)ch;
		System.out.println("ascci value for A -> " + charVa);


	}

}
