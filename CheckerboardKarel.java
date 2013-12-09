/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		fixRow();
		while(leftIsClear()){
			faceEast();
			fixRow();
				if(rightIsClear()){
					faceWest();
					fixRow();
			}else{
				turnAround();
			}
		}
	}
	
	private void fixRow(){
		while(frontIsClear()){
		if(noBeepersPresent()){
			putBeeper();
			move();
		}
		if(frontIsClear()){
		move();	
			}
		}
	}
	
	private  void faceEast(){
			turnLeft();
			move();
			turnLeft();
			}
	
	private void faceWest() {
		
			turnRight();
			move();
			turnRight();
		}	
}
	
	

