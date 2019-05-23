package za.ac.cput.projectsss.domain.gymsessions;

public class MuscleGain {

    private int muscleWeight;
    private int muscleBmi;
    private int muscleHeight;

    public MuscleGain(){

    }

    public MuscleGain(int muscleWeight, int muscleBmi, int muscleHeight) {
        this.muscleWeight = muscleWeight;
        this.muscleBmi = muscleBmi;
        this.muscleHeight = muscleHeight;
    }

    public int getMuscleWeight() {
        return muscleWeight;
    }

    public void setMuscleWeight(int muscleWeight) {
        this.muscleWeight = muscleWeight;
    }

    public int getMuscleBmi() {
        return muscleBmi;
    }

    public void setMuscleBmi(int muscleBmi) {
        this.muscleBmi = muscleBmi;
    }

    public int getMuscleHeight() {
        return muscleHeight;
    }

    public void setMuscleHeight(int muscleHeight) {
        this.muscleHeight = muscleHeight;
    }

    @Override
    public String toString() {
        return "MuscleGain{" +
                "muscleWeight=" + muscleWeight +
                ", muscleBmi=" + muscleBmi +
                ", muscleHeight=" + muscleHeight +
                '}';
    }
}
