package za.ac.cput.projectsss.GymSessions.GroupSession;

public class Aerobics {

    private int aerobicsWeight;
    private int aerobicsBmi;
    private int aerobicsHeight;


    public Aerobics(){

    }

    public Aerobics(int aerobicsWeight, int aerobicsBmi, int aerobicsHeight) {
        this.aerobicsWeight = aerobicsWeight;
        this.aerobicsBmi = aerobicsBmi;
        this.aerobicsHeight = aerobicsHeight;
    }

    public int getAerobicsWeight() {
        return aerobicsWeight;
    }

    public void setAerobicsWeight(int aerobicsWeight) {
        this.aerobicsWeight = aerobicsWeight;
    }

    public int getAerobicsBmi() {
        return aerobicsBmi;
    }

    public void setAerobicsBmi(int aerobicsBmi) {
        this.aerobicsBmi = aerobicsBmi;
    }

    public int getAerobicsHeight() {
        return aerobicsHeight;
    }

    public void setAerobicsHeight(int aerobicsHeight) {
        this.aerobicsHeight = aerobicsHeight;
    }

    @Override
    public String toString() {
        return "Aerobics{" +
                "aerobicsWeight=" + aerobicsWeight +
                ", aerobicsBmi=" + aerobicsBmi +
                ", aerobicsHeight=" + aerobicsHeight +
                '}';
    }
}
