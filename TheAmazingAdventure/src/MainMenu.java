

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

//import org.newdawn.slick.font.effects.*;;


public class MainMenu implements GameState
{

	public final int stateID = 0;
	private StateBasedGame game;

	
	public int getID()
	{
		return stateID;
	}


	public void inputEnded() {
		// TODO Auto-generated method stub

	}

	public void inputStarted() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(int keyPress, char c) 
	{
		
		
	}

	
	@Override
	public void controllerButtonPressed(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerDownPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerDownReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerLeftPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerLeftReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerRightPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerRightReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerUpPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerUpReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enter(GameContainer gameContainer, StateBasedGame game) throws SlickException 
	{
		

	}
	 

	public void init(GameContainer gameContainer, StateBasedGame game) throws SlickException {
		this.game = game;
		game.getState(Game.mainMenu);	
	}
	

	public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g) throws SlickException {
		
		//Image menuScreen = new Image ("mainMenu.jpg");
		
		//g.drawImage(menuScreen, 0,0);
		
		g.drawString(" '10 out of 10' - IGN",310,350); 
		g.setColor(Color.white);
		}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame game, int delta) throws SlickException {
		//Controls for beginning and exiting game from main menu. Fairly self-explanatory.
		if(gameContainer.getInput().isKeyPressed(Input.KEY_ENTER))
		{
			  game.enterState(Game.gameScreen, new FadeOutTransition(Color.black), new FadeInTransition (Color.black));
		}
		if(gameContainer.getInput().isKeyPressed(Input.KEY_Q))
		{
			gameContainer.exit();
		}
		
		//This next control block is for allowing players to select their chosen level before they begin
		
		if(gameContainer.getInput().isKeyPressed(Input.KEY_1))
		{
			
		}
		
		else if(gameContainer.getInput().isKeyPressed(Input.KEY_2))
		{
		}
		
		else if(gameContainer.getInput().isKeyPressed(Input.KEY_3))
		{
		}
		
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}



	public void keyReleased() {
		
		
		
	}


	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

}
