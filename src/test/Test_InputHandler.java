package test;

import main.*;

public class Test_InputHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playerData player_ID = new playerData();
		InputHandler input = new InputHandler(player_ID);
		
		input.init();
		input.clarify();
	}

}
