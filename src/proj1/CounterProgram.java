package proj1;

public class CounterProgram {

	public static void main(String[] args) {
		
		int counter =0;
		int sum=0;
		do {
			//System.out.println(counter);
			
			if (counter % 2 !=0) {
				sum += Math.pow(counter, 2);
				
			}
			
			counter++;
    		}while(counter<11);
		System.out.println(sum);
		
	}

}
