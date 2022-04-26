package spaceGame;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class GamePanel extends JFrame {
	
	public GamePanel (String title) throws HeadlessException{
		super(title);
	}
	
	
	public static void main(String[] args) {
		
		GamePanel gamepanel = new GamePanel("Space Game");	
		
		gamepanel.setResizable(false);	
		gamepanel.setFocusable(false);		
		
		gamepanel.setSize(800,600);	
		
		gamepanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Game game = new Game();	
		
		game.requestFocus();
		
		game.addKeyListener(game);
		
		game.setFocusable(true);
		game.setFocusTraversalKeysEnabled(false);
		
		gamepanel.add(game);
		
		gamepanel.setVisible(true);
		
		
	}

}
