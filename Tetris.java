
/**
 * Write a description of class Gridworld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
public class Tetris
{
    public static ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(19,19));
    public static TetrisBlock TetrisBlock = new TetrisBlock();
    public static void main(String[] args) {
        world.add(new Location(1,1),TetrisBlock);
        //set up world
        
        //nextTetrisBlock();
        //needed code for keyboard event handling
        java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
        .addKeyEventDispatcher(new java.awt.KeyEventDispatcher() {
                public boolean dispatchKeyEvent(java.awt.event.KeyEvent event) {
                    String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
                    if (key.equals("pressed UP"))
                        TetrisBlock.rotate();
                    if (key.equals("pressed RIGHT"))
                        TetrisBlock.moveRight();
                    if (key.equals("pressed DOWN"))
                        TetrisBlock.act();
                    if (key.equals("pressed LEFT"))
                        TetrisBlock.moveLeft();
                    world.show();
                    return true;
                }
            });
        world.show();
    }
}