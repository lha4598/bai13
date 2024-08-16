import java.util.Date;
import java.util.Scanner;

public class Experience extends Employee {
    private int experienceYear;
    private String proSkill;

    public Experience() {

    }

    public Experience(String id, String name, Date birthday, String email, String phone, int employeeType, int experienceYear, String proSkill) {
        super(id, name, birthday, email, phone, employeeType);
        this.experienceYear = experienceYear;
        this.proSkill = proSkill;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void Nhap(Scanner sc) {
        System.out.println("Nhập ID");
        id = sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập email: ");
        email = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        phone = sc.nextLine();
        System.out.println("Nhập số năm kinh nghiệm: ");
        experienceYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập kỹ năng chuyên môn: ");
        proSkill = sc.nextLine();

    }

    @Override
    public void Xuat(Scanner sc) {
        System.out.println("ID= " + id + "\nName= " + name + "\nEmail= " + email
                + "\nPhone= " + phone + "\nExperience Year= "
                + experienceYear + "\nPro Skill= " + proSkill);

    }
}
