package pr1.main;

import java.awt.Color;
import java.awt.Graphics2D;

public class HUDManager {
	
	private Player player;
	
	public HUDManager(Player player) {
		this.player = player;
	}

	public void render(Graphics2D g){
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Main.width, Main.height / 6);
		g.fillRect(0, 850, Main.width, Main.height / 2);
		g.setColor(Color.WHITE);
		
		g.clipRect(0, 0, Main.width, Main.height);
		
		g.drawString(player.getFPS()+"", 200, 200);
		
	}
}
