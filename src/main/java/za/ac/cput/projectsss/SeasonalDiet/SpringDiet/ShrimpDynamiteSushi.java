package za.ac.cput.projectsss.SeasonalDiet.SpringDiet;

public class ShrimpDynamiteSushi {

    private String shrimpIngredients;
    private String shrimpCalories;

    public ShrimpDynamiteSushi(){

    }

    public ShrimpDynamiteSushi(String shrimpIngredients, String shrimpCalories) {
        this.shrimpIngredients = shrimpIngredients;
        this.shrimpCalories = shrimpCalories;
    }

    public String getShrimpIngredients() {
        return shrimpIngredients;
    }

    public void setShrimpIngredients(String shrimpIngredients) {
        this.shrimpIngredients = shrimpIngredients;
    }

    public String getShrimpCalories() {
        return shrimpCalories;
    }

    public void setShrimpCalories(String shrimpCalories) {
        this.shrimpCalories = shrimpCalories;
    }

    @Override
    public String toString() {
        return "ShrimpDynamiteSushi{" +
                "shrimpIngredients='" + shrimpIngredients + '\'' +
                ", shrimpCalories='" + shrimpCalories + '\'' +
                '}';
    }
}
