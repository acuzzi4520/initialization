package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	
	private int x;
	private int y;
	private int w;
	private int h;
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text,Color color,Action action) {
		super(x, y, w, h, text);
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = color;
		this.action = action;
		update();
	}
	
	@Override
	public void update(Graphics2D g) {
		g = clear();//clears image and gets new Graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.drawRoundRect(x, y, w, h, 25, 25);
		g.setColor(Color.white);
		g.fillRoundRect(x, y, w, h, 25, 25);
	}
	
	public int getX(){
		return x;
	}

}
