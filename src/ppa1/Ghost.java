package ppa1;

public class Ghost extends GameObject{
	public int rest;
	public Ghost(      ) {
		/* add your code, you can add parameter, too */
		this.rest=0;
	}	
	public void GhostInit(int x,int y) {
		setX(x);
		setY(y);
	}
	public void move() {
		/* add your code, you can add parameter, too */

	}
	public void Compare(char board[][], int x,int y) {
		if(getX()>x) {
			if(0<getX()-1)
				setX(getX()-1);
		}
		else if(getX()<x) {
			if(getX()+1<15)
				setX(getX()+1);
		}
		if(getY()>y) {
			if(0<getY()-1)
				setY(getY()-1);
		}
		else if(getY()<y) {
			if(getY()+1<15)
				setY(getY()+1);
		}
	}
}