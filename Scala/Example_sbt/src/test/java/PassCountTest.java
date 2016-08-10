import codegladiator.problem1.BallPassingGame;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by swamys01 on 18/04/2016.
 */
public class PassCountTest {

    @Test
    public void invalidNumberOfPlayersTest() {
        Assert.assertEquals(-1, BallPassingGame.passCount(2, 3, 2));
        Assert.assertEquals(-1, BallPassingGame.passCount(101, 3, 2));
    }

    @Test
    public void invalidMaxHeldTest() {
        Assert.assertEquals(-1, BallPassingGame.passCount(4, 2, 2));
        Assert.assertEquals(-1, BallPassingGame.passCount(4, 1001, 2));
    }

    @Test
    public void validPassPosition() {
        Assert.assertEquals(-1, BallPassingGame.passCount(5, 3, 0));
        //Assert.assertEquals(-1, BallPassingGame.passCount(5, 3, 6));
    }

    @Test
    public void validInput() {
        Assert.assertEquals(0, BallPassingGame.passCount(3, 3, 3));
        //Assert.assertEquals(10, BallPassingGame.passCount(5, 3, 2));
    }
}
