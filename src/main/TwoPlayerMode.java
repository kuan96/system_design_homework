package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TwoPlayerMode extends GameFrame{
	
	private String[] text = new String[2];
	private Color[] color = new Color[2];
	private int turn;
	private RecordFrame record;
	
	public TwoPlayerMode()
	{
		this.text[0] = "O";
		this.text[1] = "X";
		
		this.color[0] = new Color(255,215,0);
		this.color[1] = new Color(138,43,226);
		
		this.turn = 0;
		
		record = new RecordFrame();
	}
	
	public void win(int player)
	{
		this.record.setScore(player);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		 for(int i=0; i<9; i++) 
		 {
				if(e.getSource() == buttons[i] && buttons[i].getText() == "") 
				{
					buttons[i].setForeground(this.color[turn]);
					buttons[i].setText(this.text[turn]);	
					this.turn = (this.turn + 1) % 2;
					this.win(turn);
				}		
		 }
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// "r" : reset (text / color / turn / record)
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
