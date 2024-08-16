import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Manager {
    Scanner sc = new Scanner(System.in);
    private List<Employee> employees;

    public Manager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee); //Thêm
    }

    public void showEmployees() {
        this.employees.forEach(employee -> employee.Xuat(sc)); //Test
    }

    public void removeEmployee(String id) {
        this.employees.removeIf(employee -> employee.getId().equals(id));
    }

    public void updateEmployee(String id, Scanner sc) {
        this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().ifPresent(employee -> {employee.Nhap(sc);});
    }


}
