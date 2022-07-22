package com.bl.autowired;

public class Heart {

	private String name;
	private int noOfHeart;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump() {

		System.out.println("Heart is pumping");

	}

}
