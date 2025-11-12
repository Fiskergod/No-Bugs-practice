package homework_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    static {
        universityName = "Some university name.";
    }

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("ID: " + studentID + ", Name: " + studentName + ", University: " + universityName);
    }
}
