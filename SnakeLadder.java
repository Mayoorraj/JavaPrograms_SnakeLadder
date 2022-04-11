package com.bridgelabz.assignment4.SnakeLadder;

public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println("welcome to Snake And ladder Program");	
		int playerPos = 0;
		byte dice = (byte)(Math.random()*6 + 1 );
		System.out.println("Dice Show: " + dice);
		byte playerOptions = (byte)(Math.random()*3 );
		
		switch (playerOptions) {
		
		case 0:
			System.out.println("Player stays at same postion");
			break;
			
		case 1:
			System.out.println("Player played & got a Ladder");
			playerPos = playerPos + dice;
			break;
			
		default:
			System.out.println("Player played & got a Snake");
			playerPos = playerPos - dice;
			if (playerPos <= 0) {
				playerPos = 0;}
			break;	
		}
		System.out.println("Player is at position : " + playerPos);
	}
}
