package OX.components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class turnLabel extends JLabel{
	public void setUp(){
		this.setSize(600,100);
		this.setOpaque(true);
		this.setBackground(Color.BLACK);
		this.setForeground(new Color(255,140,0));
		this.setText("Player's Turn");
		this.setFont(new Font("Helvetica", Font.BOLD, 85));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
	
	}

}
