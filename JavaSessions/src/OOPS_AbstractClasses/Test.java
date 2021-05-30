package OOPS_AbstractClasses;

public class Test extends Shape {

	public Test() {
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		Shape s = new Test();
		
		t.fill();
		t.drawing();
		
		s.fill(); 
		s.drawing();

	}

	@Override
	public void fill() {
		System.out.println("Test- fill method");
		
	}

}
