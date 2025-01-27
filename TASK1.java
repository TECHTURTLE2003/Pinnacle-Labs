package game;

import java.util.*;

public class Tic_Tac_Toe_Game {

	public static void main(String[] args) {
		char Tboard[][] = new char[3][3];
		for (int row = 0; row < Tboard.length; row++) {
			for (int col = 0; col < Tboard[row].length; col++) {
				Tboard[row][col] = ' ';
			}
		}
		char plr1 = 'X';
		boolean gOver = false;
		Scanner scanner = new Scanner(System.in);

		while (gOver != true) {
			printBoard(Tboard);
			System.out.print("Player " + plr1 + " enter: ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			System.out.println();

			if (Tboard[row][col] == ' ') {
				Tboard[row][col] = plr1;
				gOver = win(Tboard, plr1);
				if (gOver) {
					System.out.println("Player " + plr1 + "has won the game. ");
				} else {
					if (plr1 == 'X') {
						plr1 = 'O';
					} else {
						plr1 = 'X';
					}
				}
			} else {
				System.out.println("Invalid move. Please Try again!!!!");
			}
		}
	}

	public static boolean win(char b[][], char plr) {
		for (int row = 0; row < b.length; row++) {
			if (b[row][0] == plr && b[row][1] == plr && b[row][2] == plr) {
				return true;
			}
		}
		for (int col = 0; col < b.length; col++) {
			if (b[0][col] == plr && b[1][col] == plr && b[2][col] == plr) {
				return true;

			}
		}
		if (b[0][0] == plr && b[1][1] == plr && b[2][2] == plr) {
			return true;
		}
		if (b[0][2] == plr && b[1][1] == plr && b[2][0] == plr) {
			return true;
		}

		return false;
	}

	public static void printBoard(char b[][]) {
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				System.out.print(b[row][col] + " | ");
			}
			System.out.println();
		}
	}
}
