package logical_program;

public class fibonancy {

	public static void main(String[] args) {

		int a=1,b=1,c;
		for(int i=0; i<=10; i++) {
			c=a+b;
			System.out.println(b);
			a=b;
			b=c;
		}
	}

}
