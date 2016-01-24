
public class Average {

	public static void main(String[] args) {
	System.out.println("the average of your given numbers are :" +average(10,15,25));
	}
	
	public static int average(int ...numbers){
		int total=0;
		for(int x: numbers)
			total+=x;
		return total/numbers.length;
		
	}

}
