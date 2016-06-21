package com.cooksys.butterpillar.model;

public class Butterpillar implements IButterpillar{
	private double length;
	private double leavesEaten;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLeavesEaten() {
		return leavesEaten;
	}
	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}
	@Override
	public int compareTo(IButterpillar o) {
		if (this.getLength() > o.getLength()) {
			return 1;
		} else if (this.getLength() < o.getLength()) {
			return -1;
		} else if (this.getLeavesEaten() > o.getLeavesEaten()) {
			return 1;
		} else if (this.getLeavesEaten() < o.getLeavesEaten()) {
			return -1;
		} else {
		return 0;
		}
	}
	
}
