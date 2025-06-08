import java.io.*;
import java.util.*;

public class StudentManagementSystem {
    static HashMap<Integer, String> stuMap = new HashMap<>();
    static final String FILE_NAME = "StudentData.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n...Student Management Menu...\n");
            System.out.println("1. Add Student");
            System.out.println("2. Save to file");
            System.out.println("3. Load from file");
            System.out.println("4. Search by ID");
            System.out.println("5. Remove Student");
            System.out.println("6. Display All Students");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    saveToFile();
                    break;
                case 3:
                    loadFromFile(sc);
                    break;
                case 4:
                    searchStudent(sc);
                    break;
                case 5:
                    removeStudent(sc);
                    break;
                case 6:
                    displayAll();
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 0);
        sc.close();
    }

    static void addStudent(Scanner sc) {
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.println("Enter Name:");
        String name = sc.nextLine();

        if (stuMap.containsKey(id)) {
            System.out.println("ID already exists.");
        } else {
            stuMap.put(id, name);
            System.out.println("Student added.");
        }
    }

    static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<Integer, String> entry : stuMap.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
            System.out.println("Data Saved");
        } catch (IOException e) {
            System.out.println("Error while saving the file: " + e.getMessage());
        }
    }

    static void loadFromFile(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            stuMap.clear(); // Clear existing data
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    stuMap.put(id, name);
                }
            }
            System.out.println("Data loaded from file.");
        } catch (IOException e) {
            System.out.println("Error while loading the file: " + e.getMessage());
        }
    }

    static void searchStudent(Scanner sc) {
        System.out.println("Enter ID to search:");
        int id = sc.nextInt();
        if (stuMap.containsKey(id)) {
            System.out.println("Student found: " + id + " - " + stuMap.get(id));
        } else {
            System.out.println("Student not found.");
        }
    }

    static void removeStudent(Scanner sc) {
        System.out.println("Enter ID to remove:");
        int id = sc.nextInt();
        if (stuMap.containsKey(id)) {
            stuMap.remove(id);
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void displayAll() {
        if (stuMap.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nAll Students:");
            for (Map.Entry<Integer, String> entry : stuMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " - Name: " + entry.getValue());
            }
        }
    }
}
