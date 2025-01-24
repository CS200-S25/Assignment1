
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    private String name;
    private String description;
    private boolean locked;
    private Room n, e, s, w;

    public Room (String name, String description, boolean locked) {
        this.name = name;
        this.description = description;
        this.locked = locked;
    }
    
    public void setNeighbors(Room n, Room e, Room w, Room s){
        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
    }
    
    public Room getN() {
        return n;
    }
    
    public Room getE() {
        return e;
    }
    
    public Room getS() {
        return s;
    }
    
    public Room getW() {
        return w;
    }
    
    // TODO: override the toString() to display the name and description of the room
}
