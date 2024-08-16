import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("-------------MENU------------");
            System.out.println("1. Thêm nhân viên ");
            System.out.println("2. Sửa ");
            System.out.println("3. Xóa ");
            System.out.println("4. Test ");
            System.out.println("5. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("1. Experience");
                    System.out.println("2. Fresher");
                    System.out.println("3. Intern");
                    int choice2 = sc.nextInt();
                    sc.nextLine();
                    if (choice2 == 1) {
                        Employee experience = new Experience();
                        experience.Nhap(sc);
                        manager.addEmployee(experience);
                    }
                    if (choice2 == 2) {
                        Employee fresher = new Fresher();
                        fresher.Nhap(sc);
                        manager.addEmployee(fresher);
                    }
                    if (choice2 == 3) {
                        Employee intern = new Intern();
                        intern.Nhap(sc);
                        manager.addEmployee(intern);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập ID cần sửa");
                    String id = sc.nextLine();
                    manager.updateEmployee(id,sc);
                    break;
                }
                case 3: {
                    System.out.println("Nhập ID cần xóa");
                    String id = sc.nextLine();
                    manager.removeEmployee(id);
                    break;
                }
                case 4: {
                    manager.showEmployees();
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}