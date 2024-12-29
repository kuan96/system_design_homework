package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class SingleMode extends GameFrame{
		@Override
		public void actionPerformed(ActionEvent e) {
		 for(int i=0;i<9;i++) {
				if(e.getSource()==buttons[i]) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,215,0));
						buttons[i].setText("O");
					}
				}		
			}
		}
	
		@Override
		public void keyTyped(KeyEvent e) {
			
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
