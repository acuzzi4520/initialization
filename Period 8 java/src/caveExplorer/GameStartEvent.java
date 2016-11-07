package caveExplorer;

public class GameStartEvent implements Playable {
	
	private static final String[] SEQUENCE_1 = {"Pikachu runs up to you...","Hi, i can see you are not from around here","Do you like puzzles?"};
	private static final String[] SEQUENCE_2 = {"You are going to have a lot of fun playing my 2D games.", "Take this map"};

	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().
				toLowerCase().indexOf("yes") < 0){
			CaveExplorer.print("C'mon! Say yes. You know you like puzzles.SAY YES!!");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);

	}
	
	public static void readSequence(String[] seq){
		for(String s: seq){
			CaveExplorer.print("s");
			CaveExplorer.print("- - - PRESS ENTER - - -");
			CaveExplorer.in.nextLine();
		}
	}

}
