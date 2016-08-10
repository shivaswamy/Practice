package codegladiator.problem1;

/**
 * Created by swamys01 on 18/04/2016.
 */
public class BallPassingGame {

    private class Player {
        int position;
        int numberOfTimesBallHeld = 0;

        public void setPosition(int position) {
            this.position = position;
        }

        public int getPosition() {
            return position;
        }

        public void setNumberOfTimesBallHeld(int numberOfTimesBallHeld) {
            this.numberOfTimesBallHeld = numberOfTimesBallHeld;
        }

        public int getNumberOfTimesBallHeld() {
            return numberOfTimesBallHeld;
        }
    }

    public static int passCount(int numberOfPlayers, int maxHeld, int numPassPositions)
    {
        //Write code here
        int passCount = -1;
        if((numberOfPlayers >= 3 && numberOfPlayers <= 100)
                && (maxHeld >= 3 && maxHeld <= 1000)
                && (numPassPositions > 0)){
            if(numPassPositions != numberOfPlayers) {
                passCount = (numberOfPlayers * maxHeld) - numberOfPlayers;
            }
        }
        return passCount;
    }

}
