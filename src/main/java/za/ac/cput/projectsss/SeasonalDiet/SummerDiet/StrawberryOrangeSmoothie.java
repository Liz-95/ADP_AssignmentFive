package za.ac.cput.projectsss.SeasonalDiet.SummerDiet;

public class StrawberryOrangeSmoothie {

    private String smoothieIngredients;
    private String smoothieMinerals;

    public StrawberryOrangeSmoothie(){

    }

    public StrawberryOrangeSmoothie(String smoothieIngredients, String smoothieMinerals) {
        this.smoothieIngredients = smoothieIngredients;
        this.smoothieMinerals = smoothieMinerals;
    }

    public String getSmoothieIngredients() {
        return smoothieIngredients;
    }

    public void setSmoothieIngredients(String smoothieIngredients) {
        this.smoothieIngredients = smoothieIngredients;
    }

    public String getSmoothieMinerals() {
        return smoothieMinerals;
    }

    public void setSmoothieMinerals(String smoothieMinerals) {
        this.smoothieMinerals = smoothieMinerals;
    }

    @Override
    public String toString() {
        return "StrawberryOrangeSmoothie{" +
                "smoothieIngredients='" + smoothieIngredients + '\'' +
                ", smoothieMinerals='" + smoothieMinerals + '\'' +
                '}';
    }
}
