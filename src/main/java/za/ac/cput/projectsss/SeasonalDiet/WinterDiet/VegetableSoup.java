package za.ac.cput.projectsss.SeasonalDiet.WinterDiet;

public class VegetableSoup {

    private String soupIngredients;
    private String soupCarbs;

    public VegetableSoup(){

    }

    public VegetableSoup(String soupIngredients, String soupCarbs) {
        this.soupIngredients = soupIngredients;
        this.soupCarbs = soupCarbs;
    }

    public String getSoupIngredients() {
        return soupIngredients;
    }

    public void setSoupIngredients(String soupIngredients) {
        this.soupIngredients = soupIngredients;
    }

    public String getSoupCarbs() {
        return soupCarbs;
    }

    public void setSoupCarbs(String soupCarbs) {
        this.soupCarbs = soupCarbs;
    }

    @Override
    public String toString() {
        return "VegetableSoup{" +
                "soupIngredients='" + soupIngredients + '\'' +
                ", soupCarbs='" + soupCarbs + '\'' +
                '}';
    }
}
