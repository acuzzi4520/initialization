package sortalgo;

public class RecursionIntro {

	public static void main(String[] args){
	System.out.println("Using a for loop:");	
		for(int i = 0; i < 5; i++){
			System.out.println("Hello World!");
		}
	System.out.println("Without using a for loop");	
	forLoop(5,new Action(){
		public void act(){
			System.out.println("Hello World");
		}
	});
	}

}
