import org.newdawn.slick.AppGameContainer;

import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.Color;

public class Player extends Game
{
	float shipX;
	float shipY;
	float playerX;
	float playerY;
	int[] lives;
	int[] bullets;
	int speed;
	Polygon playerShip = new Polygon();
	
	
  public Player() 
  {
	  
	  shipX =100;
	  shipY = 50;
	  speed = 5;
	  
	  playerX = width /2;
	  playerY = height / 2;
	 


	playerShip.addPoint(0, -10);
	playerShip.addPoint(10, 10);
	playerShip.addPoint(-10, 10);
	
;

	 
	  
	  lives = new int[10];
	  bullets = new int[100];

  }
  
  
	
		
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g) throws SlickException
	{
		
		
		g.drawString("Lives : " + lives[9],50,10);
		
		g.drawString("Ammo : " +bullets[99], 250,10);


		//playerShip.transform(Transform.createTranslateTransform(playerX, playerY));
		
		/*playerShip.getPoints();
		playerShip.setX(shipX);
		playerShip.setY(shipY);
		
		playerShip.getX();
		playerShip.getY();
		*/
		
		playerShip.setLocation(playerX, playerY);
		g.draw(playerShip);
		
	
		//playerShip.drawLine(shipX, shipY, shipY, shipX);
	
	
		g.setColor(Color.pink);
		//g.drawLine(shipX,shipY,shipY,shipX);

		
	}

	
	public void update(GameContainer gameContainer, StateBasedGame game, Graphics g, int delta) throws SlickException
	{
		
		if(gameContainer.getInput().isKeyPressed(Input.KEY_UP))
		{
		    playerY -= speed;
		   System.out.println("up pressed");
			
		}
		if(gameContainer.getInput().isKeyPressed(Input.KEY_DOWN))
		{
			 playerY += speed; 
			 System.out.println("down pressed");
		}
		
		if(gameContainer.getInput().isKeyPressed(Input.KEY_RIGHT))
		{
			 playerX += speed;
			 System.out.println("right pressed");
			
		}
		
		if(gameContainer.getInput().isKeyPressed(Input.KEY_LEFT))
		{
			playerX -=1;
			 System.out.println("left pressed");
		}
	
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
				 System.out.println("shoot");
			}
			
			
			
			
		
			
		
			
			
		}
	}
	
}
