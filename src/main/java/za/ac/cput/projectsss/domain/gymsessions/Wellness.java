package za.ac.cput.projectsss.domain.gymsessions;

public class Wellness {

    private int wellnessWeight;
    private int wellnessBmi;
    private int wellnessHeight;

    public Wellness(){

    }

    public Wellness(int wellnessWeight, int wellnessBmi, int wellnessHeight) {
        this.wellnessWeight = wellnessWeight;
        this.wellnessBmi = wellnessBmi;
        this.wellnessHeight = wellnessHeight;
    }

    public int getWellnessWeight() {
        return wellnessWeight;
    }

    public void setWellnessWeight(int wellnessWeight) {
        this.wellnessWeight = wellnessWeight;
    }

    public int getWellnessBmi() {
        return wellnessBmi;
    }

    public void setWellnessBmi(int wellnessBmi) {
        this.wellnessBmi = wellnessBmi;
    }

    public int getWellnessHeight() {
        return wellnessHeight;
    }

    public void setWellnessHeight(int wellnessHeight) {
        this.wellnessHeight = wellnessHeight;
    }

    @Override
    public String toString() {
        return "Wellness{" +
                "wellnessWeight=" + wellnessWeight +
                ", wellnessBmi=" + wellnessBmi +
                ", wellnessHeight=" + wellnessHeight +
                '}';
    }
}
