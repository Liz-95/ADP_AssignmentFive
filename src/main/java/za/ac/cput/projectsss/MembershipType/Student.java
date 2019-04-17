package za.ac.cput.projectsss.MembershipType;

public class Student {

    private int age;
    private String universityName;
    private String studentName;
    private String studentSurname;
    private String studentContactNum;
    private double studentFee;

    public Student(){

    }

    public Student(int age, String universityName, String studentName, String studentSurname, String studentContactNum, double studentFee)
    {
        this.age=age;
        this.universityName=universityName;
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentContactNum=studentContactNum;
        this.studentFee=studentFee;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentContactNum() {
        return studentContactNum;
    }

    public void setStudentContactNum(String studentContactNum) {
        this.studentContactNum = studentContactNum;
    }

    public double getStudentFee() {
        return studentFee;
    }

    public void setStudentFee(double studentFee) {
        this.studentFee = studentFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", universityName='" + universityName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentContactNum='" + studentContactNum + '\'' +
                ", studentFee=" + studentFee +
                '}';
    }
}
