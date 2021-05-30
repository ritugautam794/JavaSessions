package OOPSConcepts;

public class CallbyreferenceVsCallbyValue {
	
	int p;
	int q;
	
	int l = 10;
	static int m = 20;
	
	public static void main(String[] args) {
		
		CallbyreferenceVsCallbyValue ob = new CallbyreferenceVsCallbyValue();
		int x = 10;
		int y = 20;
		
		int sum = ob.sumtest(x,y); //Call by value or pass by value
		System.out.println("sum"+sum);
		
		ob.p = 50;
		ob.q = 60;
		
		ob.swap(ob); //call by reference
		System.out.println(ob.p);
		System.out.println(ob.q);
		
		ob.swap2();
		
		System.out.println(ob.l);
		System.out.println(m);
		ob.test();
	}
	
	public int sumtest(int x, int y) {	
		int z = x+y ;
		return z;	
	}
	
	//call by reference
	public void swap(CallbyreferenceVsCallbyValue t) {
		int temp;
		temp = t.p ;// temp = 50, p= 50, q= 60
		t.p = t.q ;//p = 60, q=60
		t.q = temp ;//q = 50
		System.out.println("swap1 "+p);
		System.out.println("Swap1 "+q);
		
	}
	
	public void swap2() {
		int temp ;
		temp = p;
		p= q;
		q = temp;	
		System.out.println("swap2 "+p);
		System.out.println("Swap2 "+q);
	}
	
	public void test() {
		System.out.println(l);
		System.out.println(m);
	}

}
