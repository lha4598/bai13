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
                        Employee e = new Experience();
                        e.enterID(sc);
                        e.enterName(sc);
                        e.enterBirthday(sc);
                        e.enterEmail(sc);
                        e.enterPhone(sc);
                        e.enterOther(sc);
                        e.enterCertificate(sc);
                        manager.addEmployee(e);
                    }
                    if (choice2 == 2) {
                        Employee f = new Fresher();
                        f.enterID(sc);
                        f.enterName(sc);
                        f.enterBirthday(sc);
                        f.enterEmail(sc);
                        f.enterPhone(sc);
                        f.enterOther(sc);
                        f.enterCertificate(sc);
                        manager.addEmployee(f);
                    }
                    if (choice2 == 3) {
                        Employee i = new Intern();
                        i.enterID(sc);
                        i.enterName(sc);
                        i.enterBirthday(sc);
                        i.enterEmail(sc);
                        i.enterPhone(sc);
                        i.enterOther(sc);
                        i.enterCertificate(sc);
                        manager.addEmployee(i);
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