
public class TestByte {

	public static void main(String[] args) {
		double a = 295.04;
		int b = 300;
		byte c = (byte)a;
		byte d = (byte)b;
		System.out.println(c+" "+d);
	}

}

//While assigning value to byte type the fractional part is lost and is reduced to modulo 256(range of byte)