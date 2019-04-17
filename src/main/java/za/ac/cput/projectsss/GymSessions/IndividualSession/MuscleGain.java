package za.ac.cput.projectsss.GymSessions.IndividualSession;

public class MuscleGain {

    private int muscleGainWeight;
    private int muscleGainBmi;
    private int muscleGainHeight;

    public MuscleGain(){

    }

    public MuscleGain(int muscleGainWeight, int muscleGainBmi, int muscleGainHeight) {
        this.muscleGainWeight = muscleGainWeight;
        this.muscleGainBmi = muscleGainBmi;
        this.muscleGainHeight = muscleGainHeight;
    }

    public int getMuscleGainWeight() {
        return muscleGainWeight;
    }

    public void setMuscleGainWeight(int muscleGainWeight) {
        this.muscleGainWeight = muscleGainWeight;
    }

    public int getMuscleGainBmi() {
        return muscleGainBmi;
    }

    public void setMuscleGainBmi(int muscleGainBmi) {
        this.muscleGainBmi = muscleGainBmi;
    }

    public int getMuscleGainHeight() {
        return muscleGainHeight;
    }

    public void setMuscleGainHeight(int muscleGainHeight) {
        this.muscleGainHeight = muscleGainHeight;
    }

    @Override
    public String toString() {
        return "MuscleGain{" +
                "muscleGainWeight=" + muscleGainWeight +
                ", muscleGainBmi=" + muscleGainBmi +
                ", muscleGainHeight=" + muscleGainHeight +
                '}';
    }
}
