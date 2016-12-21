package guiPractice.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class ClickableGraphic extends Graphic implements Clickable, MouseListener{

	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	private Action action;

	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action action) {
		super(x,y,scale,imageLocation);
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation,Action action) {
		super(x,y,w,h,imageLocation);
	}
	
	public ClickableGraphic(int x, int y, String imageLocation, Action action) {
		super(x,y,imageLocation);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(((Clickable) image).isHovered(e.getX(), e.getY())){
			((Clickable) image).act();
		}
		
	}
	


	@Override
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX()+getWidth() &&
				y > getY() && y < getY() + getHeight();
	}

	@Override
	public void act() {
		if(action != null)action.act();
	}
	

	

	public void setAction(Action action) {
		this.action = action;
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
