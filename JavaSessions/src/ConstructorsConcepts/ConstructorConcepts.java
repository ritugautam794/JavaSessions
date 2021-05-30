package ConstructorsConcepts;

public class ConstructorConcepts{
	
	public ConstructorConcepts(){
		System.out.println("1 arugument constructor");
		
	}
	
	public ConstructorConcepts(int i){
		System.out.println("2 arugument constructor");
		System.out.println("i value"+ i);
	}
	
	public ConstructorConcepts(int i, int j){
		System.out.println("2 arugument constructor");
		System.out.println("i value"+ i);
		System.out.println("j value"+ j);
		
	}
	
	public static void main(String[] args){
		
		ConstructorConcepts c1 = new ConstructorConcepts();
		ConstructorConcepts c2 = new ConstructorConcepts(10);
		ConstructorConcepts c3 = new ConstructorConcepts(20,30);
		
		
	}

}
