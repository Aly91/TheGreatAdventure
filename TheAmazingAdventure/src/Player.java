
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Polygon;

public class Player extends Game
{
	float shipX;
	float shipY;
	float playerX;
	float playerY;
	int[] lives;
	int[] bullets;
	
  public Player() 
  {
	  
	  shipX =100;
	  shipY = 50;
	  
	  playerX = width /2;
	  playerY = height / 2;
	  
	 
	  
	  lives = new int[10];
	  bullets = new int[100];

  }
  
  
	
		
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g) throws SlickException
	{
		Polygon playerShip = new Polygon();
		playerShip.closed();
		playerShip.addPoint(shipX,shipY);
		g.setColor(Color.pink);
		g.draw(playerShip);
		
	}
	
	public void update(GameContainer gameContainer, StateBasedGame game, Graphics g) throws SlickException
	{
		if(gameContainer.getInput().isKeyPressed(Input.KEY_S))
		{
			for(int i = 0; i < bullets.length;i++)
			{
				g.setColor(Color.white);
				g.drawLine(5,5,5,5);
				
				if(bullets[i] == 0)
				{
					g.setColor(Color.red);
					g.drawString("Out of ammo", 300,100);
					
				}
			}
			
			if(gameContainer.getInput().isKeyPressed(Input.KEY_UP))
			{
			   playerY --;
				
			}
			
			if(gameContainer.getInput().isKeyPressed(Input.KEY_DOWN))
			{
				playerY ++;
			}
			
			if(gameContainer.getInput().isKeyPressed(Input.KEY_RIGHT))
			{
				playerX =+ 1;
				
			}
			
			if(gameContainer.getInput().isKeyPressed(Input.KEY_LEFT))
			{
				playerX =- 1;
			}
			}
			
		}
	

		
	}

