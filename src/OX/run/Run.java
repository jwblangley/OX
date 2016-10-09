package OX.run;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Random;

import OX.components.OXButton;
import OX.frames.Board;
import OX.frames.drawFrame;
import OX.frames.menuFrame;
import OX.frames.winFrame;

public class Run {
	public static boolean turn;
	public static String stopped="true";
	public static Board board;
	public static drawFrame draw;
	public static boolean continuing=false;
	public static void main(String[] args) {
		menuFrame menu = new menuFrame();
		board = new Board();
		winFrame win= new winFrame();
		draw = new drawFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width1 = screenSize.getWidth();
		double height1 = screenSize.getHeight();
		int width=(int)width1;
		int height=(int)height1;
		int xCoor=(width/2)-175;
		int yCoor=(height/2)-250;
		Point locat=new Point(xCoor, yCoor);
		int BxCoor=(width/2)-300;
		int ByCoor=(height/2)-360;
		Point Blocat=new Point(BxCoor, ByCoor);
		draw.setLocation(locat);
		menu.setLocation(locat);
		win.setLocation(locat);
		board.setLocation(Blocat);
		while(true){
		stopped="true";
		continuing=false;
		turn=true; //false is Nought's turn and true is Cross's turn
		menu.setUp();
		menu.setVisible(true);
		while (stopped.matches("true")){
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}
		menu.setVisible(false);
		if(stopped.matches("2")){
		
		board.setUp();
		board.setVisible(true);
		
		
		GO:while (true){
		while (!Boolean.valueOf(Won())){
			if (turn){
				board.infoBar.setText("Cross' turn");
			}else{
				board.infoBar.setText("Nought's turn");
			}
			try{
				Thread.sleep(50);
			}catch(Exception e){}
			if (Won().equals("broken")){
				break GO;
			}
		}
		
		win.setUp(!turn);//have to use not turn because winner would've just taken turn
		win.setVisible(true);
		break GO;}
		
		}else{ //1 player
			Random rand= new Random();
			
			if (rand.nextInt(2)==1){ //this chooses who goes first
				turn=true;//player is always crosses 
			}else{
				turn=false;//computer is noughts
			}
			board.setUp();
			board.setVisible(true);
			
			GO2: while (true){
			while (!Boolean.valueOf(Won())){
				if (turn){//players turn
					while (turn){// will break when player takes turn
						try{
							Thread.sleep(50);
						}catch(Exception e){}
					}
				if(Won().matches("broken")){//will fix the game if there is a draw
					break GO2;
				}
				}else{
					OXButton AllButtons[]={board.OXButton1, board.OXButton2, board.OXButton3, board.OXButton4, board.OXButton5, board.OXButton6, board.OXButton7, board.OXButton8, board.OXButton9};
					
					//set all button colours to black
					for (int i =0; i<9; i++){
						AllButtons[i].setForeground(Color.BLACK);
					}
					
					UPPER: while(true){
						//can I win
					for (int i=0; i<9; i++){
						OXButton tempButton=AllButtons[i];
						
						if(tempButton.value.equals("none")){//Button can be played
							tempButton.value="O";
							if(WonNoDraw(board)){
								tempButton.Nought();
								tempButton.setForeground(Color.RED);
								turn=!turn;
								break UPPER;
							}
							tempButton.value="none";	
						}
					}
					// can player win
					for (int i=0; i<9; i++){
						OXButton tempButton=AllButtons[i];
						
						if(tempButton.value.equals("none")){//Button can be played
							tempButton.value="X";
							if(WonNoDraw(board)){
								tempButton.Nought();
								tempButton.setForeground(Color.RED);
								turn=!turn;
								break UPPER;
							}
							tempButton.value="none";
						}
					}
					
					//choose random
					Random rand3 = new Random();
					while(true){
						OXButton tempButton1= AllButtons[rand3.nextInt(9)];
						if (tempButton1.value.equals("none")){
							tempButton1.Nought();
							tempButton1.setForeground(Color.RED);
							turn=!turn;
							break UPPER;
						}
					}
					}
				}
				
				
				if (Won().equals("broken")){
					break GO2;
					}
			} 
			
			win.setUp(!turn);//have to use not turn because winner would've just taken turn
			win.setVisible(true);
			break GO2;
			
			
		}}

		while(!continuing){
			try{
				Thread.sleep(50);
			}catch(Exception e){}
			
		}win.setVisible(false);
		board.setVisible(false);
		draw.setVisible(false);
		}

		}
		
	
	public static String Won(){
		OXButton Horizontal1[]= {board.OXButton1, board.OXButton2, board.OXButton3};
		OXButton Horizontal2[]= {board.OXButton4, board.OXButton5, board.OXButton6};
		OXButton Horizontal3[]= {board.OXButton7, board.OXButton8, board.OXButton9};
		
		
		// check verticals
		for (int i=0; i<3; i++){
			if(Horizontal1[i].value.equals(Horizontal2[i].value)&&Horizontal2[i].value.equals(Horizontal3[i].value)&&!Horizontal1[i].value.equals("none")){
				return "true";
			}
			
		}
		
		// check horizontals
		if(Horizontal1[0].value.equals(Horizontal1[1].value)&&Horizontal1[1].value.equals(Horizontal1[2].value)&&!Horizontal1[0].value.equals("none")){
			return "true";
		}
		if(Horizontal2[0].value.equals(Horizontal2[1].value)&&Horizontal2[1].value.equals(Horizontal2[2].value)&&!Horizontal2[0].value.equals("none")){
			return "true";
		}
		if(Horizontal3[0].value.equals(Horizontal3[1].value)&&Horizontal3[1].value.equals(Horizontal3[2].value)&&!Horizontal3[0].value.equals("none")){
			return "true";
		}
		
		//check diagnonals
		if(Horizontal1[0].value.equals(Horizontal2[1].value)&&Horizontal2[1].value.equals(Horizontal3[2].value)&&!Horizontal1[0].value.equals("none")){
			return "true";
		}
		if(Horizontal3[0].value.equals(Horizontal2[1].value)&&Horizontal2[1].value.equals(Horizontal1[2].value)&&!Horizontal3[0].value.equals("none")){
			return "true";
		}
		
		//check draw
		
		OXButton all[]={ board.OXButton1, board.OXButton2, board.OXButton3, board.OXButton4, board.OXButton5, board.OXButton6, board.OXButton7, board.OXButton8, board.OXButton9};
		for (int i=0; i<9; i++){
			if(!all[i].value.equals("none")){
				continue;
			}else{
				return "false";
			}
		}
		
		draw.setUp();
		draw.setVisible(true);
		return "broken";
	}
	
	public static boolean WonNoDraw(Board board){
		OXButton Horizontal1[]= {board.OXButton1, board.OXButton2, board.OXButton3};
		OXButton Horizontal2[]= {board.OXButton4, board.OXButton5, board.OXButton6};
		OXButton Horizontal3[]= {board.OXButton7, board.OXButton8, board.OXButton9};
		
		
		// check verticals
		for (int i=0; i<3; i++){
			if(Horizontal1[i].value.equals(Horizontal2[i].value)&&Horizontal2[i].value.equals(Horizontal3[i].value)&&!Horizontal1[i].value.equals("none")){
				return true;
			}
			
		}
		
		// check horizontals
		if(Horizontal1[0].value.equals(Horizontal1[1].value)&&Horizontal1[1].value.equals(Horizontal1[2].value)&&!Horizontal1[0].value.equals("none")){
			return true;
		}
		if(Horizontal2[0].value.equals(Horizontal2[1].value)&&Horizontal2[1].value.equals(Horizontal2[2].value)&&!Horizontal2[0].value.equals("none")){
			return true;
		}
		if(Horizontal3[0].value.equals(Horizontal3[1].value)&&Horizontal3[1].value.equals(Horizontal3[2].value)&&!Horizontal3[0].value.equals("none")){
			return true;
		}
		
		//check diagnonals
		if(Horizontal1[0].value.equals(Horizontal2[1].value)&&Horizontal2[1].value.equals(Horizontal3[2].value)&&!Horizontal1[0].value.equals("none")){
			return true;
		}
		if(Horizontal3[0].value.equals(Horizontal2[1].value)&&Horizontal2[1].value.equals(Horizontal1[2].value)&&!Horizontal3[0].value.equals("none")){
			return true;
		}
	
		return false;
	}
	
}
	

