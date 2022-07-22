package com.bl.autowired;

public class Human {
	
	private Heart heart;
	
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public void startPumping() {
		
		if(heart != null) {
		heart.pump();
		}
		else {
			System.out.println("Heart is not pumping");
		}
	}
	

}
