package ppa1;

public class Player extends GameObject{

	public Player() {

	}
		/* add your code, you can add parameter, too */
	public void PlayerInit(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void move(int x,int y) {
		/* add your code, you can add parameter, too */
		setX(getX()+x);
		setY(getY()+y);
	}
}
