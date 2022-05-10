package spaceGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JPanel;
import javax.swing.Timer;

class Fire{
	
	private int x;
	private int y;
	
	public Fire(int x, int y) {		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class Game extends JPanel implements KeyListener,ActionListener {
	
	Timer timer = new Timer(1,this);
	
	private int passingTime = 0;
	private int usedFire = 0;
	
	private BufferedImage image;
	
	private ArrayList<Fire> fires = new ArrayList<Fire>();
	
	private int firesX = 1;
	
	private int ballX = 0;
	
	private int ballsX = 2;
	
	private int spaceShipX = 0;
	
	private int spaceX = 20;
	
	public Game() {
		
		try {
			image = ImageIO.read(new FileImageInputStream(new File("spaceShip.png")));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		setBackground(Color.black);
		
		timer.start();
	}
	
		
	public void paint(Graphics g) {		
		super.paint(g);
		
		g.setColor(Color.red);
		g.fillOval(ballX, 0, 20, 20);
		
		g.drawImage(image,spaceShipX,490,image.getWidth() /50 , image.getHeight() /50,this);
	}
	
	public void repaint() {		
		super.repaint();
	}


	public void actionPerformed(ActionEvent e) {	
		
		ballX += ballsX;
		
		if(ballX >= 750) {
			ballsX = -ballsX;
		}
		if(ballX <= 0) {
			ballsX = -ballsX;
		}
		repaint();
	}

	
	public void keyTyped(KeyEvent e) {				
	}

	
	public void keyPressed(KeyEvent e) {				
	}

	
	public void keyReleased(KeyEvent e) {				
	}

}
