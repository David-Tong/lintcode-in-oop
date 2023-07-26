package controller;

import command.Command;

public class Remote {

    // Add required properties and create Constructor.
	private Command command;
	
    public Remote(Command command) {
        // --- write your code here ---
    	this.command = command;
    }

    public void action(String act) {
        // --- write your code here ---
    	command.execute(act);
    }

}