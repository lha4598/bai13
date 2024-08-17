import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String university;
    boolean success = false;

    public Intern() {

    }

    public Intern(String id, String name, String birthday, String email, String phone, int employeeType, String majors, String semester, String university) {
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

    @Override
    public void enterID(Scanner sc) {
        System.out.println("Nhập ID");
        this.id = sc.nextLine();
    }

    public static void validateName(String name) throws NameException {
        String nameRegex = "^[A-Za-z ]+$";
        if (!name.matches(nameRegex)) {
            throw new NameException("Tên không hợp lệ vui lòng nhập lại ");
        }
    }

    public void enterName(Scanner sc) {
        while (!success) {
            try {
                System.out.println("Nhập tên:  ");
                this.name = sc.nextLine();
                validateName(name);
                success = true;
            } catch (NameException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        success = false;
    }

    public static void validateDate(String dateStr) throws BirthDayException {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(dateStr, dateFormatter);
            if (date.isAfter(LocalDate.now())) {
                throw new BirthDayException("Ngày sinh nhập sai vui lòng nhập lại.");
            }
        } catch (DateTimeParseException e) {
            throw new BirthDayException("Sai định dạng ngày sinh dd/MM/yyyy.");
        }
    }

    public void enterBirthday(Scanner sc) {
        while (!success) {
            try {
                System.out.println("Nhập ngày sinh:  ");
                this.birthday = sc.nextLine();
                validateDate(birthday);
                success = true;
            } catch (BirthDayException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        success = false;
    }

    public static void validateEmail(String email) throws EmailException {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!email.matches(emailRegex)) {
            throw new EmailException("Nhập email sai vui lng nhập lại");
        }
    }

    public void enterEmail(Scanner sc) {
        while(!success) {
            try {
                System.out.println("Nhập email: ");
                this.email = sc.nextLine();
                validateEmail(email);
                success = true;
            } catch (EmailException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        success = false;
    }

    public static void validatePhoneNumber(String phone) throws PhoneException {
        String phoneRegex = "^[0-9]{10}$";
        if (!phone.matches(phoneRegex)) {
            throw new PhoneException("Số điện thoại chứa 10 chữ số .");
        }
    }

    public void enterPhone(Scanner sc) {
        while(!success) {
            try {
                System.out.println("Nhập số điện thoại :");
                this.phone = sc.nextLine();
                validatePhoneNumber(phone);
                success = true;
            } catch (PhoneException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        success = false;
    }

    public void enterOther(Scanner sc) {
        System.out.println("Nhập chuyên ngành học: ");
        majors = sc.nextLine();
        System.out.println("Nhập kì học: ");
        semester = sc.nextLine();
        System.out.println("Nhập trường đang học: ");
        university = sc.nextLine();

    }

    public void enterCertificate(Scanner sc) {
        System.out.println("Sở hữu bao nhiêu bằng cấp :");
        int amount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhập ID bằng cấp thứ" + i+1 +": ");
            String id = sc.nextLine();
            System.out.println("Nhập tên bằng thứ" + i+1 +": ");
            String name = sc.nextLine();
            System.out.println("Nhập ngày cấp (yy/MM/yyyy) của bằng thứ " + i+1 +": ");
            String day = sc.nextLine();
            System.out.println("Nhập hạng bằng cấp thứ" + i+1 +": ");
            String rank = sc.nextLine();
            Certificate certificate = new Certificate(id, name, day, rank);
            addCertificate(certificate);
        }
    }

    @Override
    public void Xuat(Scanner sc) {
        System.out.println("ID: " + id + "Tên: " + name + ", email: " + email + ", phone: "
                + phone + "Chuyên ngành: " + majors + ", Kì học:  "
                + semester + ", Trường:  " + university + certificates);
    }
}
