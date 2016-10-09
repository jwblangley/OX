package OX.components;

import java.awt.Font;

import javax.swing.JButton;


public class OXButton extends JButton {
	public String value= "none";
	public void setUp(){
		this.setSize(198,198);
		this.setText("");
		this.setFont(new Font("Helvetica", Font.BOLD, 150));
		this.setVerticalAlignment(JButton.CENTER);
		this.setHorizontalAlignment(JButton.CENTER);
	}
	public void Nought(){
		this.value="O";
		this.setText("O");
	}
	public void Cross(){
		this.value="X";
		this.setText("X");
	}

}
