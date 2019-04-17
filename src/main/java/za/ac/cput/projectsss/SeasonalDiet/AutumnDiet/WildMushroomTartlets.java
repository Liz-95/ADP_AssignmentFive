package za.ac.cput.projectsss.SeasonalDiet.AutumnDiet;

public class WildMushroomTartlets {

    private String wildMushroomCarb;
    private String wildMushroomIngredients;

    public WildMushroomTartlets(){

    }

    public WildMushroomTartlets(String wildMushroomCarb, String wildMushroomIngredients) {
        this.wildMushroomCarb = wildMushroomCarb;
        this.wildMushroomIngredients = wildMushroomIngredients;
    }

    public String getWildMushroomCarb() {
        return wildMushroomCarb;
    }

    public void setWildMushroomCarb(String wildMushroomCarb) {
        this.wildMushroomCarb = wildMushroomCarb;
    }

    public String getWildMushroomIngredients() {
        return wildMushroomIngredients;
    }

    public void setWildMushroomIngredients(String wildMushroomIngredients) {
        this.wildMushroomIngredients = wildMushroomIngredients;
    }

    @Override
    public String toString() {
        return "WildMushroomTartlets{" +
                "wildMushroomCarb='" + wildMushroomCarb + '\'' +
                ", wildMushroomIngredients='" + wildMushroomIngredients + '\'' +
                '}';
    }
}
