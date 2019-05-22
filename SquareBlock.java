import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

import java.awt.KeyboardFocusManager;
import java.awt.Color;
import java.util.ArrayList;
/**
 * Write a description of class SquareBlock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareBlock extends Actor
{
    private ArrayList<Location> sq = new ArrayList<Location>();
    Grid<Actor> gr = getGrid();
    public SquareBlock(Location loc)
    {
        super();
        TetrisBlock p1 = new TetrisBlock();
        p1.putSelfInGrid(gr, loc);
        sq.add(0, loc);
        Location right = new Location(loc.getRow()+1, loc.getCol());
        p1.putSelfInGrid(gr,right);
        sq.add(0, right);
        Location left = new Location(loc.getRow(), loc.getCol()+1);
        sq.add(0, left);
        Location diag = new Location(loc.getRow()+1, loc.getCol()+1);
        sq.add(0, diag);
    }
    
}
