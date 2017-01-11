package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.AnimatedComponent;
import guiPractice.components.Button;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener,MouseListener{
	
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	private ClickableGraphic move;

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
		move = new ClickableGraphic(200,200,1,"Resources/sampleImages/Cloud.jpg",new Action(){
			public void act(){	
				MouseFollower.game
				.setScreen(MouseFollower.moveScreen);
			}
		});
		
		
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		viewObjects.add((Visible) move);
		
//		MovingComponent mc = 
//				new MovingComponent(30,60,80,80);
//		mc.setVy(3);
//		mc.play();
//		viewObjects.add(mc);
		
		addAnimation(viewObjects);
		
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		int w = 300;
		int h = 300;
		AnimatedComponent a = new AnimatedComponent(40, 50, w, h);
		try{
			int numberInRow = 6;
			int rows = 3;
					
			ImageIcon icon =
					new ImageIcon("resources"
							+ "/sampleImages/sprite.png");
			//create a for loop that will take a 
			//sub-image from the sprite grid
			for(int i = 0; i < numberInRow * rows; i++){
				//declare the "cropped image"
				BufferedImage cropped = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + h*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(),0,0,w,h,
						x1,y1,x1+1,y1+1,null);
				a.addFrame(cropped, 30);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		viewObjects.add(a);
		a.play();
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

	@Override
	public void initObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}








