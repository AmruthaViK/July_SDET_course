package Pkg1;

public class Class1 // PILLAR 1 - CLASS CREATION
{ 
	int a=8; // a is a variable which stores integer value	
	public void display() // display() is a method
		{
			System.out.println("Hello Class1");	
		}
	public static void main (String[] args) // main method // PILLAR 2 - MAIN METHOD CREATION
		{
			Class1 student = new Class1();  // PILLAR 3 - OBJECT CREATION
			System.out.println("I am MAIN METHOD");
			student.display();// PILLAR 4 - CALL VARIABLE and METHOD using REFERENCE VARIABLE
			System.out.println("VALUE " + student.a);
			student.a=10;
			System.out.println("VALUE " + student.a);
		}
}
