package za.ac.cput.projectsss.GymSessions.GroupSession;

public class Boxing {

    private int boxingWeight;
    private int boxingBmi;
    private int boxingHeight;

    public Boxing(){

    }

    public Boxing(int boxingWeight, int boxingBmi, int boxingHeight) {
        this.boxingWeight = boxingWeight;
        this.boxingBmi = boxingBmi;
        this.boxingHeight = boxingHeight;
    }

    public int getBoxingWeight() {
        return boxingWeight;
    }

    public void setBoxingWeight(int boxingWeight) {
        this.boxingWeight = boxingWeight;
    }

    public int getBoxingBmi() {
        return boxingBmi;
    }

    public void setBoxingBmi(int boxingBmi) {
        this.boxingBmi = boxingBmi;
    }

    public int getBoxingHeight() {
        return boxingHeight;
    }

    public void setBoxingHeight(int boxingHeight) {
        this.boxingHeight = boxingHeight;
    }

    @Override
    public String toString() {
        return "Boxing{" +
                "boxingWeight=" + boxingWeight +
                ", boxingBmi=" + boxingBmi +
                ", boxingHeight=" + boxingHeight +
                '}';
    }
}
