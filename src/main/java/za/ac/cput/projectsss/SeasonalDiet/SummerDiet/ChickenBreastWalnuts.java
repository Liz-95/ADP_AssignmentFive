package za.ac.cput.projectsss.SeasonalDiet.SummerDiet;

public class ChickenBreastWalnuts {

    private String walnutsIngredients;
    private String walnutsCalories;

    public ChickenBreastWalnuts(){

    }

    public ChickenBreastWalnuts(String walnutsIngredients, String walnutsCalories) {
        this.walnutsIngredients = walnutsIngredients;
        this.walnutsCalories = walnutsCalories;
    }

    public String getWalnutsIngredients() {
        return walnutsIngredients;
    }

    public void setWalnutsIngredients(String walnutsIngredients) {
        this.walnutsIngredients = walnutsIngredients;
    }

    public String getWalnutsCalories() {
        return walnutsCalories;
    }

    public void setWalnutsCalories(String walnutsCalories) {
        this.walnutsCalories = walnutsCalories;
    }

    @Override
    public String toString() {
        return "ChickenBreastWalnuts{" +
                "walnutsIngredients='" + walnutsIngredients + '\'' +
                ", walnutsCalories='" + walnutsCalories + '\'' +
                '}';
    }
}
