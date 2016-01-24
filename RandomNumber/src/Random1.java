import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		System.out.println("Index\tRandom Numbers");
		Random dice = new Random();
		int number;
		for(int counter=1;counter<=10;counter++){
			number = dice.nextInt(99);
			System.out.println(counter + "\t" + number);
			
		}
		
	}

}

	
