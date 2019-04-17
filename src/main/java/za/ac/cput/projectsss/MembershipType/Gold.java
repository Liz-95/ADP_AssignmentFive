package za.ac.cput.projectsss.MembershipType;

public class Gold {

    private int age;
    private String goldMemberName;
    private String goldMemberSurname;
    private String goldMemberContactNum;
    private String goldMemberAddress;
    private double goldFee;

    public Gold(){

    }

    public Gold(int age, String goldMemberName, String goldMemberSurname, String goldMemberContactNum, String goldMemberAddress, double goldFee){
        this.age=age;
        this.goldMemberName=goldMemberName;
        this.goldMemberSurname=goldMemberSurname;
        this.goldMemberContactNum=goldMemberContactNum;
        this.goldMemberAddress=goldMemberAddress;
        this.goldFee=goldFee;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGoldMemberName() {
        return goldMemberName;
    }

    public void setGoldMemberName(String goldMemberName) {
        this.goldMemberName = goldMemberName;
    }

    public String getGoldMemberSurname() {
        return goldMemberSurname;
    }

    public void setGoldMemberSurname(String goldMemberSurname) {
        this.goldMemberSurname = goldMemberSurname;
    }

    public String getGoldMemberContactNum() {
        return goldMemberContactNum;
    }

    public void setGoldMemberContactNum(String goldMemberContactNum) {
        this.goldMemberContactNum = goldMemberContactNum;
    }

    public String getGoldMemberAddress() {
        return goldMemberAddress;
    }

    public void setGoldMemberAddress(String goldMemberAddress) {
        this.goldMemberAddress = goldMemberAddress;
    }

    public double getGoldFee() {
        return goldFee;
    }

    public void setGoldFee(double goldFee) {
        this.goldFee = goldFee;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "age=" + age +
                ", goldMemberName='" + goldMemberName + '\'' +
                ", goldMemberSurname='" + goldMemberSurname + '\'' +
                ", goldMemberContactNum='" + goldMemberContactNum + '\'' +
                ", goldMemberAddress='" + goldMemberAddress + '\'' +
                ", goldFee=" + goldFee +
                '}';
    }
}
