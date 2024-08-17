import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;
    boolean success = false;

    public Fresher() {

    }
     public Fresher(String id, String name, String birthday, String email, String phone, int employeeType, String graduationDate, String graduationRank, String education) {
        super(id, name, birthday, email, phone, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
     }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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
        System.out.println("Nhập xếp hạng tốt nghiệp: ");
        this.graduationRank = sc.nextLine();
        System.out.println("Nhập ngày tốt nghiệp: ");
        this.graduationDate = sc.nextLine();
        System.out.println("Nhập trường tốt nghiệp: ");
        this.education = sc.nextLine();
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
        System.out.println("ID=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
                + ", graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
                + ", education=" + education + certificates);
    }
}
