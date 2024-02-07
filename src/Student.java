public class Student extends Human {
    private String faculty;
    private int studentId;

    public Student (String firstName){
        super(firstName);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;

    }

    @Override
    public void printInfo() {
        System.out.println(faculty);
        System.out.println(studentId);
    }
}
