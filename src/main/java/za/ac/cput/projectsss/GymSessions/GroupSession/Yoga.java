package za.ac.cput.projectsss.GymSessions.GroupSession;

public class Yoga {

    private int yogaWeight;
    private int yogaBmi;
    private int yogaHeight;

    public Yoga(){

    }

    public Yoga(int yogaWeight, int yogaBmi, int yogaHeight) {
        this.yogaWeight = yogaWeight;
        this.yogaBmi = yogaBmi;
        this.yogaHeight = yogaHeight;
    }

    public int getYogaWeight() {
        return yogaWeight;
    }

    public void setYogaWeight(int yogaWeight) {
        this.yogaWeight = yogaWeight;
    }

    public int getYogaBmi() {
        return yogaBmi;
    }

    public void setYogaBmi(int yogaBmi) {
        this.yogaBmi = yogaBmi;
    }

    public int getYogaHeight() {
        return yogaHeight;
    }

    public void setYogaHeight(int yogaHeight) {
        this.yogaHeight = yogaHeight;
    }

    @Override
    public String toString() {
        return "Yoga{" +
                "yogaWeight=" + yogaWeight +
                ", yogaBmi=" + yogaBmi +
                ", yogaHeight=" + yogaHeight +
                '}';
    }
}
