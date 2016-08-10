package Rus;

import java.util.HashSet;
import java.util.Set;

public class IslandFinder {
    private final int[][] rawIsland;
    private final Set<Island> islands;

    public IslandFinder(int[][] rawIsland) {
        this.rawIsland = rawIsland;
        this.islands = new HashSet<Island>();
        createIslands();
    }

    private void createIslands() {
        for(int y = 0; y< rawIsland.length; y++)
            for(int x = 0; x < rawIsland[y].length; x++) {
                if (rawIsland[y][x] == 1) { // Only care about land
                    Cell cellToAdd = new Cell(x, y);
                    Island islandAddedTo = addCellToExistingIslandOrCreateNewOne(cellToAdd);
                    consolidateIslands(islandAddedTo);
                }
            }
    }

    private void consolidateIslands(Island islandAddedTo) {
        Set<Island> islandsToRemove = new HashSet<Island>();
        for(Island island : islands) {
            if (!island.equals(islandAddedTo)) {
                if (islandAddedTo.borders(island)) {
                    islandAddedTo.combine(island);
                    islandsToRemove.add(island);
                }
            }
        }

        this.islands.removeAll(islandsToRemove); //Can't remove in for loop or we knacker the iterator.
    }

    private Island addCellToExistingIslandOrCreateNewOne(Cell cellToAdd) {
        for(Island island : islands) {
            if (island.isCellAdjacent(cellToAdd)) {
                island.addCell(cellToAdd);
                return island;
            }
        }

        //No match so create a new island
        Island newIsland = new Island(cellToAdd);
        islands.add(newIsland);
        return newIsland;
    }

    public Set<Island> find() {
        return islands;
    }

    public int numberOfIslands() {
        return islands.size();
    }
}
