package tugas_java.com.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== kalkulator===");
            System.out.println("1. Luas Lingkaran");
            System.out.println("2. Keliling Lingkaran");
            System.out.println("3. Luas Persegi");
            System.out.println("4. Keliling Persegi");
            System.out.println("5. Luas Segitiga");
            System.out.println("6. keluar");
            System.out.print("pilih menu : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 :
                hitungLuasLingkaran(scanner);
                break;
                case 2 :
                hitungKelilingLingkaran(scanner);
                break;
                case 3 :

                hitungLuasPersegi(scanner);
                break;
                case 4 :
                hitungKelilingPersegi(scanner);
                break;
                case 5 :
                hitungLuasSegitiga(scanner);
                break;
                case 6 :
                System.out.println("Keluar dari program.");
                break;
                default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        } while (pilihan != 6);
        scanner.close();
    }

    private static void hitungLuasLingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    private static void hitungKelilingLingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    private static void hitungLuasPersegi(Scanner scanner) {
        System.out.print("Masukkan sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    private static void hitungKelilingPersegi(Scanner scanner) {
        System.out.print("Masukkan sisi persegi: ");
        double sisi = scanner.nextDouble();
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }

    private static void hitungLuasSegitiga(Scanner scanner) {
        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
    }
}
