package Rus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by brougr04 on 30/12/2015.
 */
public class Island {
    private final Set<Cell> parts;
    private final Set<Cell> adjacentCells;

    public Island(Cell...cells) {
        this.parts = new HashSet<Cell>();
        this.adjacentCells = new HashSet<Cell>();

        for(Cell cell : cells) {
            addCell(cell);
        }
    }

    public void addCell(Cell cellToAdd) {
        this.parts.add(cellToAdd);
        this.adjacentCells.remove(cellToAdd);

        for(Cell potentiallyAdjacentFreeCell: cellToAdd.getAdjacentCells()) {
            if (!parts.contains(potentiallyAdjacentFreeCell)) {
                adjacentCells.add(potentiallyAdjacentFreeCell); //Don't care about duplicates as it's a set.
            }
        }
    }

    public boolean isCellAdjacent(Cell cell) {
        return adjacentCells.contains(cell);
    }

    public boolean borders(Island other) {
        Set<Cell> adjacentCells = new HashSet(this.adjacentCells);

        adjacentCells.removeAll(other.parts);
        return adjacentCells.size() < this.adjacentCells.size();
    }

    public void combine(Island other) {
        this.parts.addAll(other.parts);
        this.adjacentCells.addAll(other.adjacentCells);
        this.adjacentCells.removeAll(this.parts); //Maybe not needed.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Island island = (Island) o;

        return !(parts != null ? !parts.equals(island.parts) : island.parts != null);

    }

    @Override
    public int hashCode() {
        return parts != null ? parts.hashCode() : 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.parts.toArray());
    }
}
