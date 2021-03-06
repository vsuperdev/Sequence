package Sequence;
import java.util.List;

/**
 * @author vihar
 *
 */
public class CheckWinning {

	public static boolean checkForWinner (List<Integer> playerHoldings){
		boolean didPlayerWin = false;
		int holdingNumber = playerHoldings.size();
		int sequenceCount = 0;
		if (holdingNumber>3){

			for (int i=0; i<holdingNumber-1; i++){

				if ((playerHoldings.get(i)+1)==playerHoldings.get(i+1)){//sequence forms add 1 to sequenceCount
					sequenceCount++;
					if (sequenceCount>=10){
						didPlayerWin = true;
						break;
					}//if sequence if more then 4 then player wins
				}//if both are equal do nothing
				else if (playerHoldings.get(i)==playerHoldings.get(i+1)){
					//sequenceCount = sequenceCount; // do nothing if they are same
				}
				else {
					sequenceCount = 0;                       //reset sequenceCount
				}
			}//end i for loop
		}//if to check if there is enough sequence available
		return didPlayerWin;
	}//end checkForWinner
}//end class