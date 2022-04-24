package ppa1;

import java.util.Scanner;

public class Board implements Game {
	java.util.Scanner scn=new Scanner(System.in);
	Player player=new Player();
	Ghost ghost=new Ghost();
	Key key=new Key();
	Door door=new Door();
	char board[][];
	public Board() {		
		board = new char[][] {
			 {' ','бс',' ',' ',' ',' ','бс',' ','бс',' ',' ',' ',' ',' ',' '},
			 {' ','бс',' ','бс','бс','бс','бс',' ','бс',' ','бс',' ','бс','бс',' '},
			 {' ','бс',' ',' ',' ','бс',' ',' ','бс',' ','бс',' ',' ','бс',' '},
			 {' ','бс',' ','бс',' ','бс',' ','бс','бс',' ','бс','бс',' ','бс',' '},
			 {' ',' ',' ','бс',' ','бс',' ',' ',' ',' ',' ',' ',' ',' ',' '},
			 {' ','бс','бс','бс',' ',' ',' ','бс','бс','бс','бс','бс','бс','бс',' '},
			 {' ',' ',' ',' ',' ','бс',' ',' ',' ',' ',' ',' ',' ','бс',' '},
			 {'бс','бс',' ','бс','бс','бс',' ','бс','бс','бс','бс','бс',' ','бс',' '},
			 {' ',' ',' ',' ',' ',' ',' ','бс',' ',' ',' ',' ',' ','бс',' '},
			 {' ','бс','бс',' ','бс','бс',' ','бс',' ','бс','бс','бс',' ','бс',' '},
			 {' ','бс',' ',' ',' ',' ',' ','бс',' ',' ',' ','бс',' ','бс',' '},
			 {' ','бс',' ','бс','бс','бс','бс','бс','бс','бс','бс','бс',' ','бс',' '},
			 {' ','бс',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','бс',' '},
			 {' ','бс','бс','бс',' ','бс','бс','бс','бс','бс','бс','бс',' ','бс',' '},
			 {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
			};
		/* add your code, you can add parameter, too */
			
	}
	
	public void printBoard() {
		board = new char[][] {
			 {' ','бс',' ',' ',' ',' ','бс',' ','бс',' ',' ',' ',' ',' ',' '},
			 {' ','бс',' ','бс','бс','бс','бс',' ','бс',' ','бс',' ','бс','бс',' '},
			 {' ','бс',' ',' ',' ','бс',' ',' ','бс',' ','бс',' ',' ','бс',' '},
			 {' ','бс',' ','бс',' ','бс',' ','бс','бс',' ','бс','бс',' ','бс',' '},
			 {' ',' ',' ','бс',' ','бс',' ',' ',' ',' ',' ',' ',' ',' ',' '},
			 {' ','бс','бс','бс',' ',' ',' ','бс','бс','бс','бс','бс','бс','бс',' '},
			 {' ',' ',' ',' ',' ','бс',' ',' ',' ',' ',' ',' ',' ','бс',' '},
			 {'бс','бс',' ','бс','бс','бс',' ','бс','бс','бс','бс','бс',' ','бс',' '},
			 {' ',' ',' ',' ',' ',' ',' ','бс',' ',' ',' ',' ',' ','бс',' '},
			 {' ','бс','бс',' ','бс','бс',' ','бс',' ','бс','бс','бс',' ','бс',' '},
			 {' ','бс',' ',' ',' ',' ',' ','бс',' ',' ',' ','бс',' ','бс',' '},
			 {' ','бс',' ','бс','бс','бс','бс','бс','бс','бс','бс','бс',' ','бс',' '},
			 {' ','бс',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','бс',' '},
			 {' ','бс','бс','бс',' ','бс','бс','бс','бс','бс','бс','бс',' ','бс',' '},
			 {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
			};
		/* add your code, you can add parameter, too */

		this.board[door.getY()][door.getX()]='D';
		if(key.value==0)
			this.board[key.getY()][key.getX()]='K';
		this.board[ghost.getY()][ghost.getX()]='G';
		this.board[player.getY()][player.getX()]='P';
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void initObjects() {
		/* add your code, you can add parameter, too */
		while(true) {
			System.out.println("Input player x,y (0 ~ 14) :");
			int player_x=scn.nextInt();
			int player_y=scn.nextInt();
			player.PlayerInit(player_x,player_y);
			if(-1<player.getX()&&player.getX()<15&&-1<player.getY()&&player.getY()<15&&board[player_y][player_x]==' ')
				break;
		
			
		}
		while(true) {
			System.out.println("Input ghost x, y (0~14) :");
			int ghost_x=scn.nextInt();
			int ghost_y=scn.nextInt();
			ghost.GhostInit(ghost_x,ghost_y);
			if(-1<ghost.getX()&&ghost.getX()<15&&-1<ghost.getY()&&ghost.getY()<15&&(ghost.getX()!=player.getX()||ghost.getY()!=player.getY()))
				break;
		
		}
		while(true) {
			System.out.println("Input key x,y (0 ~ 14) :");
			int key_x=scn.nextInt();
			int key_y=scn.nextInt();
			key.KeyInit(key_x,key_y);
			if(-1<key.getX()&&key.getX()<15&&-1<key.getY()&&key.getY()<15&&board[key_y][key_x]==' '&&(key.getX()!=player.getX()||key.getY()!=player.getY()))
				break;
		
		}
		while(true) {
			System.out.println("Input door x,y (0 ~ 14) :");
			int door_x=scn.nextInt();
			int door_y=scn.nextInt();
			door.DoorInit(door_x,door_y);
			if(-1<door.getX()&&door.getX()<15&&-1<door.getY()&&door.getY()<15&&board[door_y][door_x]==' '&&(door.getX()!=player.getX()||door.getY()!=player.getY()))
				break;
		}
		scn.nextLine();
	}
	
	public void movePlayer() {

		String input=scn.nextLine();
		int x;
		int y;
		String up="u";
		String down="d";
		String right="r";
		String left="l";
		if(input.compareTo(up)==0) {
			x=0;y=-1;
		}
		else if(input.compareTo(down)==0) {
			x=0;y=1;
		}
		else if(input.compareTo(right)==0) {
			x=1;y=0;
		}
		else if(input.compareTo(left)==0) {
			x=-1;y=0;
		}
		else {
			x=0;y=0;
		}
		
		if(-1<player.getX()+x&&player.getX()+x<15&&-1<player.getY()+y&&player.getY()+y<15&&(board[player.getY()+y][player.getX()+x]!='бс'))
			player.move(x,y);
		if(player.getX()==key.getX()&&player.getY()==key.getY())
			key.value=1;
	}	
	
	public void moveGhost() {
		/* add your code, you can add parameter, too */
		if(ghost.rest==0) {
			ghost.rest=1;
			ghost.Compare(this.board,player.getX(),player.getY());
		}
		else 
			ghost.rest=0;
	}
	
	public boolean isFinish() {
		/* add your code, you can add parameter, too */
		if(key.value==1&&door.getX()==player.getX()&&door.getY()==player.getY()) {
			System.out.println("YOU WIN");
			scn.close();
			return true;
		}
		if(ghost.getX()==player.getX()&&ghost.getY()==player.getY()) {
			System.out.println("YOU LOSE");
			return true;
		}
		
		return false;
	}
	
}
