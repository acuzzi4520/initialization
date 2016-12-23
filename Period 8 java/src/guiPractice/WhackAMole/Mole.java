package guiPractice.WhackAMole;

import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableSceen;

public class Mole extends ClickableGraphic implements MoleInterface{
	
	private double appearenceTime;

	public Mole(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y,.50,"resources/sampleImages/mole.png", null);
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAppearenceTime() {
		// TODO Auto-generated method stub
		return (int) appearenceTime;
	}
	
	public void setAppearenceTime(double d) {
		this.appearenceTime = d;
		
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void setAction(Action action) {
		// TODO Auto-generated method stub
		
	}

	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

	
	public void initObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

	
	public void setAppearenceTime(int d) {
		// TODO Auto-generated method stub
		
	}

}
