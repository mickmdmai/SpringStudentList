package StudentList.DemoApril25.model;

public class Student {

    private String fname;
    private String lName;
    private int studentId;

    public Student() {}

    public Student(String fname, String lName, int studentId) {
        this.fname = fname;
        this.lName = lName;
        this.studentId = studentId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
