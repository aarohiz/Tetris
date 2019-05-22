import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

class TetrisBlock extends Actor
{
    public void act()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(180);
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();

        //for (Location n : gr.getOccupiedLocations())
            //actor.add(gr.get(n));
        gr.getNumCols();
        int total = 0;
        
        for (int row = 0; row < gr.getNumRows(); row++)
        {
            for(int col = 0; col < gr.getNumCols(); col++)
            {
                Location pizza = new Location(row, col);
                if (gr.get(pizza) != null)
                    total ++;
            }
                if (total == gr.getNumCols())
                    {
                        for(int con = 0; con < gr.getNumCols(); con++)
                        {
                            Location pasta = new Location (row,con);
                            gr.remove(pasta);
                        }
                        total = 0;
                    }
                }

    }
    // public void rotate()
    // {
        // setDirection(getDirection() + 45);
    // }
    public void moveRight()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(90);
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    public void moveLeft()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(270);
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    public void rotate()
    {}
}
// class TetrisBlock3 extends TetrisBlock
// {

// }
// class TetrisBlock3L extends TetrisBlock
// {

// }
// class TetrisBlock4 extends TetrisBlock
// {

// }
// class TetrisBlock4L extends TetrisBlock
// {

// }    
