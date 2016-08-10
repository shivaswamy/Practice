package Rus;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by brougr04 on 30/12/2015.
 */
public class IslandFinderTest {

    @Test
    public void zeroIsland() {
        int[][] island = {{0,0},
                          {0,0}};

        IslandFinder islandFinder = new IslandFinder(island);
        Set<Island> actualIslands = islandFinder.find();
        Set<Island> expectedIslands = new HashSet<Island>();

        assertEquals(expectedIslands, actualIslands);
        assertEquals(0, islandFinder.numberOfIslands());
    }

    @Test
    public void basicIsland() {
       int [][] island = {{0,1,0},
                          {1,1,1},
                          {0,1,0}};

        IslandFinder islandFinder = new IslandFinder(island);
        Set<Island> actualIslands = islandFinder.find();
        Set<Island> expectedIslands = new HashSet<Island>();
        expectedIslands.add(new Island(new Cell(1, 0), new Cell(0,1), new Cell(1, 1), new Cell(2,1), new Cell(1,2)));

        assertEquals(expectedIslands, actualIslands);
        assertEquals(1, islandFinder.numberOfIslands());
    }

    @Test
    public void otherIslandTest() {
        int [][] island = {{0,1,0},
                           {1,0,1},
                           {0,0,1}};

        IslandFinder islandFinder = new IslandFinder(island);
        Set<Island> actualIslands = islandFinder.find();
        Set<Island> expectedIslands = new HashSet<Island>();
        expectedIslands.add(new Island(new Cell(1,0)));
        expectedIslands.add(new Island(new Cell(0,1)));
        expectedIslands.add(new Island(new Cell(2,1), new Cell(2,2)));

        assertEquals(expectedIslands, actualIslands);
        assertEquals(3, islandFinder.numberOfIslands());
    }

    @Test
    public void anotherIslandTest() {
        int [][] island = {{0,1,1},
                           {1,0,1},
                           {0,0,1}};

        IslandFinder islandFinder = new IslandFinder(island);
        Set<Island> actualIslands = islandFinder.find();
        Set<Island> expectedIslands = new HashSet<Island>();
        //expectedIslands.add(new Island(new Cell(1,0)));
        expectedIslands.add(new Island(new Cell(0,1)));
        expectedIslands.add(new Island(new Cell(2,0), new Cell(1,0), new Cell(2,1), new Cell(2,2)));

        assertEquals(expectedIslands, actualIslands);
        assertEquals(2, islandFinder.numberOfIslands());
    }

    @Test
    public void lastTest() {
        int [][] island = {{1,1,0,1,1},
                           {0,0,1,0,0},
                           {0,0,1,1,1}};

        IslandFinder islandFinder = new IslandFinder(island);
        Set<Island> actualIslands = islandFinder.find();
        Set<Island> expectedIslands = new HashSet<Island>();
        expectedIslands.add(new Island(new Cell(0,0), new Cell(1,0)));
        expectedIslands.add(new Island(new Cell(3,0), new Cell(4,0)));
        expectedIslands.add(new Island(new Cell(2,1), new Cell(2,2), new Cell(3,2),new Cell(4,2)));

        assertEquals(expectedIslands, actualIslands);
        assertEquals(3, islandFinder.numberOfIslands());
    }
}
