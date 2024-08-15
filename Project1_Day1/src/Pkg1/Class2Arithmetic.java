package Pkg1;
// (10+2)(10-3)
public class Class2Arithmetic {
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("(10+2) = " + c);
		return c;		
	}
	public int subs(int d, int e) {
		int f;
		f=d-e;
		System.out.println("(10-3) = " + f);
		return f;
	}
	public void mult(int x, int y) {
		int i;
		i=x*y;
		System.out.println("(10+2)(10-3) = " + i);
	}
	public static void main(String[] args) {
		Class2Arithmetic obj = new Class2Arithmetic();
		int sumresult=obj.sum(10, 2);
		int subsresult=obj.subs(10,3);
		obj.mult(sumresult, subsresult);
	}
}
