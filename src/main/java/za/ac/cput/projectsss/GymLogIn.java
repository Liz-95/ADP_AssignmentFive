package za.ac.cput.projectsss;

public class GymLogIn {
    private String userName;
    private int password;


    public GymLogIn(){

    }

    public GymLogIn(String userName, int password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "GymLogIn{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
