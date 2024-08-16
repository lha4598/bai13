import java.util.Date;
import java.util.Scanner;

public class Fresher extends Employee {
    private Date graduationDate;
    private int graduationRank;
    private String education;

    public Fresher() {

    }
     public Fresher(String id, String name, Date birthday, String email, String phone, int employeeType, Date graduationDate, int graduationRank, String education) {
        super(id, name, birthday, email, phone, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
     }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public int getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(int graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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
        System.out.println("Nhập xếp loại tốt nghiệp: ");
        graduationRank = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập trường tốt nghiệp: ");
        education = sc.nextLine();
    }

    @Override
    public void Xuat(Scanner sc) {
        System.out.println("ID=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
                + ", graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
                + ", education=" + education);
    }
}
