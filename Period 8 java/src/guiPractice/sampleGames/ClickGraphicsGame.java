package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication{
	
	public ClickGraphicsGame() {
		super();
	}
	
	public static void main(String[] args){
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();
	}

	@Override
	protected void initScreen() {
		GraphicsClickScreen gcs = new GraphicsClickScreen(getWidth(),getHeight());
		setScreen(gcs);
	}

}
