package test;

import main.*;

public class Test_playerData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playerData data = new playerData();
		System.out.println(data.get_ID());
		
		data.insert_ID("aaa");
		System.out.println(data.get_ID());
	}

}
