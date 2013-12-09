import stanford.karel.SuperKarel;

public class defendDemocracyKarel extends SuperKarel {

		public void run(){
			move();
			for(int i=0; i<4; i++){
			cleanCard();
			positionToClear();
			}
			cleanCard();
			move();
		}
		
		private void cleanCard(){
			if(beepersPresent()){
				pickBeeper();
				putBeeper();
				
			}else{
				
				turnRight();
				move();
				turnAround();
					for(int i=0; i<=3; i++){
						if(beepersPresent()){
							pickBeeper();
						}else{
							if(frontIsClear()){
							move();
							}
						}
					}
					turnAround();
					if(beepersPresent()){
						pickBeeper();
					}
					move();
					turnLeft();
				}
		}
			
		private void positionToClear(){
			for(int i=0; i<2;i++){
				move();
			}
		}
			
		
			
		
	}
