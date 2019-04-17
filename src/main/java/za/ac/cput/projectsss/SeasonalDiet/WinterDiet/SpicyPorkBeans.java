package za.ac.cput.projectsss.SeasonalDiet.WinterDiet;

public class SpicyPorkBeans {

    private String beansIngredients;
    private String beansCalories;

    public SpicyPorkBeans(){

    }

    public SpicyPorkBeans(String beansIngredients, String beansCalories) {
        this.beansIngredients = beansIngredients;
        this.beansCalories = beansCalories;
    }

    public String getBeansIngredients() {
        return beansIngredients;
    }

    public void setBeansIngredients(String beansIngredients) {
        this.beansIngredients = beansIngredients;
    }

    public String getBeansCalories() {
        return beansCalories;
    }

    public void setBeansCalories(String beansCalories) {
        this.beansCalories = beansCalories;
    }

    @Override
    public String toString() {
        return "SpicyPorkBeans{" +
                "beansIngredients='" + beansIngredients + '\'' +
                ", beansCalories='" + beansCalories + '\'' +
                '}';
    }
}
