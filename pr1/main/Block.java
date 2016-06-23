package pr1.main;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Block extends Rectangle{
	
	Vector2F pos = new Vector2F();
	private int blockSize = 48;
	private BlockType blocktype;
	private BufferedImage block;
	
	private boolean isSolid;
	private boolean isOneScreen;
	

	public Block(Vector2F pos, BlockType blocktype) {
		this.pos = pos;
		setOneScreen(true);
		this.blocktype = blocktype;
		init();
	}

	
	public void init() {
		switch (blocktype) {
		case STONE_1:
			block = Assets.getStone_1();
			break;
		case WALL_1:
			block = Assets.getWall_1();
			break;
		case WALL_TOP_1:
			block = Assets.getWall_top_1();
			break;

		}
	}
	
	public void tick(double deltaTime){
		if (isOneScreen()){
			setBounds((int)pos.xPos, (int)pos.yPos, blockSize, blockSize);
		}
	}
	
	public void render(Graphics2D g){
		if(isOneScreen()){
			g.drawImage(block, (int)pos.getWorldLocation().xPos, (int)pos.getWorldLocation().yPos, blockSize, blockSize, null);
			if(isSolid){
				//g.drawRect((int)pos.getWorldLocation().xPos, (int)pos.getWorldLocation().yPos, blockSize, blockSize);
			}
		}
	}
	
	public enum BlockType{
		STONE_1,
		WALL_1,
		WALL_TOP_1
	}

	public Block isSolid(boolean isSolid) {
		this.isSolid = isSolid;
		return this;
	}


	public boolean isSolid() {
		return isSolid;
	}

	public boolean isOneScreen() {
		return isOneScreen;
	}


	public void setOneScreen(boolean isOneScreen) {
		this.isOneScreen = isOneScreen;
	}
	

}










