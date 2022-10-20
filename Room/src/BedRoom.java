public class BedRoom {

    private Wall wall;


    public BedRoom(Wall wall) {
        this.wall = wall;
 
    }

    @Override
    public String toString() {
        return "BedRoom Details: " + wall;
    }


}
