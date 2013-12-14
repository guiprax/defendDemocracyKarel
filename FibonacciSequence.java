import acm.program.*;

public class FibonacciSequence extends ConsoleProgram{

	private  static final int MAX_TERM_VALUE = 10000;

	public void run(){
		int term = 0;
		int fib0 = 0;
		int fib1 = 1;
		println("This progam list the fibonacci sequence");
		println(fib0);
		println(fib1);
		while(term < MAX_TERM_VALUE){
			int sum = (fib0 + fib1);
			fib0 = fib1;
			fib1 = sum;
			println(sum);
			term = sum;
		}
	}
}
