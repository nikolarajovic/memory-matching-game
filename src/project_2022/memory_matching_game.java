package project_2022;

import java.util.Random;
import java.util.Scanner;

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
	
	public static void printToMemorise(String[] board) {
		for (int i = 0; i < board.length; i++) {
			if (i % 8 == 0) {
				System.out.println();
				System.out.print("|");
			}
			System.out.print(board[i] + "|");
		}
	}
	
	public static boolean isGameOver(boolean[] gameState) {
		for (int i = 0; i < gameState.length; i++) {
			if (!gameState[i])
				return false;
		}
		return true;
	}
	
	public static void print(String[] board, boolean[] gameState) {
		for (int i = 0; i < board.length; i++) {
			if (i % 8 == 0) {
				System.out.println();
				System.out.print("|");
			}
			if (gameState[i]) {
				System.out.print(board[i] + "|");
			} else {
				System.out.print("*|");
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
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
		printToMemorise(board);
		System.out.println();
		System.out.println("\nHave you memorised it?");
		System.out.print("If you have, please type anything you want and press enter: ");
		String text = s.nextLine();
		
		
	}

}
