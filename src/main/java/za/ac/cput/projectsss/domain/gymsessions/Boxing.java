package za.ac.cput.projectsss.domain.gymsessions;

public class Boxing {

    private int boxWeight;
    private int boxBmi;
    private int boxHeight;

    public Boxing(){

    }



    public Boxing(int boxWeight, int boxBmi, int boxHeight) {
        this.boxWeight = boxWeight;
        this.boxBmi = boxBmi;
        this.boxHeight = boxHeight;
    }

    public int getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    public int getBoxBmi() {
        return boxBmi;
    }

    public void setBoxBmi(int boxBmi) {
        this.boxBmi = boxBmi;
    }

    public int getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(int boxHeight) {
        this.boxHeight = boxHeight;
    }

    @Override
    public String toString() {
        return "Boxing{" +
                "boxWeight=" + boxWeight +
                ", boxBmi=" + boxBmi +
                ", boxHeight=" + boxHeight +
                '}';
    }
}
