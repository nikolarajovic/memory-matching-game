package project_2022;

import java.util.Random;

public class memory_matching_game {

	public static void shuffle(String[] board) {
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			int random = r.nextInt(board.length);
			String temp = "";
			temp = board[random];
			board[random] = board[i];
			board[i] = temp;
		}
	}

	public static void main(String[] args) {
		
		boolean[] gameState = new boolean[64];

		String[] board = { "Q", "W", "E", "R", "T", "Y", "I", "O", "P", 
				"A", "S", "D", "F", "G", "H", "J", "K", "L",
				"Z", "X", "C", "V", "B", "N", "M", "1", "2", 
				"3", "4", "5", "6", "7", "Q", "W", "E", "R", 
				"T", "Y", "I","O", "P", "A", "S", "D", "F", "G", 
				"H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", 
				"M", "1", "2", "3","4", "5", "6", "7" };

		System.out.print("*** MEMORY MATCHING GAME ***\n");
		shuffle(board);
	}

}
