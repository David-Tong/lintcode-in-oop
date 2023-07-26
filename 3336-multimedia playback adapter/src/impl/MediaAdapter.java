package impl;

import constants.MediaConstants;
import itf.MediaPlayer;
import itf.adaptee.PlayerAdaptee;

public class MediaAdapter implements MediaPlayer {

    // --- write your code here ---
	private PlayerAdaptee playerAdapter;

    public MediaAdapter(PlayerAdaptee playerAdapter) {
        // Create a constructor with any parameter needed
    	this.playerAdapter = playerAdapter;
    }

    @Override
    public void play() {
        // --- write your code here ---
        playerAdapter.work();
    }
    
}