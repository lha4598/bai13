import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    private List<Employee> employees;
    private static int count = 0;

    public Manager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee); //Thêm
        count++;
    }

    public void showEmployees() {
        this.employees.forEach(employee -> employee.Xuat(sc)); //Test
    }

    public void removeEmployee(String id) {
        this.employees.removeIf(employee -> employee.getId().equals(id));
    }

    public void updateEmployee(String id, Scanner sc) {
        this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().ifPresent(employee -> {employee.enterID(sc);
            employee.enterName(sc);employee.enterBirthday(sc);employee.enterPhone(sc);employee.enterEmail(sc);employee.enterOther(sc);});
    }


}
