package guiPractice.WhackAMole;

import guiPractice.GUIApplication;

public class WhackAMoleGame extends GUIApplication{

	public WhackAMoleGame() {
		
	}

	public static void main(String[] args) {
		WhackAMoleGame game = new WhackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		WhackAMoleScreen wams =
				new WhackAMoleScreen(getWidth(),getHeight());
		setScreen(wams);
	}

}
