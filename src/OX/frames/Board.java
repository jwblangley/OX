package OX.frames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import OX.components.OXButton;
import OX.components.turnLabel;

public class Board extends JFrame {
	
	public OXButton OXButton1, OXButton2, OXButton3, OXButton4, OXButton5, OXButton6, OXButton7, OXButton8, OXButton9;
	public turnLabel infoBar;
	public void setUp(){
		this.setSize(600,700);
		this.setTitle("Noughts & Crosses");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setSize(600, 700);
		totalGUI.setLocation(0,0);
		
		JLabel ButtonPanel= new JLabel();//backImg would go here
		ButtonPanel.setLayout(null);
		ButtonPanel.setLocation(0, 0);
		ButtonPanel.setSize(600, 700);
		ButtonPanel.setOpaque(true);
	    totalGUI.add(ButtonPanel);
	    
	    infoBar= new turnLabel();
	    infoBar.setUp();
	    infoBar.setLocation(0,0);
	    ButtonPanel.add(infoBar);
	    
	    OXButton1 = new OXButton();
	    OXButton1.setLocation(2,102);
	    OXButton1.setVisible(true);
	    OXButton1.setUp();
	    OXButton1.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton1 && OXButton1.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton1.Cross();
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton1.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton1.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                    
	                     }
	                     

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton1);
	    
	    
	    OXButton2 = new OXButton();
	    OXButton2.setLocation(202,102);
	    OXButton2.setVisible(true);
	    OXButton2.setUp();
	    OXButton2.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton2 && OXButton2.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton2.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton2.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton2.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton2);
	    
	    
	    OXButton3 = new OXButton();
	    OXButton3.setLocation(402,102);
	    OXButton3.setVisible(true);
	    OXButton3.setUp();
	    OXButton3.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton3 && OXButton3.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton3.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton3.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton3.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton3);
		
	    
	    OXButton4 = new OXButton();
	    OXButton4.setLocation(2,302);
	    OXButton4.setVisible(true);
	    OXButton4.setUp();
	    OXButton4.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton4 && OXButton4.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton4.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton4.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton4.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton4);
	    
	    OXButton5 = new OXButton();
	    OXButton5.setLocation(202,302);
	    OXButton5.setVisible(true);
	    OXButton5.setUp();
	    OXButton5.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton5 && OXButton5.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton5.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton5.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton5.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton5);
	    
	    
	    OXButton6 = new OXButton();
	    OXButton6.setLocation(402,302);
	    OXButton6.setVisible(true);
	    OXButton6.setUp();
	    OXButton6.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton6 && OXButton6.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton6.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton6.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton6.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton6);
	    
	    
	    OXButton7 = new OXButton();
	    OXButton7.setLocation(2,502);
	    OXButton7.setVisible(true);
	    OXButton7.setUp();
	    OXButton7.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton7 && OXButton7.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton7.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton7.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton7.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton7);
	    
	    
	    OXButton8 = new OXButton();
	    OXButton8.setLocation(202,502);
	    OXButton8.setVisible(true);
	    OXButton8.setUp();
	    OXButton8.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton8 && OXButton8.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton8.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton8.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton8.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton8);
	    
	    
	    OXButton9 = new OXButton();
	    OXButton9.setLocation(402,502);
	    OXButton9.setVisible(true);
	    OXButton9.setUp();
	    OXButton9.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== OXButton9 && OXButton9.value.matches("none")){
	                    	 if (OX.run.Run.stopped.matches("2")){
	                    	 if (OX.run.Run.turn==true){
	                    		 OXButton9.Cross();;
	                    	 }if(OX.run.Run.turn==false){
	                    		 OXButton9.Nought();
	                    	 }
	                    	 OX.run.Run.turn=!OX.run.Run.turn;
	                    	 }else{
	                    		 if(OX.run.Run.turn){
	                    			 OXButton9.Cross();
	                    			 OX.run.Run.turn=!OX.run.Run.turn;
	                    		 }
	                    	 }
	                     }

	                }       
	            }           
	        );
	    ButtonPanel.add(OXButton9);
	    
	    
	    
		
		totalGUI.setOpaque(true);
		this.setContentPane(totalGUI);
	}

}
