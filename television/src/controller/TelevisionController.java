package controller;

import model.STATE;

public class TelevisionController {

	private static STATE status;
	private static boolean instanciation = false;
	private static TelevisionController tc;
	
	private TelevisionController() {
		if(!instanciation) {
			tc = this;
		}
		
	}
	
	public STATE getStatus() {
		return status;
	}
	
	public static TelevisionController getInstance() {
		if(!instanciation)new TelevisionController();
		return tc;
	}
	
	public void turnOn() {
		status = STATE.ON;
	}
	
	public void turnOff() {
		status = STATE.OFF;
	}
	
	
	
}
