import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== Kalkulator Luas =====");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungLuasPersegi(scanner);
                    break;
                case 2:
                    hitungLuasPersegiPanjang(scanner);
                    break;
                case 3:
                    hitungLuasLingkaran(scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 4);

        scanner.close();
    }

    public static void hitungLuasPersegi(Scanner scanner) {
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas);
    }

    public static void hitungLuasPersegiPanjang(Scanner scanner) {
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }

    public static void hitungLuasLingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}

