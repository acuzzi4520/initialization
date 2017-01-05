package simonSays;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenAnthonyCuzzi extends ClickableScreen implements Runnable{
	
	TextLabel label;
	ButtonInterfaceAnthonyCuzzi[] button;
	ProgressInterfaceAnthonyCuzzi progress;
	ArrayList<MoveInterfaceAnthonyCuzzi> pattern;
	
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;

	public SimonScreenAnthonyCuzzi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		pattern = new ArrayList<MoveInterfaceAnthonyCuzzi>();
		//add 2 moves to start
		lastSelectedButton = -1;
		pattern.add(randomMove());
		pattern.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceAnthonyCuzzi randomMove() {
		ButtonInterfaceAnthonyCuzzi b = null;
		int rdm = (int)(1 + (Math.random()*6));
		if(rdm == lastSelectedButton){
			while(rdm == lastSelectedButton){
				rdm = (int)(1 + (Math.random()*6));
			}
			b = (ButtonInterfaceAnthonyCuzzi) button[rdm];
		}
		return getMove(b);
	}
	
	/**
	Placeholder until partner finishes creation of Move class
	*/
	private MoveInterfaceAnthonyCuzzi getMove(ButtonInterfaceAnthonyCuzzi b) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceAnthonyCuzzi getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 6;
		Color[] Colors = {Color.red,Color.blue,Color.green,Color.orange,Color.yellow,Color.magenta};
		for(int i = 0; i < numberOfButtons; i++){
			 ButtonInterfaceAnthonyCuzzi b = getAButton();
			 b.setColor(Colors[i]); 
			    b.setX(60 + i*20);
			    b.setY(60);
			    b.setAction(new Action(){

			    	public void act(){
			    		if(acceptingInput){
			    			Thread blink = new Thread(new Runnable(){

			    				public void run(){
			    				}

			    				});
			    		}
			    	}

			    	}); 
		}
	}
	
	/**
	Placeholder until partner finishes creation of Button class
	 * @return 
	*/

	private ButtonInterfaceAnthonyCuzzi getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}