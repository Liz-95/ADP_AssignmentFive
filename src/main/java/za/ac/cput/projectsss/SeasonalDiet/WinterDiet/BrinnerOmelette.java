package za.ac.cput.projectsss.SeasonalDiet.WinterDiet;

public class BrinnerOmelette {

    private String omeletteIngredients;
    private String omeletteProtein;

    public BrinnerOmelette(){

    }

    public BrinnerOmelette(String omeletteIngredients, String omeletteProtein) {
        this.omeletteIngredients = omeletteIngredients;
        this.omeletteProtein = omeletteProtein;
    }

    public String getOmeletteIngredients() {
        return omeletteIngredients;
    }

    public void setOmeletteIngredients(String omeletteIngredients) {
        this.omeletteIngredients = omeletteIngredients;
    }

    public String getOmeletteProtein() {
        return omeletteProtein;
    }

    public void setOmeletteProtein(String omeletteProtein) {
        this.omeletteProtein = omeletteProtein;
    }

    @Override
    public String toString() {
        return "BrinnerOmelette{" +
                "omeletteIngredients='" + omeletteIngredients + '\'' +
                ", omeletteProtein='" + omeletteProtein + '\'' +
                '}';
    }
}
