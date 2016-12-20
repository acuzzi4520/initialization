package guiPractice.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickableGraphic implements Clickable, MouseListener{

	public ClickableGraphic() {
		// TODO Auto-generated constructor stub
	}

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
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX()+getWidth() &&
				y > getY() && y < getY() + getHeight();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
	

}
