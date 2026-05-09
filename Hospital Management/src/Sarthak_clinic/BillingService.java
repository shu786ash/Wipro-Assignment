package Sarthak_clinic;
import java.sql.*;
import java.util.Scanner;

public class BillingService {
    public static void generateBill(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Appointment ID: ");
            int appointmentId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Patient ID: ");
            int patientId = sc.nextInt();
            sc.nextLine();
            System.out.println("Choose Room Type:");
            System.out.println("1. Normal Room");
            System.out.println("2. Deluxe Room");

            int choice = sc.nextInt();

            double pricePerDay = 0;

            if(choice == 1) {

                pricePerDay = 1000;

            } else if(choice == 2) {

                pricePerDay = 2000;

            } else {

                System.out.println("Invalid Choice");
                return;
            }

            System.out.print("Enter Number of Days: ");

            int days = sc.nextInt();

            double amount = pricePerDay * days;

            System.out.println("Total Amount: " + amount);

            sc.nextLine();
            sc.nextLine();
            System.out.print("Enter Discharge Date (YYYY-MM-DD): ");
            String date = sc.nextLine();
            System.out.print("Enter Summary: ");
            String summary = sc.nextLine();

            String sql = "INSERT INTO billings (patient_id, appointment_id, total_amount, discharge_date, summary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, patientId);
            ps.setInt(2, appointmentId);
            ps.setDouble(3, amount);
            ps.setDate(4, Date.valueOf(date));
            ps.setString(5, summary);

            ps.executeUpdate();
            System.out.println("✅ Billing generated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
