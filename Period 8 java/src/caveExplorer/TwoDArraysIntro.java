package caveExplorer;

import java.util.Scanner;

public class TwoDArraysIntro {
	
	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;

	public static void main(String[] args) {
	
//		boolean[][] mines = new boolean[6][6];
//		plantMines(mines);
//		String[][] field = createField(mines);
//		PrintPic(field);
		String[][] field = new String[17][21];
		makeBorder(field);
		makeInsides(field);
		PrintPic(field);
//		arr2D = new String[5][5];
//		pic = new String[5][5];
//		for(int row = 0; row < arr2D.length; row++){
//			for(int col = 0; col < arr2D[0].length; col++){
//				arr2D[row][col] = "(" + row + "," + col + ")";
//			}
//		}
//		starti = 2;
//		startj = 2;
//		treasurei = 4;
//		treasurej = 3;
//		startExploring();
	}
	
	private static void makeInsides(String[][] field){
		for(int row = 1; row < field.length-1; row++){
			for( int col = 4; col < field[0].length; col += 4 ){
				if(row % 4 == 0){
					for( int mod = 1; mod < field[0].length; mod++){
						if(mod % 4 == 0){
							field[row][mod] = "|";
						}
					}
				}
				field[row][col] = "|";
			}
		}
	}

	private static void makeBorder(String[][] field) {
		for(int row = 0; row < field.length; row += (field.length-1)){
			for( int col = 0; col < field[0].length; col++){
				field[row][col] = "_";
			}
		}
		for(int row = 1; row < field.length; row++){
			for( int col = 0; col < field[0].length; col += (field[0].length-1) ){
				field[row][col] = "|";
			}
		}
	}
	

	private static void startExploring(){
		while(true){
			PrintPic(pic);
			System.out.println("you are in room "+
					arr2D[starti][startj]+".");
			if(starti == treasurei && startj == treasurej){
				break;
			}
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
		System.out.println("You have won!!!");
	}
			
	
private static int[] interpretInput(String input) {
		//verify input is valid
		while(!isValid(input)){
			System.out.println("Sorry, but in this game, you csn only use the w, a, s, d, controls.Tell me what you would like to do.");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w")){
			currenti--;
		}
		if(input.equals("s")){
			currenti++;
		}
		if(input.equals("a")){
			currentj--;
		}
		if(input.equals("d")){
			currentj++;
		}
		int[] newCoordinates = {starti, startj};
		if(currenti >= 0 && currenti < arr2D.length &&
				currentj >= 0 && currentj < arr2D[0].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}else{
			System.out.println("Sorry but you have reached the end.You may go no further");
		}
		return newCoordinates;
	}

private static boolean isValid(String input) {
	String[] validKeys = {"w","a","s","d"};
	for(String key: validKeys){
		if(input.toLowerCase().equals(key)){
			return true;
		}
	}
	return false;
}
//	private static void makeBorder(String[][] field) {
//		for(int row = 0; row < field.length; row += (field.length-1)){
//			for( int col = 0; col < field[0].length; col++){
//				field[row][col] = "_";
//			}
//		}
//		for(int row = 1; row < field.length; row++){
//			for( int col = 0; col < field[0].length; col += (field[0].length-1) ){
//				field[row][col] = "|";
//			}
//		}
//	}
//	
//	private static void makeInsides(String[][] field){
//		for(int row = 1; row < field.length-1; row++){
//			for(int col = 0; col < field[0].length; col += (field[0].length-1) ){
//				if((row % 4 == 0)){
//					field[row][col] = "_"
//				}
//			}
//		}
//	}
	

//		private static String[][] createField(boolean[][] mines) {
//		String[][] field = 
//				new String[mines.length][mines[0].length];
//			for(int row = 0; row < field.length; row++){
//				for(int col = 0; col< field[row].length; col++){
//					if(mines[row][col])field[row][col] = "x";
//					else{
//						field[row][col] = countNearby(mines,row,col);
//					}
//				}
//			}	        
//		return field;
//		}
//
//
//		private static String countNearby(boolean[][] mines, int row, int col) {
////			METHOD 1				
////			for(int r = row -1; r <= row + 1; r++){
////				for(int c = col - 1; c <= col+1; c++){
////					if(r >= 0 && r < mines.length &&
////							c >= 0 && c < mines[0].length){
////						
////					}
////				}
////			}
//			//method 2
//			//THIS METHOD ONLY CONSIDERS ACTUAL ELEMENTS
////			int count = 0;
////			for(int r = 0; r < mines.length;r++){
////				for(int c = 0; c < mines[r].length;c++){
////					if(Math.abs(r-row)+Math.abs(c-col) == 1 &&
////							mines[r][c]){
////						count++;
////					}
////				}
////			}
////			return ""+count;
//			//METHOD 3
//			//this method allows you to be specific 
//			//for example, you only want North and East
//			int count = 0;
//			count += isValidAndTrue(mines,row-1,col);
//			count += isValidAndTrue(mines,row+1,col);
//			count += isValidAndTrue(mines,row,col-1);
//			count += isValidAndTrue(mines,row,col+1);
//			return ""+count;
//		}	
//
//
//		private static int isValidAndTrue(boolean[][] mines, int i, int j) {
//			if(i >= 0 && 
//					i < mines.length && 
//					j >= 0 && 
//					j < mines[0].length &&
//					mines[i][j]){
//				return 1;
//			}
//			return 0;
//		}
//
//
//		private static void plantMines(boolean[][] mines) {
//		int numberOfMines = 10;
//		while (numberOfMines > 0){
//			int row  = (int)(Math.random() * mines.length);
//			int col = (int)(Math.random() * mines[0].length);
//			//this prevents the same mine from being selected 
//			//twice
////			while(mines[row][col]){
////				row = (int)(Math.random() * mines.length);
////				col = (int)(Math.random() * mines[0].length);
////			}
//			
//			 	if(!mines[row][col]){
//			 		mines[row][col]=true;
//			 		numberOfMines--;
//			 	}
//			}
//		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/**String[][] pic = new String[10][12];
		for(int row = 0; row < pic.length; row++){
			//populate with coordinates
			for(int col = 0; col< pic[row].length;col++){
				pic[row][col] = " ";
			}
		
	
		background
		for(int row = 0; row < pic.length; row+=(pic.length - 1)){
			for(int col = 0; col < pic[0].length; col++){
				pic[row][col] = "_";
			}
		}
		for(int row = 1; row < pic.length-1; row++){
			for(int col = 0; col < pic[0].length; col+=(pic[0].length -1)){
				pic[row][col] = "|";
			}
		}
		
		//sun
		pic[0][3] = "|";
		pic[1][3] = "0";
		pic[2][3] = "|";		
		pic[1][2] = "-";
		pic[1][4] = "-";
								
				
		//grassy field
		for(int row = 5; row < pic.length;row++){
			for(int col = 0; col < pic[0].length;col++){
				pic[row][col] = "w";
			}
		}
		//top row and bottom row should be "_"
		for(int col = 0; col < pic[0].length;col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		
		//first and last column is "|"
		for(int row = 0; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length - 1] ="|";
		}*/
		
		public static void PrintPic(String[][] pic){
			for(String[] row : pic){
				for(String col: row){
					System.out.print(col);
				}
				System.out.println();
			}
		}	
	
	
	//public static void intro(){
	//String[] xox = {"x","o","x","o","x"};
	//System.out.println(Arrays.toString(xox));
	//a 1D array prints a horizontal String
	
	//String[][] arr2D = new String[4][4];
	//System.out.println("The height is "+arr2D.length);
	//System.out.println("The width is "+arr2D[0].length);
		//for(int row = 0; row < arr2D.length; row++){
			//put an entire array into each row
			//String[] rowContent = 
			//		new String[arr2D[0].length];
			//populate with coordinates
			//for(int col = 0; col < arr2D[row].length; col++){
			//	arr2D[row][col] = ("("+row+", "+col+")");
			//}
		//}
	//print the 2D array
	//every element in a 2D array IS itself an array
	//so a for-each loop looks like this
//	for(String[] row: arr2D){
	//	System.out.println(Arrays.toString(row));
		//}
	//}
}	


