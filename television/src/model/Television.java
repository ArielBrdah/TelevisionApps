package model;

import controller.TelevisionController;

/***
 * This class implement the singleton design pattern
 * @author aribo
 *
 */
public class Television {
	
	private TelevisionController televisionCtrl;
	private static Television television;
	private static boolean instanciate = false;
	
	private Television() {
		
		if(!instanciate) {
		television = this;
		instanciate = true;
		televisionCtrl = TelevisionController.getInstance();
		}
	}
	
	public void on() {
		televisionCtrl.turnOn();
	}
	
	public void off() {
		televisionCtrl.turnOff();
	}
	
	public STATE getStatus() {
		return televisionCtrl.getStatus();
	}
	
	public static Television getInstance() {
		
		if(!instanciate) 
			new Television();

		return television;
	}
	
}
