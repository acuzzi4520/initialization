package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class Mousefollower extends GUIApplication{
	
	private CoordinateScreen coordScreen;
	
	public static void main(String[] args){
		new Mousefollower();
	}

	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),
				getHeight());
		setScreen(coordScreen);
	}

}
