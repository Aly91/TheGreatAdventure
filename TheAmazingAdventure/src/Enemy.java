
import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Enemy extends Game
{

	float enemyX;
	float enemyY;
	int speed;
	
	Image enemy;
	
 ArrayList<Enemy> enemies = new ArrayList<Enemy>();
 
	
	
	public Enemy() 
	{

		enemyX = width / 2;
		enemyY = height / 2;
		speed = 6;
	
		
		
	}
	

	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g)throws SlickException
	{
		for(int i = 0; i<enemies.size(); i++)
		{
			enemy = new Image("enemy.png");
			enemies.add(new Enemy());
			enemies.add(new Enemy());
			
			
			Enemy e = enemies.get(i);
			
			 g.drawImage(enemy,enemyX,enemyY);
		}
		
	}
	
	public void update(GameContainer gameContainer, StateBasedGame game, int delta) throws SlickException
	{
	
	}
	
	
}
	
	
	
	


