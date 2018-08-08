package execution;

import model.Television;

public class App {


	
	public static void main(String[] args) {

		Television television = Television.getInstance();
		television.on();
		television.getStatus();
		television.off();
		television.getStatus();
		
	}

}
