package Airport.model;

public class Plane {

    private String name;
    private int releaseDate;
    private int hoursInAir;
    private boolean isMilitary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public void printPlaneInfo() {
        System.out.printf("Name = %s, Release Date = %d, Hours in Air = %d, is Military = %s\n",
                name, releaseDate, hoursInAir, isMilitary ? "yes" : "no");
    }
}
