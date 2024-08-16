import java.util.Date;
import java.util.Scanner;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String university;

    public Intern() {

    }

    public Intern(String id, String name, Date birthday, String email, String phone, int employeeType, String majors, String semester, String university) {
        super(id, name, birthday, email, phone, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void Nhap(Scanner sc) {
        System.out.println("Nhập ID");
        id = sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập email: ");
        email = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        phone = sc.nextLine();
        System.out.println("Nhập chuyên ngành học: ");
        majors = sc.nextLine();
        System.out.println("Nhập kì học: ");
        semester = sc.nextLine();
        System.out.println("Nhập trường đang học: ");
        university = sc.nextLine();

    }

    @Override
    public void Xuat(Scanner sc) {
        System.out.println("ID: " + id + "Tên: " + name + ", email: " + email + ", phone: "
                + phone + "Chuyên ngành: " + majors + ", Kì học:  "
                + semester + ", Trường:  " + university);
    }
}
