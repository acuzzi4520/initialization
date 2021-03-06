package simon;


import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import guiPractice8.component.Action;
import guiPractice8.component.Component;

public class Button extends Component implements ButtonInterfaceTamanna {

	private static final int HEIGHT = 180;
	private static final int WIDTH = 180;
	private Action action;
	private Color displayColor;
	private Color color;
	private boolean chosenColor;
	
	

	public Button(int x, int y, int w, int h) {
		super(x, y, WIDTH, HEIGHT);
	
	}

	@Override
	public boolean isHovered(int x, int y) {
		double distance = Math.sqrt(Math.pow(x-(getX()+WIDTH/2), 2)+Math.pow(y-(getY()+HEIGHT/2), 2));
		return distance < WIDTH/2;
	}

	@Override
	public void act() {
		action.act();
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		displayColor = color;
		update();

	}

	@Override
	public ButtonInterfaceTamanna getAButton() {
		
		return null;
	}

	
	@Override
	public void highlight() {
	

	}

	@Override
	public void dim() {
		if(color != null){
			displayColor = color;
		}
		chosenColor = true;
		update();

	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(displayColor != null) g.setColor(displayColor);
		else g.setColor(Color.gray);
		g.fillOval(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.black);
		g.drawOval(0, 0, WIDTH-1, HEIGHT-1);
		if(chosenColor){
			g.setColor(Color.white);
			Polygon p = new Polygon();
			
			int s = (int)(5/8.0 * WIDTH);
			int t = (int)(1.0/5*HEIGHT)+4;
			p.addPoint(s-4, t-4);
			p.addPoint(s+7, t-2);
			p.addPoint(s+10, t);
			p.addPoint(s+14, t+10);
			p.addPoint(s+12, t+14);
			p.addPoint(s+8, t+3);
			g.fill(p);
		}

	}

	@Override
	public void setX(int i) {
		
		
	}

	@Override
	public void setY(int i) {
		
		
	}

	@Override
	public void setAction(Action action) {
		this.action = action;
		
	}
}
