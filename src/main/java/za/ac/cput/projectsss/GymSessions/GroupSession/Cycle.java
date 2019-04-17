package za.ac.cput.projectsss.GymSessions.GroupSession;

public class Cycle {

    private int cycleWeight;
    private int cycleBmi;
    private int cycleHeight;

    public Cycle(){
    }

    public Cycle(int cycleWeight, int cycleBmi, int cycleHeight) {
        this.cycleWeight = cycleWeight;
        this.cycleBmi = cycleBmi;
        this.cycleHeight = cycleHeight;
    }

    public int getCycleWeight() {
        return cycleWeight;
    }

    public void setCycleWeight(int cycleWeight) {
        this.cycleWeight = cycleWeight;
    }

    public int getCycleBmi() {
        return cycleBmi;
    }

    public void setCycleBmi(int cycleBmi) {
        this.cycleBmi = cycleBmi;
    }

    public int getCycleHeight() {
        return cycleHeight;
    }

    public void setCycleHeight(int cycleHeight) {
        this.cycleHeight = cycleHeight;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "cycleWeight=" + cycleWeight +
                ", cycleBmi=" + cycleBmi +
                ", cycleHeight=" + cycleHeight +
                '}';
    }
}
