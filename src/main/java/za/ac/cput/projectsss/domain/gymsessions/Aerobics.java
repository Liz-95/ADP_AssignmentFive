package za.ac.cput.projectsss.domain.gymsessions;

public class Aerobics {

    private int aeroWeight;
    private int aeroBmi;
    private int aeroHeight;


    public Aerobics(){

    }

    public Aerobics(int aeroWeight, int aeroBmi, int aeroHeight) {
        this.aeroWeight = aeroWeight;
        this.aeroBmi = aeroBmi;
        this.aeroHeight = aeroHeight;
    }

    public int getAeroWeight() {
        return aeroWeight;
    }

    public void setAeroWeight(int aeroWeight) {
        this.aeroWeight = aeroWeight;
    }

    public int getAeroBmi() {
        return aeroBmi;
    }

    public void setAeroBmi(int aeroBmi) {
        this.aeroBmi = aeroBmi;
    }

    public int getAeroHeight() {
        return aeroHeight;
    }

    public void setAeroHeight(int aeroHeight) {
        this.aeroHeight = aeroHeight;
    }

    @Override
    public String toString() {
        return "Aerobics{" +
                "aeroWeight=" + aeroWeight +
                ", aeroBmi=" + aeroBmi +
                ", aeroHeight=" + aeroHeight +
                '}';
    }
}
