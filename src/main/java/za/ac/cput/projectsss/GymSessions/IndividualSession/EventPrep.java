package za.ac.cput.projectsss.GymSessions.IndividualSession;

public class EventPrep {

    private int eventPrepWeight;
    private int eventPrepBmi;
    private int eventPrepHeight;

    public EventPrep(){

    }

    public EventPrep(int eventPrepWeight, int eventPrepBmi, int eventPrepHeight) {
        this.eventPrepWeight = eventPrepWeight;
        this.eventPrepBmi = eventPrepBmi;
        this.eventPrepHeight = eventPrepHeight;
    }

    public int getEventPrepWeight() {
        return eventPrepWeight;
    }

    public void setEventPrepWeight(int eventPrepWeight) {
        this.eventPrepWeight = eventPrepWeight;
    }

    public int getEventPrepBmi() {
        return eventPrepBmi;
    }

    public void setEventPrepBmi(int eventPrepBmi) {
        this.eventPrepBmi = eventPrepBmi;
    }

    public int getEventPrepHeight() {
        return eventPrepHeight;
    }

    public void setEventPrepHeight(int eventPrepHeight) {
        this.eventPrepHeight = eventPrepHeight;
    }

    @Override
    public String toString() {
        return "EventPrep{" +
                "eventPrepWeight=" + eventPrepWeight +
                ", eventPrepBmi=" + eventPrepBmi +
                ", eventPrepHeight=" + eventPrepHeight +
                '}';
    }
}
