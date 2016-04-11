
import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
public class Player
{
	Image player = new Image("player.jpg");
	
	ArrayList<Integer> lives = new ArrayList<Integer>();
	lives.add(1);
	lives.add(2);
	lives.add(3);
	lives.add(4);	
	
	public void render()
	{
		
	}
}
