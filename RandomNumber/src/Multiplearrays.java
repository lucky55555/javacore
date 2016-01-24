
public class Multiplearrays {

	public static void main(String[] args) {
	int firstarray[][] = {{1,2,3},{4,5,7}};
	int secondarray[][] = {{1,2,3,5},{44,5,7},{41,56,88,99}};
	System.out.println("the first element arrays are");
	display(firstarray);
	System.out.println("the second element arrays are");
	display(secondarray);
	
	
	}
	
	public static void display(int x[][]){
		for(int rows=0;rows<x.length;rows++){
			for(int columns=0;columns<x[rows].length;columns++){
				System.out.print(x[rows][columns]+"\t");
			}
			System.out.println();	
		}
		
	}

	}

