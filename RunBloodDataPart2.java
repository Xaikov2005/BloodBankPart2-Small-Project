import java.util.Scanner;

class BloodData {
    private String bloodType;
    private String rhFactor;

    // Default constructor
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    // Parameterized constructor
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // Setters
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Getters
    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    // Display method
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter blood type of a patient (A, B, AB, O): ");
            String bloodType = scanner.nextLine().toUpperCase();

            System.out.print("Enter the Rhesus factor (+ or -) or press Enter for default: ");
            String rhFactor = scanner.nextLine();

            BloodData bloodData;

            // Handle default input
            if (bloodType.isEmpty() && rhFactor.isEmpty()) {
                bloodData = new BloodData();
            } 
            // Validate custom input
            else if (isValidBloodType(bloodType) && isValidRhFactor(rhFactor)) {
                bloodData = new BloodData(bloodType, rhFactor);
            } 
            // Invalid input handling
            else {
                System.out.println("Invalid input! Please enter a valid blood type and Rhesus factor.");
                continue;
            }

            // Display the entered blood data
            bloodData.display();

            // Prompt to continue or stop
            System.out.print("Do you want to input another patient's blood data? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("no")) {
                continueInput = false;
            }
        }

        scanner.close();
    }

    // Validate blood type
    public static boolean isValidBloodType(String bloodType) {
        return bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O");
    }

    // Validate Rhesus factor
    public static boolean isValidRhFactor(String rhFactor) {
        return rhFactor.equals("+") || rhFactor.equals("-");
    }
}
