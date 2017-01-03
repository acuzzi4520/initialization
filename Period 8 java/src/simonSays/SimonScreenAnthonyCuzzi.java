package simonSays;

import java.util.ArrayList;
import java.util.List;

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
		button[(int) ((int)1 + (Math.random()*6))];
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceAnthonyCuzzi getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		
		
	}

	@Override
	public void initObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
