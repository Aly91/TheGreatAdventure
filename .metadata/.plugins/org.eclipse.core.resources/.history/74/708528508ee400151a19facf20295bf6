import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {
//Creating game states built into the Slick2D library.
//Game properties 
	public static final int height = 500;
	public static final int width = 500;
	public static final int frameRate = 60;
	
//Game states 
	public static final int mainMenu = 0;
	public static final int gameScreen = 1;
	public static final int gameOver = 2;

	public Game() 
	{
		super("game");
		
	}
	
	//Initalize game states 
	public void initStatesList(GameContainer gameContainer) 
	{
		this.addState(new MainMenu(mainMenu));
		this.addState(new GameScreen(gameScreen));
		this.addState(new GameOver(gameOver));
	}
		
	public static void main(String[] args) 
	{
		try
		{
			AppGameContainer game = new AppGameContainer(new Game());
			game.setDisplayMode(height, width, false);
			game.setTargetFrameRate(frameRate);
			game.start();
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
	}
		
}

	


