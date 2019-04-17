package za.ac.cput.projectsss.GymSessions.IndividualSession;

public class WeightLoss {

    private int weightLoss1;
    private int weightLossBmi;
    private int weightLossHeight;

    public WeightLoss(){

    }

    public WeightLoss(int weightLoss1, int weightLossBmi, int weightLossHeight) {
        this.weightLoss1 = weightLoss1;
        this.weightLossBmi = weightLossBmi;
        this.weightLossHeight = weightLossHeight;
    }

    public int getWeightLoss1() {
        return weightLoss1;
    }

    public void setWeightLoss1(int weightLoss1) {
        this.weightLoss1 = weightLoss1;
    }

    public int getWeightLossBmi() {
        return weightLossBmi;
    }

    public void setWeightLossBmi(int weightLossBmi) {
        this.weightLossBmi = weightLossBmi;
    }

    public int getWeightLossHeight() {
        return weightLossHeight;
    }

    public void setWeightLossHeight(int weightLossHeight) {
        this.weightLossHeight = weightLossHeight;
    }

    @Override
    public String toString() {
        return "WeightLoss{" +
                "weightLoss1=" + weightLoss1 +
                ", weightLossBmi=" + weightLossBmi +
                ", weightLossHeight=" + weightLossHeight +
                '}';
    }
}
