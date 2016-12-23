package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Visible;

public abstract class Screen {
	
	protected static int width;
	protected static int height;
	private ArrayList<Visible> viewObjects;
	
	protected BufferedImage image;

	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}



	private void initImage() {
		image = new BufferedImage(width,
				height,
				BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		//make background
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
//		g.setFont(new Font("Helvetica",Font.PLAIN,20));
//		g.drawString("Hello", 40, 80);
//		g.drawOval(0, 40, 120, 80);
//		g.drawRect(20, 120, 80, 110);
//		g.drawLine(100, 120, 110, 200);
//		
//		g.setColor(Color.green);
//		for(int i = 0; i < image.getWidth();i+=2){
//			g.drawLine(i, 230, i, 238);
//		}
	}
	/**
	 * remove a visible from the screen
	 * @param v
	 */
	
	public void remove(Visible v){
		/**
		 * ARRAYLIST NOTES
		 * 
		 * while this method is very simple, do not 
		 * underestimate the trickiness of moving items 
		 * in an arrayList.It causes indices to change.
		 * Example:Suppose you have an arrayList<integer> 
		 * and you want to remove all values greater than 5.
		 * 
		 * This is BAD:
		 * 
		 * for(int i = 0; i < list.size();i++){
		 * 	if(lsit.get(i) > 5){ list.remove(i);}
		 * }
		 * 
		 * suppose you have (4,5,6,7)
		 * the first integer to be removed is 6, at index 2.
		 * Since it is removed, 7 moves from index 3 to index 2.
		 * your list is now (4,5,7)
		 * after you increment i, i becomes 3.
		 * This is out of bounds
		 * so 7 never gets removed
		 * Instead, when an object is removed,
		 * decrease i to compensate for change in size:
		 * 
		 * CORRECT
		 * *for (int i = 0; i < list.size(); i++){
		 * 	if(list.get(i) > 5) {
		 * 			list.remove(i);
		 * 			i--;
		 * 	}
		 * }
		 */
		viewObjects.remove(v);
		/**
		 * this removes the object that has the same identity
		 * as v, not the object that is equal to v.
		 */
		
	}
	
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(0,v);
			//moves all objects with index >= n
			//forward by 1, increases size by 1
			//adds object to index n.
		}
	}
	
	public BufferedImage getImage(){
		return image;
		
	}

	public MouseListener getMouseListener() {
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}

	public void addObject(Visible v) {
		viewObjects.add(v);
	}



	public abstract void initObjects(List<Visible> viewObjects);



	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}

}