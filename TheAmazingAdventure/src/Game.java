import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {
//Creating game states built into the Slick2D library.
//Game properties 
	public static final int height = 500;
	public static final int width = 500;
	public static final int frameRate = 100;
	
//Game states 
	public static final int mainMenu = 0;
	public static final int gameScreen = 1;
	public static final int gameOver = 2;

	public Game() 
	{
		super("The Amazing Adventure");
		
	}
	
	//Initialize game states 
	public void initStatesList(GameContainer gameContainer) throws SlickException
	{
	    addState(new MainMenu());
		addState(new GameScreen());
		addState(new GameOver());
	}
		
	public static void main(String[] args) 
	{
		try
		{
			AppGameContainer gameContainer = new AppGameContainer(new Game());
			gameContainer.setDisplayMode(height, width, false);
			gameContainer.setTargetFrameRate(frameRate);
			gameContainer.start();
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
	}
		
}

	


