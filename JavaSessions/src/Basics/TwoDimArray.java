package Basics;

public class TwoDimArray {

	public static void main(String[] args) {
		// two dimentional array
		
		String x[][] = new String[3][5]; //3 rows and 5 columns
		//Row1
		x[0][0] = "A1";
		x[0][1] = "B1";
		x[0][2] = "C1";
		x[0][3] = "D1";
	    x[0][4] = "E1";
	    
	    //Row2
	    x[1][0] = "A2";
		x[1][1] = "B2";
		x[1][2] = "C2";
		x[1][3] = "D2";
	    x[1][4] = "E2";
	    
	    //Row3
	    x[2][0] = "A3";
		x[2][1] = "B3";
		x[2][2] = "C3";
		x[2][3] = "D3";
	    x[2][4] = "E3";
	    
	    System.out.println(x.length);// prints no of rows
	    System.out.println(x[0].length);//prints no of columns
	    
	    //printing whole array - 3 for loops
	    
	    for(int row=0;row<x.length;row++) {
	    	for(int col=0;col<x[0].length;col++) {
	    		System.out.print(x[row][col]+" ");
	    	}
	    	System.out.println();
	    }


	}

}
