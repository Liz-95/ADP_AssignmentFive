package za.ac.cput.projectsss.SeasonalDiet.SpringDiet;

public class ChickenChipotleBowl {

    private String chipotleIngredients;
    private String chipotleCarbs;

    public ChickenChipotleBowl(){

    }

    public ChickenChipotleBowl(String chipotleIngredients, String chipotleCarbs) {
        this.chipotleIngredients = chipotleIngredients;
        this.chipotleCarbs = chipotleCarbs;
    }

    public String getChipotleIngredients() {
        return chipotleIngredients;
    }

    public void setChipotleIngredients(String chipotleIngredients) {
        this.chipotleIngredients = chipotleIngredients;
    }

    public String getChipotleCarbs() {
        return chipotleCarbs;
    }

    public void setChipotleCarbs(String chipotleCarbs) {
        this.chipotleCarbs = chipotleCarbs;
    }

    @Override
    public String toString() {
        return "ChickenChipotleBowl{" +
                "chipotleIngredients='" + chipotleIngredients + '\'' +
                ", chipotleCarbs='" + chipotleCarbs + '\'' +
                '}';
    }
}
