
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player
{
  public Player() 
  {
  
	  float x, y;
	  
	  int[] bullets  =  new int[100];
	  int[] lives = new int[10];

  }
  
  
	
		
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g) throws SlickException
	{
	
	Image player  = new Image("player.png");
	g.drawImage(player,50,50);
		
	}
	
	public void update()
	{
		for(int i = 0; i < bullets.length();i ++)
		{
			
		}

		
	}
}
