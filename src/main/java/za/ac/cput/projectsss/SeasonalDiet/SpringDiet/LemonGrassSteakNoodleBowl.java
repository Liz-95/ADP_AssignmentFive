package za.ac.cput.projectsss.SeasonalDiet.SpringDiet;

public class LemonGrassSteakNoodleBowl {

    private String lemonIngredients;
    private String lemonCalories;

    public LemonGrassSteakNoodleBowl(){

    }

    public LemonGrassSteakNoodleBowl(String lemonIngredients, String lemonCalories) {
        this.lemonIngredients = lemonIngredients;
        this.lemonCalories = lemonCalories;
    }

    public String getLemonIngredients() {
        return lemonIngredients;
    }

    public void setLemonIngredients(String lemonIngredients) {
        this.lemonIngredients = lemonIngredients;
    }

    public String getLemonCalories() {
        return lemonCalories;
    }

    public void setLemonCalories(String lemonCalories) {
        this.lemonCalories = lemonCalories;
    }

    @Override
    public String toString() {
        return "LemonGrassSteakNoodleBowl{" +
                "lemonIngredients='" + lemonIngredients + '\'' +
                ", lemonCalories='" + lemonCalories + '\'' +
                '}';
    }
}
