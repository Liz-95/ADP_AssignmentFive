package za.ac.cput.projectsss.MembershipType;

public class Platinum {

    private int age;
    private String platinumMemberName;
    private String platinumMemberSurname;
    private String platinumMemberContactNum;
    private String platinumMemberAddress;
    private double platinumFee;

    public Platinum(){

    }

    public Platinum(int age, String platinumMemberName, String platinumMemberSurname, String platinumMemberContactNum, String platinumMemberAddress, double platinumFee) {
        this.age = age;
        this.platinumMemberName = platinumMemberName;
        this.platinumMemberSurname = platinumMemberSurname;
        this.platinumMemberContactNum = platinumMemberContactNum;
        this.platinumMemberAddress = platinumMemberAddress;
        this.platinumFee =platinumFee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlatinumMemberName() {
        return platinumMemberName;
    }

    public void setPlatinumMemberName(String platinumMemberName) {
        this.platinumMemberName = platinumMemberName;
    }

    public String getPlatinumMemberSurname() {
        return platinumMemberSurname;
    }

    public void setPlatinumMemberSurname(String platinumMemberSurname) {
        this.platinumMemberSurname = platinumMemberSurname;
    }

    public String getPlatinumMemberContactNum() {
        return platinumMemberContactNum;
    }

    public void setPlatinumMemberContactNum(String platinumMemberContactNum) {
        this.platinumMemberContactNum = platinumMemberContactNum;
    }

    public String getPlatinumMemberAddress() {
        return platinumMemberAddress;
    }

    public void setPlatinumMemberAddress(String platinumMemberAddress) {
        this.platinumMemberAddress = platinumMemberAddress;
    }

    public double getPlatinumFee() {
        return platinumFee;
    }

    public void setPlatinumFee(double platinumFee) {
        this.platinumFee = platinumFee;
    }

    @Override
    public String toString() {
        return "Platinum{" +
                "age=" + age +
                ", platinumMemberName='" + platinumMemberName + '\'' +
                ", platinumMemberSurname='" + platinumMemberSurname + '\'' +
                ", platinumMemberContactNum='" + platinumMemberContactNum + '\'' +
                ", platinumMemberAddress='" + platinumMemberAddress + '\'' +
                ", platinumFee=" + platinumFee +
                '}';
    }
}
