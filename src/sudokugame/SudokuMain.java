package sudokugame;
import java.util.Scanner;

public class SudokuMain {
	static void drawGame(int[][] gamegrid) {
			// Adapted from code on the Introduction to Java for Online Learners course
		
			String drawNos = "%s %s %s";
			String HorLine = "----------------------";
			String pipes = " | ";
			
			String[] numbers = new String[] {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			
			for (int i = 0; i < 9; i++) {
				System.out.println(String.format(drawNos, numbers[gamegrid[i][0]], numbers[gamegrid[i][1]], numbers[gamegrid[i][2]]) 
						+ pipes
						+ String.format(drawNos, numbers[gamegrid[i][3]], numbers[gamegrid[i][4]], numbers[gamegrid[i][5]]) 
						+ pipes
						+ String.format(drawNos, numbers[gamegrid[i][6]], numbers[gamegrid[i][7]], numbers[gamegrid[i][8]]));
				
				if (((i+1) % 3 == 0) && (i != 8)) {
					System.out.println(HorLine);
				}
			}
	}
	
	public static void main(String[] args) {
		int[][] startgrid = new int[][] {
			{0,0,0,2,6,0,7,0,1},
			{6,8,0,0,7,0,0,9,0},
			{1,9,0,0,0,4,5,0,0},
			{8,2,0,1,0,0,0,4,0},
			{0,0,4,6,0,2,9,0,0},
			{0,5,0,0,0,3,0,2,8},
			{0,0,9,3,0,0,0,7,4},
			{0,4,0,0,5,0,0,3,6},
			{7,0,3,0,1,8,0,0,0}
		};
		int[][] grid = new int[9][9];
		for (int rows = 0; rows < 9; rows++) {
			for (int cols = 0; cols < 9; cols++) {
				grid[rows][cols] = startgrid[rows][cols];
			}
		}
		
		System.out.println("Welcome to Sudoku!");
		System.out.println("Here is the starting grid:");
		Scanner scan = new Scanner(System.in);
		drawGame(startgrid);
		
		boolean cont = true;
		do {
			
			System.out.println("Choose a row:");
			int row = scan.nextInt() - 1;
			
			System.out.println("Choose a column:");
			int column = scan.nextInt() - 1;
			
			
			System.out.println("Choose a number:");
			int value = scan.nextInt();
			
			
			
			if (startgrid[row][column] == 0) {
				grid[row][column] = value;
			} else {
				System.out.println("Invalid entry.  Attempted overwrite of starting position.");
			}
			
			drawGame(grid);
			
			/*
			 * Checking to see if there are any zeros left in play - if not, then end the game.
			 */
			
			boolean iszero = true;
			for (int[] rows : grid) {
				for (int val : rows) {
					if (val == 0) {
						iszero = true;
					}
				}
			}
			if (iszero != true) {
				scan.close();
				cont = false;
			}
		} while (cont == true);
		
	}
	
	
}
