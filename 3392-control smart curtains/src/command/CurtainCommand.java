package command;

import entity.Curtain;

public class CurtainCommand extends Command {
	// Add required properties and create Constructor.
	private Curtain curtain;

    public CurtainCommand(Curtain curtain) {
        // --- write your code here ---
    	this.curtain = curtain;
    }

    @Override
    public void execute(String cmd) {
        // --- write your code here ---
        if (cmd.equalsIgnoreCase("open")) {
        	curtain.open();
        } else if (cmd.equalsIgnoreCase("close")) {
        	curtain.close();
        }
    }
}