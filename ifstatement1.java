import java.util.Scanner;

public class ifstatement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat badan dalam kg
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();

        // Input tinggi badan dalam meter
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan status kesehatan berdasarkan IMT
        String status;
        if (imt < 18.5) {
            status = "Kurus";
        } else if (imt >= 18.5 && imt < 24.9) {
            status = "Normal";
        } else if (imt >= 25 && imt < 29.9) {
            status = "Kelebihan Berat Badan";
        } else {
            status = "Obesitas";
        }

        // Menampilkan hasil
        System.out.printf("\nIndeks Massa Tubuh (IMT): %.2f\n", imt);
        System.out.println("Status kesehatan Anda: " + status);

        // Menutup scanner
        scanner.close();
    }
}