package guiPractice.WhackAMole;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface MoleInterface extends Clickable{

	int getAppearenceTime();
	
	void setAppearenceTime(int d);

	void setAction(Action action);

	
}
