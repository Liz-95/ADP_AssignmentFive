package za.ac.cput.projectsss.SeasonalDiet.AutumnDiet;

public class ChestnutSalad {
    private String chestnutIngredients;
    private String chestnutCalories;

    public ChestnutSalad(){

    }

    public ChestnutSalad(String chestnutIngredients, String chestnutCalories) {
        this.chestnutIngredients = chestnutIngredients;
        this.chestnutCalories = chestnutCalories;
    }

    public String getChestnutIngredients() {
        return chestnutIngredients;
    }

    public void setChestnutIngredients(String chestnutIngredients) {
        this.chestnutIngredients = chestnutIngredients;
    }

    public String getChestnutCalories() {
        return chestnutCalories;
    }

    public void setChestnutCalories(String chestnutCalories) {
        this.chestnutCalories = chestnutCalories;
    }

    @Override
    public String toString() {
        return "ChestnutSalad{" +
                "chestnutIngredients='" + chestnutIngredients + '\'' +
                ", chestnutCalories='" + chestnutCalories + '\'' +
                '}';
    }
}
