package za.ac.cput.projectsss.SeasonalDiet.SummerDiet;

public class LemonadeBars {

    private String barsIngredients;
    private String barsCalories;

    public LemonadeBars(){

    }

    public LemonadeBars(String barsIngredients, String barsCalories) {
        this.barsIngredients = barsIngredients;
        this.barsCalories = barsCalories;
    }

    public String getBarsIngredients() {
        return barsIngredients;
    }

    public void setBarsIngredients(String barsIngredients) {
        this.barsIngredients = barsIngredients;
    }

    public String getBarsCalories() {
        return barsCalories;
    }

    public void setBarsCalories(String barsCalories) {
        this.barsCalories = barsCalories;
    }

    @Override
    public String toString() {
        return "LemonadeBars{" +
                "barsIngredients='" + barsIngredients + '\'' +
                ", barsCalories='" + barsCalories + '\'' +
                '}';
    }
}
