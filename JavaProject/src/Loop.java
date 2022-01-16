
public class Loop {
	static int sum=0;
	public static void main(String[] args) {
		for(int i=0,j=0;i<10&&j<10;++i,j=i+1) {
			sum = sum+i;
			System.out.println(sum);
		}
	}
}
