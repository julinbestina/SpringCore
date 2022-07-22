package com.bl.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("heartObject")
	private Heart heart;

	public void startPumping() {

		if (heart != null) {
			
			heart.pump();
			System.out.println("The name is " + heart.getName() + " and no. of Heart is " + heart.getNoOfHeart());
		} else {
			
			System.out.println("Heart is not pumping");
		}
	}

}
