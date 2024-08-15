package Pkg1;
//  (((10+2)*2)-2)*2
public class Day2Assgn1 {
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("(10+2)="+c);
		return c;
	}
	public int mult(int d, int e) {
		int f;
		f=d*e;
		return f;
	}
	public int subs(int g, int h) {
		int i;
		i=g-h;
		System.out.println("((10+2)*2)-2="+i);
		return i;
	}
	public void div(int x, int y) {
		int z;
		z=x/y;
		System.out.println("((((10+2)*2)-2)*2)/2="+z);
	}
	public static void main(String[] args) {
		Day2Assgn1 obj=new Day2Assgn1();
		int sumres=obj.sum(10, 2);
		int multres=obj.mult(sumres, 2);
		System.out.println("((10+2)*2)="+multres);
		int subres=obj.subs(multres, 2);
		int multres2=obj.mult(subres, 2);
		System.out.println("(((10+2)*2)-2)*2="+multres2);
		obj.div(multres2, 2);		
	}
}
