package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import guiPractice.Screen;
import guiPractice.components.Clickable;
import guiPractice.components.Visible;

public abstract class ClickableSceen extends Screen implements MouseListener{

	public ClickableSceen(int width, int height) {
		super(width, height);
	}

	public ArrayList<Clickable> clickables;
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		initAllObjects(viewObjects);
		for(int i = 0;i < getSize(viewObjects); i++){
			
		}
	}
	
	 public MouseListener getMouseListener(){
		 return this;
	 }

	 void initAllObjects(ArrayList<Visible> Vlst){
		
	 }
}
