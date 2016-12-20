package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener,MouseListener{
	
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;

	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760-80,40,"SampleText");
		paragraph = new TextArea(40,85,550,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.");
		button = new Button(40,200,80,40,"Button",
				new Color(100,100,250),new Action(){
			public void act(){	
				MouseFollower.game
				.setScreen(MouseFollower.moveScreen);
			}
		});
		picture = new Graphic(200,200,1,"Resources/sampleImages/Cloud.jpg");
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		viewObjects.add(picture);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		if(m.getX() > 400){
			label.setText("Mouse at " + m.getX()+ ", "+m.getY());
		}else{
			label.setText("Mouse is at " + m.getX()+ ", "+m.getY());
		}
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		if(button.isHovered(m.getX(), m.getY())){
			button.act();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}








