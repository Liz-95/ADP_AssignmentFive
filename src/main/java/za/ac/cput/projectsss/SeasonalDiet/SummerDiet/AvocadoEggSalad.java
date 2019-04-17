
package za.ac.cput.projectsss.SeasonalDiet.SummerDiet;

public class AvocadoEggSalad {

    private String avoIngredients;
    private String avoMinerals;

    public AvocadoEggSalad(){

    }

    public AvocadoEggSalad(String avoIngredients, String avoMinerals) {
        this.avoIngredients = avoIngredients;
        this.avoMinerals = avoMinerals;
    }

    public String getAvoIngredients() {
        return avoIngredients;
    }

    public void setAvoIngredients(String avoIngredients) {
        this.avoIngredients = avoIngredients;
    }

    public String getAvoMinerals() {
        return avoMinerals;
    }

    public void setAvoMinerals(String avoMinerals) {
        this.avoMinerals = avoMinerals;
    }

    @Override
    public String toString() {
        return "AvocadoEggSalad{" +
                "avoIngredients='" + avoIngredients + '\'' +
                ", avoMinerals='" + avoMinerals + '\'' +
                '}';
    }
}
