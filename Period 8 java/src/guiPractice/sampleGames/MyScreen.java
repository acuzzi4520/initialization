package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen{
	private Graphic toxapex;
	

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		toxapex = new Graphic(50,50,1,"Resources/sampleImages/Toxapex.jpg");
		viewObjects.add(toxapex);
	}

}
