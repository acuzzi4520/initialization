package guiPractice.components;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class MovingComponent extends Component 
		implements Runnable {
	
	private double vx;
	private double vy;
	private double posx;
	private double posy;
	private boolean running;
	private long moveTime;//represents time when image last moved

	public static final int REFRESH_RATE = 20;
	
	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		vx = 0;
		vy = 0;
		running = false;
	}

	public boolean isAnimated () {
		return true;
	}

	@Override
	public void run() {
		posx = getX();
		posy = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running){
			try{
				Thread.sleep( REFRESH_RATE);
				checkBehaviors();
				update();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public abstract void checkBehaviors();

	@Override
	public void update(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		//calculates time since last move
		long difference = currentTime - moveTime;
		if(difference >= REFRESH_RATE){
			//an update is happening, so update moveTime
			moveTime = currentTime;
			//calculate new position
			posx += vx*(double)difference/REFRESH_RATE;
			posy += vy*(double)difference/REFRESH_RATE;
			//set only the location on the screnn
			//NOT the actual position
			super.setX((int)posx);
			super.setY((int)posy);
		}
		drawImage(g);
	}
	
	public abstract void drawImage(Graphics2D g); 

	public void setX(int x){
		super.setX(x);
		posx = x;
	}

	public void setY(int y){
		super.setY(y);
		posy = y;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void play() {
		if(!running){
			Thread go = new Thread(this);
			go.start();
		}
	}
	
	

}
