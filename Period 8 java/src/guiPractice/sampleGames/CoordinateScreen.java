package guiPractice.sampleGames;

import guiPractice.Screen;
import guiPractice.components.TextLabel;

public class CoordinateScreen extends Screen{
	
	private TextLabel label; 

	public CoordinateScreen(int width, int height) {
		super(width, height);
		label = new TextLabel(40,45,width-80,40,"");
	}

}
