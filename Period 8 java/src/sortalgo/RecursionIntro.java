package sortalgo;

public class RecursionIntro {

	public static void main(String[] args){
		int n = 25;
		System.out.println("The "+n+"th number of the Fibonacci sequence is "+fibonacci(n));
//	    hanoiSolution(3, "a","b","c");
//		System.out.println("Using a for loop:");	
//			for(int i = 0; i < 5; i++){
//				System.out.println("Hello World! x"+i);
//			}
//		System.out.println("Without using a for loop");	
//		forLoop(5,new Action(){
//		
//			private int value = 0;
//			
//			public void act(){
//				System.out.println("Hello World x"+value);
//				value++;
//			}
//		});
	}

private static int fibonacci(int n) {
		if(n <= 1){
			return 1;
		}else{
			int previous = fibonacci(n-1);
			print("before we find fibonacci "+n+" we need to "
					+ "find fibonacci "+(n-1)+", which is "+previous);
			int beforeprevious = fibonacci(n-2);
			return previous+beforeprevious;
		}
	}

//	private static void forLoop(int i, Action action) {
//		if(i <= 0){
//			return;
//		}else{
//			action.act();
//			forLoop(i-1, action);
//		}
//	}
//	
//	private static int factorial(int x){
//		
////		//for loop method
//		int factorial = 1;
////		for(int i = x; i > 0; i--){
////			factorial = factorial*i; 
////		}
////		System.out.println("factorial");
////		return factorial;
//		
//		//recursion method
//		
//		
//		
//		//Recursion method
//		  
//		  if(x > 1){
//		  	return x*factorial(x-1);
//		  }
//		  return 1;
//	}
	private static int count = 1;
	
	public static void print(String s){
		System.out.println("Move #"+count+": "+ s);
		count++;
	}
	
//	public static void hanoiSolution(int numberOfDiscs,
//			String startPeg,
//			String midPeg,
//			String endPeg){
//		
//		if(numberOfDiscs <= 1){
//			print("Move "+ startPeg + " to "+ endPeg);
//		}else{
//			System.out.println("In order to move "+
//					numberOfDiscs+
//					" over to peg "+ endPeg +" We must move "+ 
//					(numberOfDiscs - 1)+" over to peg "+midPeg+
//					" first.");
//			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
//			hanoiSolution(1, startPeg, midPeg,endPeg);
//			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
//		}
//	}
}
