package Pkg1;
// ((((10/2)-2)*2)-2)+2
public class Day2Assgn2 {
	public int div(int a, int b) {
		int c;
		c=a/b;
		System.out.println("(10/2)="+c);
		return c;
	}
	public int subs(int d, int e) {
		int f;
		f=d-e;
		return f;
	}
	public int mult(int g, int h) {
		int i;
		i=g*h;
		System.out.println("((10/2)-2)*2="+i);
		return i;
	}
	public void add(int x, int y) {
		int z;
		z=x+y;
		System.out.println("((((10/2)-2)*2)-2)+2="+z);
	}
	public static void main(String[] args) {
		Day2Assgn2 obj=new Day2Assgn2();
		int divres=obj.div(10, 2);
		int subres=obj.subs(divres, 2);
		System.out.println("(10/2)-2="+subres);
		int multres=obj.mult(subres, 2);
		int subres1=obj.subs(multres, 2);
		System.out.println("(((10/2)-2)*2)-2="+subres1);
		obj.add(subres1, 2);
	}
}
