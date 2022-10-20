public class App {

    public static void main(String[] args) throws Exception {


        Wall wall = new Wall("North", "South", "East", "West");
        BedRoom bedroom = new BedRoom(wall);

        System.out.println(bedroom);

    }
}