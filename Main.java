
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Queue queueX= new Queue(5);
		
		Scanner scanner= new Scanner(System.in);
		
		int inputStr;
		
		for(int i=0;i<=5;i++) {
			System.out.println("Enter transaction Id:");
			inputStr=scanner.nextInt();
			queueX.insert(inputStr);
		}
		
		Queue evenqueue= new Queue(5);
		Queue oddqueue= new Queue(5);
		
		int value;
		
		while(!queueX.isEmpty()) {
			//removing the values by checking if its even or odd
			value=queueX.remove();
			
			if(value %2 ==0) {
				evenqueue.insert(value);
			}
			
			else {
				oddqueue.insert(value);
			}
			
		}
		
		System.out.println("PC1");
		while(!evenqueue.isEmpty()) {
			System.out.println("Transaction Id:" +evenqueue.remove());
			
		}
		
		System.out.println("PC2");
		while(!oddqueue.isEmpty()) {
			System.out.println("Transaction Id:" +oddqueue.remove());
			
		}


	}

}
