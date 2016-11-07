package caveExplorer;


public class InventoryNockles {
	
	private boolean hasMap;
	private String map;

	public InventoryNockles() {
		hasMap = true;
		updateMap();
	}


	private void updateMap() {
		CaveRoom[][] caves = CaveExplorer.caves;
		//create the top side
		map = " ";
		//horizontal line across top row
		//excpet last column
		//with 4
		for(int i = 0; i < caves[0].length-1;i++){
			map+="____";
		}
		map+="___\n";
		//each room
		for(CaveRoom[] row: caves){
			//there are three rows of text
			for(int textRow = 0; textRow<3;textRow++){
				//the text is for each room
				for(CaveRoom cr : row){
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow == 1 && 
							cr.getDoor(CaveRoom.WEST)!= null){
						str = "  "+contents+" ";
					}
					else if (textRow == 2){
						if(cr.getDoor(CaveRoom.SOUTH) == null){
							str = "|___";
						}else{
							str = "|_ _";
						}
					}
					map+=str;
				}//end of row of caverooms
				map+="\n";
			}
		}
	}


	public String getDescription() {
		if(hasMap)return map;
		else return "You have no inventory.";
	}



}
