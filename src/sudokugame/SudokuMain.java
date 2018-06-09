package sudokugame;

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
		int[][] grid = new int[][] {
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
		
		
		
		
		drawGame(grid);
	}
	
	
}
