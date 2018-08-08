package controller;

import model.STATE;

public class TelevisionController {

	
	/**
	 * @variable: status: state of the T.V.
	 * @variable: instanciate: to know if the object was created one time. 
	 */
	private static STATE status;
	private static boolean instanciate = false;
	private static TelevisionController tc;
	
	private TelevisionController() {
		if(!instanciate) {
			tc = this;
		}
	}
	
	/**
	 * @author aribo
	 * @return STATE: the status of the T.V
	 */
	public STATE getStatus() {
		return status;
	}
	
	/**
	 * @author aribo
	 * This class implement the design pattern singleton
	 * @return
	 */
	public static TelevisionController getInstance() {
		if(!instanciate)new TelevisionController();
		return tc;
	}
	
	public void turnOn() {
		status = STATE.ON;
	}
	
	public void turnOff() {
		status = STATE.OFF;
	}
	
	
	
}
