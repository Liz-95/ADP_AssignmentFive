package za.ac.cput.projectsss.SeasonalDiet.SpringDiet;

public class ChickenPestoSpaghetti {

     private String pestoIngredients;
     private String pestoCarbs;

     public ChickenPestoSpaghetti(){

     }

    public ChickenPestoSpaghetti(String pestoIngredients, String pestoCarbs) {
        this.pestoIngredients = pestoIngredients;
        this.pestoCarbs = pestoCarbs;
    }

    public String getPestoIngredients() {
        return pestoIngredients;
    }

    public void setPestoIngredients(String pestoIngredients) {
        this.pestoIngredients = pestoIngredients;
    }

    public String getPestoCarbs() {
        return pestoCarbs;
    }

    public void setPestoCarbs(String pestoCarbs) {
        this.pestoCarbs = pestoCarbs;
    }

    @Override
    public String toString() {
        return "ChickenPestoSpaghetti{" +
                "pestoIngredients='" + pestoIngredients + '\'' +
                ", pestoCarbs='" + pestoCarbs + '\'' +
                '}';
    }
}
