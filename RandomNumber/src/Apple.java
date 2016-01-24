
public class Apple {

	public static void main(String[] args) {
		//System.out.println("index\tnumber");
		int laxman[] = {1,2,3,4,5};
		int sum=0;
		int average;
		for(int counter=0;counter<=laxman.length;counter++){
			//System.out.println(counter+"\t"+laxman[counter]);
			
			sum+= laxman[counter];
			//average=sum/5;
			
			//System.out.println(sum+"\t"+average);
		}
		
		System.out.println(++sum);
		
	

	}

}
