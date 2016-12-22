package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public class GraphicsClickScreen extends Screen implements MouseListener{

	private ClickableGraphic toxapex;
	
	public GraphicsClickScreen(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(toxapex.isHovered(e.getX(), e.getY())){
			toxapex.act();
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

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		toxapex = new ClickableGraphic(20, 20, .2, "resources/sampleImages/Toxapex", null);
		toxapex.setAction(new Action() {
			
			public void act(){
				toxapex.setX(toxapex.getX() + 10);
			}
		});
		viewObjects.add(toxapex);
	}
	
	public MouseListener getMouseListener(){
		return this;
	}


}
