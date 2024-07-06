package model;

import java.awt.Graphics2D;

public class PlayerAdapter implements Action {
	Player player;

	public PlayerAdapter(Player newPlayer) {
		player = newPlayer;
	}

	public void run(String Direction) {
		player.update(Direction);
	}

	@Override
	public void pickUpItems() {
		// TODO Auto-generated method stub
		player.pickUpObj();
	}

	@Override
	public int pickUpKey() {
		// TODO Auto-generated method stub
		return player.hasKey;
	}
}
