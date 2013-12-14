import acm.program.*;

public class FindRange1 extends ConsoleProgram{
	
	private  static final int SENTINEL = 0;
	
	public void run(){
		displayWelcome();	
		int x = readInt("Enter a val: ");
		
		if (x == SENTINEL) {
			println( "invalid number");
		}
		int total = x;//total = x, because x is first number entered
		int min = x;//min = x, because x is first number entered
		int max = x	;// max = x, because x is first number entered
		
		while(x!= SENTINEL) {
		x = readInt("Enter a value");
		total += x;
	
			if (x!= 0 && x>max){
				 max=x;
			}else if (x != 0 && x<min){
				min=x;
				  }
		}
		println("total: " + total);
		println( "smallest: " + min);
		println("largest: " + max);
			
		}
	
	private void displayWelcome(){
		println("This program find the largest and the smallest number.");

	}
}
