package Pkg1;
public class Day1Assgn1 
{
	int rollNo;
	int age;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Day1Assgn1 amrutha = new Day1Assgn1();
		amrutha.rollNo=1002;
		amrutha.age=25;
		amrutha.display1();
		amrutha.display2();
		System.out.println("Student RollNo. is " + amrutha.rollNo);
		System.out.println("Student Age is " + amrutha.age);		
	}
}
