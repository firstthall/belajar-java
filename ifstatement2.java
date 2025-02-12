import java.util.Scanner;
public class ifstatement2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double beras = 15000.0;
;        double minyak  = 20000.0;
        double gula = 8000.0;
        double garam = 8000.0;
        double peyek = 2000.0;

        System.out.println("\nDaftar Harga Barang: ");
        System.out.println("1. beras - Rp " + beras);
        System.out.println("2. minyak - Rp " + minyak);
        System.out.println("3. gula - Rp " + gula);
        System.out.println("4. garam - Rp " + garam);
        System.out.println("5. peyeek - Rp " + peyek);
        System.out.print("pilih barang,1/2/3/4/5: ");
        int pilihan = Input.nextInt();

        double hargabarang = 0.0;
        if(pilihan == 1) {
        hargabarang = beras;  
        }
        else if(pilihan == 2) {
        hargabarang = minyak;
        }
        else if(pilihan == 3) {
        hargabarang = gula;
        }
        else if(pilihan == 4) {
        hargabarang = garam;
        }        
        else if(pilihan == 5) {
        hargabarang = peyek;
        } else {
            System.out.println("Pilihan tidak tersedia!");
            System.exit(0);
        }
        System.out.print("Masukkan jumlah barang : ");
        int jumlah = Input.nextInt();

            double totalharga = hargabarang * jumlah;
            System.out.println("total harga : Rp." + totalharga);
            Input.close();
            

    }

}