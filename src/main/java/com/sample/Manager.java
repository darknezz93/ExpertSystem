package com.sample;

import javax.swing.JFrame;

public class Manager implements ChangePageListener {
	
	JFrame frame;
	
	private void hideFrame(JFrame frame){
		frame.setVisible(false);
	}
	
	private void nextQuestion(){
		hideFrame(frame);
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

}
