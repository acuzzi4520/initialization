package guiPractice.WhackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableSceen;

public class WhackAMoleScreen extends ClickableSceen implements Runnable{

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeleft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width,height);
		timeleft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
	player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30,120,60,"Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50,120,60,"");
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
	}
	
	public void update(){
		super.update();
	}
	
	@Override
	public void run() {
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeleft);
		while(timeleft > 0){
			//frame updates every .1 seconds
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeleft -= .1;
			timeLabel.setText(""+(int)(timeleft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
	}
	
	private void addNewMoles(){
		//probability of mole appearing, depends on time left
		double probability = .2+.1*(30.0-timeleft)/30;
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			//between .5 and 2.5 seconds
			mole.setAppearenceTime((int)(500 + Math.random() * 2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//removeMole from ViewObjects
					remove(mole);
					//remove mole from database
					moles.remove(mole);
				}
				
			});
			//add mole to Visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		//each mole has a clock.
		//when the clock counts down to zero, 
		//they disappear
		for(int i = 0;i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			m.setAppearenceTime(m.getAppearenceTime() - 100);
			if(m.getAppearenceTime() <= 0){
				//remove from viewObjects
				remove(m);
				//remove it from our mole database
				moles.remove(i);
				i--;//compensate for i++
				
			}
		}
	}

	private PlayerInterface getAPlayer(){
		return new Player(20,20);
	}
	
	private MoleInterface getAMole(){
		return new Mole((int)(getWidth()*Math.random())-100,
				(int)(getHeight()*Math.random()));
	}
	
	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	@Override
	public void initObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
