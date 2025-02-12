import java.util.Scanner;

public class Segitiga {
    int alas;
    int tinggi;

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        // Pemanggilan method void
        segitiga.isi();
        segitiga.tampil();
    }

    // Mengisi variabel instance dengan input dari pengguna
    void isi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        alas = sc.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = sc.nextInt();

        sc.close(); // Menutup scanner setelah selesai
    }

    // Menampilkan isi variabel dan menghitung luas
    void tampil() {
        int luas = (int) (0.5 * alas * tinggi); // Rumus 
        System.out.println("Hasil Pencarian");
        System.out.println("------------------");
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Luas Segitiga : " + luas);
    }
}

    