package rope;

import static rope.Rope.*;

public class RopeSwing {
	private static Ropee rope1 = new Ropee();
	private static Ropee rope2 = new Ropee();
	{
		System.out.println(rope1.length);
	}
	
	public static void main(String[] args) {
		rope1.length = 2;
		rope2.length = 8;
		System.out.println(rope1.length);
	}

}

//instance initializer will not run because there is no constructor. If the static block is applied then static block will run first