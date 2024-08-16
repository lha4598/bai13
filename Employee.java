import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Employee {
    protected String id;
    protected String name;
    protected Date birthday;
    protected String email;
    protected String phone;
    protected int employeeType, employeeCount;
    protected Certificate certificate;

    public Employee() {

    }

    public Employee(String id, String name, Date birthday, String email, String phone, int employeeType) {
        if (!isInvalidName(name)) {}
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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

    public abstract void Nhap(Scanner sc) ;

    public abstract void Xuat(Scanner sc);

    public static boolean isInvalidName(String name) {
        String regex = "^[a-zA-Z\\s]+$";
        return name != null && Pattern.matches(regex, name);
    }//cái này chưa biết vết



}
