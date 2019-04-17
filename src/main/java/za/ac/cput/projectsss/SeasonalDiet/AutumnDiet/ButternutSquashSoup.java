package za.ac.cput.projectsss.SeasonalDiet.AutumnDiet;

public class ButternutSquashSoup {

    private String butternutIngredients;
    private String butternutMinerals;

    public ButternutSquashSoup(){

    }

    public ButternutSquashSoup(String butternutIngredients, String butternutMinerals) {
        this.butternutIngredients = butternutIngredients;
        this.butternutMinerals = butternutMinerals;
    }

    public String getButternutIngredients() {
        return butternutIngredients;
    }

    public void setButternutIngredients(String butternutIngredients) {
        this.butternutIngredients = butternutIngredients;
    }

    public String getButternutMinerals() {
        return butternutMinerals;
    }

    public void setButternutMinerals(String butternutMinerals) {
        this.butternutMinerals = butternutMinerals;
    }

    @Override
    public String toString() {
        return "ButternutSquashSoup{" +
                "butternutIngredients='" + butternutIngredients + '\'' +
                ", butternutMinerals='" + butternutMinerals + '\'' +
                '}';
    }
}
