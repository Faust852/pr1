package pr1.main;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class TileManager {
	
	public static ArrayList<Block> blocks= new ArrayList<>();

	public TileManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void tick(double deltaTime){
		for(Block block : blocks) {
			block.tick(deltaTime);
			
			if(Player.render.intersects(block)){
				block.setOneScreen(true);
			}else {
				block.setOneScreen(false);
			}

		}
	}
	
	public void render(Graphics2D g){
		for(Block block : blocks) {
			block.render(g);
		}
	}
}
