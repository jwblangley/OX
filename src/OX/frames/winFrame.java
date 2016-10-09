package OX.frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class winFrame extends JFrame {
	public ImageIcon backImg =  new ImageIcon("src/images/background.png");
	
	public void setUp(boolean winner){
		this.setSize(350,500);
		this.setTitle("Noughts & Crosses");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setSize(350, 500);
		totalGUI.setLocation(0,0);
		
		JLabel backPanel= new JLabel(backImg);
		backPanel.setLayout(null);
		backPanel.setLocation(0, 0);
		backPanel.setSize(350, 500);
		backPanel.setOpaque(true);
	    totalGUI.add(backPanel);
	    
	    JLabel winLabel= new JLabel();
	    winLabel.setSize(350,50);
	    winLabel.setLocation(0,25);
	    winLabel.setHorizontalAlignment(JLabel.CENTER);
	    winLabel.setVerticalAlignment(JLabel.CENTER);
	    winLabel.setFont(new Font("Helvetica", Font.BOLD, 28));
	    winLabel.setForeground(new Color(0,115,255));
	    if (winner){
	    	winLabel.setText("Congratulations Crosses!");
	    }else{
	    	winLabel.setText("Congratulations Noughts!");
	    }
	    backPanel.add(winLabel);
	    
	    
	    JLabel UwinLabel= new JLabel("You Win");
	    UwinLabel.setSize(350,50);
	    UwinLabel.setLocation(0,100);
	    UwinLabel.setHorizontalAlignment(JLabel.CENTER);
	    UwinLabel.setVerticalAlignment(JLabel.CENTER);
	    UwinLabel.setFont(new Font("Helvetica", Font.BOLD, 28));
	    UwinLabel.setForeground(new Color(0,115,255));
	    backPanel.add(UwinLabel);
	    
	   
	    final JButton reButton = new JButton("Replay");
	    reButton.setSize(150,50);
	    reButton.setLocation(100,225);
	    reButton.setOpaque(false);
	    reButton.setFont(new Font("Helvetica", Font.BOLD, 15));
	    reButton.setVerticalAlignment(JButton.CENTER);
	    reButton.setHorizontalAlignment(JButton.CENTER);
	    reButton.addActionListener(
	            new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent event) {
	                     if (event.getSource()== reButton){
	                    	 OX.run.Run.continuing=true;
	                     }

	                }       
	            }           
	        );
	    backPanel.add(reButton);
		
		
		totalGUI.setOpaque(true);
		this.setContentPane(totalGUI);
	}

}
