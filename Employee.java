import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Employee {
    protected String id;
    protected String name;
    protected String birthday;
    protected String email;
    protected String phone;
    protected int employeeType;
    protected List<Certificate> certificates;

    public Employee() {
        this.certificates = new ArrayList<>();
    }

    public Employee(String id, String name, String birthday, String email, String phone, int employeeType) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.employeeType = employeeType;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public void addCertificate(Certificate certificate) {
        certificates.add(certificate);
    }

    public abstract void enterID(Scanner sc);

    public  abstract void enterName(Scanner sc);

    public abstract void enterBirthday(Scanner sc);

    public abstract void enterEmail(Scanner sc);

    public abstract void enterPhone(Scanner sc);

    public abstract void enterOther(Scanner sc);

    public abstract void enterCertificate(Scanner sc);

    public abstract void Xuat(Scanner sc);


}
