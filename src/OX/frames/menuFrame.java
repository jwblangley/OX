package OX.frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menuFrame extends JFrame {
	public ImageIcon backImg =  new ImageIcon("src/images/background.png");
	
	public void setUp(){
		this.setSize(350,500);
		this.setTitle("Noughts & Crosses");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setSize(350, 500);
		totalGUI.setLocation(0,0);
		
		
		JLabel ButtonPanel= new JLabel(backImg);
		ButtonPanel.setLayout(null);
		ButtonPanel.setLocation(0, 0);
		ButtonPanel.setSize(350, 500);
		ButtonPanel.setOpaque(true);
	    totalGUI.add(ButtonPanel);
	    
	    final JButton play2Button = new JButton("Play 2 Player");
		play2Button.setSize(150,50);
		play2Button.setLocation(100,225);
		play2Button.setOpaque(false);
		play2Button.setFont(new Font("Helvetica", Font.BOLD, 15));
		play2Button.setVerticalAlignment(JButton.CENTER);
		play2Button.setHorizontalAlignment(JButton.CENTER);
		play2Button.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== play2Button){
	                    	 OX.run.Run.stopped="2";
	                     }

	                }       
	            }           
	        );
		ButtonPanel.add(play2Button);
		
		
		final JButton play1Button = new JButton("Play 1 Player");
		play1Button.setSize(150,50);
		play1Button.setLocation(100,125);
		play1Button.setOpaque(false);
		play1Button.setFont(new Font("Helvetica", Font.BOLD, 15));
		play1Button.setVerticalAlignment(JButton.CENTER);
		play1Button.setHorizontalAlignment(JButton.CENTER);
		play1Button.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== play1Button){
	                    	 OX.run.Run.stopped="1";
	                     }

	                }       
	            }           
	        );
		ButtonPanel.add(play1Button);
		
		JLabel welcomeLabel= new JLabel("Welcome to Noughts and Crosses");
		welcomeLabel.setSize(350,50);
		welcomeLabel.setLocation(0,25);
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		welcomeLabel.setVerticalAlignment(JLabel.CENTER);
		welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
		welcomeLabel.setForeground(new Color(0,115,255));
		ButtonPanel.add(welcomeLabel);
		
		
		totalGUI.setOpaque(true);
		this.setContentPane(totalGUI);
	}

}
