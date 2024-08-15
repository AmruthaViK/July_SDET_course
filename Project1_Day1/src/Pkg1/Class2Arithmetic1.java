package Pkg1;
// ((((10+2)+2)-2)*2)/2
public class Class2Arithmetic1 {
	public int sum(int a,int b) {
		int c;
		c=a+b;
		return c;
	}
	public int subs(int d,int e) {
		int f;
		f=d-e;
		System.out.println("((10+2)+2)-2="+f);
		return f;
	}
	public int mult(int g,int h) {
		int i;
		i=g*h;
		System.out.println("(((10+2)+2)-2)*2="+i);
		return i;
	}
	public void div(int x,int y) {
		int z;
		z=x/y;
		System.out.println("((((10+2)+2)-2)*2)/2="+z);
	}
	public static void main(String[] args) {
		Class2Arithmetic1 obj=new Class2Arithmetic1();
		int sumres=obj.sum(10,2);
		System.out.println("(10+2)="+sumres);
		int sumres1=obj.sum(sumres, 2);
		System.out.println("(10+2)+2="+sumres1);
		int subres=obj.subs(sumres1, 2);
		int multres=obj.mult(subres, 2);
		obj.div(multres,2);		 
	}
	
}
