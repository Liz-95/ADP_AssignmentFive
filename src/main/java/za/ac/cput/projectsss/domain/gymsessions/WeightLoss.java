package za.ac.cput.projectsss.domain.gymsessions;

public class WeightLoss {

    private int weight1;
    private int weightBmi;
    private int weightHeight;

    public WeightLoss(){

    }

    public WeightLoss(int weight1, int weightBmi, int weightHeight) {
        this.weight1 = weight1;
        this.weightBmi = weightBmi;
        this.weightHeight = weightHeight;
    }

    public int getWeight1() {
        return weight1;
    }

    public void setWeight1(int weight1) {
        this.weight1 = weight1;
    }

    public int getWeightBmi() {
        return weightBmi;
    }

    public void setWeightBmi(int weightBmi) {
        this.weightBmi = weightBmi;
    }

    public int getWeightHeight() {
        return weightHeight;
    }

    public void setWeightHeight(int weightHeight) {
        this.weightHeight = weightHeight;
    }

    @Override
    public String toString() {
        return "WeightLoss{" +
                "weight1=" + weight1 +
                ", weightBmi=" + weightBmi +
                ", weightHeight=" + weightHeight +
                '}';
    }
}
