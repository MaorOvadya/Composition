public class Wall {

    private String directionWall1;
    private String directionWall2;
    private String directionWall3;
    private String directionWall4;

    public Wall(String directionWall1, String directionWall2, String directionWall3, String directionWall4) {
        this.directionWall1 = directionWall1;
        this.directionWall2 = directionWall2;
        this.directionWall3 = directionWall3;
        this.directionWall4 = directionWall4;
    }

    public String getDirectionWall1() {
        return directionWall1;
    }

    public String getDirectionWall2() {
        return directionWall2;
    }

    public String getDirectionWall3() {
        return directionWall3;
    }

    public String getDirectionWall4() {
        return directionWall4;
    }

    @Override
    public String toString() {
        return "\nWall Details:" +
        ", direction Wall 1 = " + directionWall1 +
        ", directionWall 2 = " + directionWall2 +
        ", directionWall 3 = " + directionWall3 +
        ", directionWall 4 = " + directionWall4;
    }

}
