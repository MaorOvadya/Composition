public class Structure {

    private boolean ceiling;
    private String wallColor;
    private String wallDirection1;
    private String wallDirection2;
    private String wallDirection3;
    private String wallDirection4;

    // Default paramiters for wall and color
    public Structure(){
        this.wallColor = "White";
        this.ceiling =  true;
        this.wallDirection1 = "North";
        this.wallDirection2 = "West";
        this.wallDirection3 = "East";
        this.wallDirection4 = "South";
    }

    public Structure(boolean ceiling, String wallColor, String wallDirection1, String wallDirection2,String wallDirection3, String wallDirection4) {
        this.ceiling = ceiling;
        this.wallColor = wallColor;
        this.wallDirection1 = wallDirection1;
        this.wallDirection2 = wallDirection2;
        this.wallDirection3 = wallDirection3;
        this.wallDirection4 = wallDirection4;
    }

    public boolean isCeiling() {
        return ceiling;
    }

    public String getWallColor() {
        return wallColor;
    }

    public String getWallDirection1() {
        return wallDirection1;
    }

    public String getWallDirection2() {
        return wallDirection2;
    }

    public String getWallDirection3() {
        return wallDirection3;
    }

    public String getWallDirection4() {
        return wallDirection4;
    }

    @Override
    public String toString() {
        return "Room Structure details: " + 
        "\nWall Color : " + wallColor + 
        ", Ceiling: " + ceiling + 
        ", WallDirection 1: " + wallDirection1 + 
        ", WallDirection 2: " + wallDirection2 + 
        ", WallDirection 3: " + wallDirection3 + 
        ", WallDirection 4: " + wallDirection4 
        ;
    }

}
