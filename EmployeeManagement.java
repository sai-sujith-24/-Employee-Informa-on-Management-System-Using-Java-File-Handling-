
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE INFORMATION SYSTEM =====");
            System.out.println("1. Write Employee Records");
            System.out.println("2. Read Employee Records");
            System.out.println("3. Append Employee Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 3:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Designation: ");
                        String designation = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        FileOutputStream fout;

                        if (choice == 1) {
                            fout = new FileOutputStream("Employee.txt");
                        } else {
                            fout = new FileOutputStream("Employee.txt", true);
                        }

                        String data = id + "," + name + "," +
                                      designation + "," + salary + "\n";

                        fout.write(data.getBytes());
                        fout.close();

                        System.out.println("Employee record successfully written to the file.");
                    }
                    catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        FileInputStream fin =
                            new FileInputStream("Employee.txt");

                        int ch;

                        System.out.println("\nEmployee Records:");

                        while ((ch = fin.read()) != -1) {
                            System.out.print((char) ch);
                        }

                        fin.close();
                    }
                    catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting Employee Information System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
