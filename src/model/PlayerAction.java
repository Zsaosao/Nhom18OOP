package model;

public class PlayerAction implements Action {
	
	@Override
	public void run(String Direction) {
		System.out.println("left, right, forward, backward");
	}

	@Override
	public void pickUpItems() {
		System.out.println("pick up item");
	}

	@Override
	public int pickUpKey() {
		// TODO Auto-generated method stub
		return pickUpKey();
	}

}
