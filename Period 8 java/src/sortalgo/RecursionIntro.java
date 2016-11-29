package sortalgo;

public class RecursionIntro {

	public static void main(String[] args){
		System.out.println("Using a for loop:");	
			for(int i = 0; i < 5; i++){
				System.out.println("Hello World! x"+i);
			}
		System.out.println("Without using a for loop");	
		forLoop(5,new Action(){
		
			private int value = 0;
			
			public void act(){
				System.out.println("Hello World x"+value);
				value++;
			}
		});
	}

	private static void forLoop(int i, Action action) {
		if(i <= 0){
			return;
		}else{
			action.act();
			forLoop(i-1, action);
		}
	}
	
	private static int factorial(int x){
		
//		//for loop method
		int factorial = 1;
//		for(int i = x; i > 0; i--){
//			factorial = factorial*i; 
//		}
//		System.out.println("factorial");
//		return factorial;
		
		//recursion method
		
		
		
		//Recursion method
		  
		  if(x > 1){
		  	return x*factorial(x-1);
		  }
		  return 1;
	}
}
