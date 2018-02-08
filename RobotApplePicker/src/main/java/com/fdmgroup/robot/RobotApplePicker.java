package com.fdmgroup.robot;

public class RobotApplePicker {

	private int numApplesPicked;

	public void PickApples(int applesPicked) {
		this.numApplesPicked += applesPicked;
		
	}
	
	public int getNumApplesPicked(){
		return this.numApplesPicked;
	}

	public void setNumPickApples(int applesPicked) {
		this.numApplesPicked = applesPicked;
	}

}
