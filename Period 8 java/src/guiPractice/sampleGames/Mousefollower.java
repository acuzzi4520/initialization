package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class Mousefollower extends GUIApplication{
	
	private CoordinateScreen coordScreen;

	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),
				getHeight());
		setScreen(coordScreen);
	}

}