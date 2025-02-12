
//latihan void method
public class Mobil {
        String Warna;
        int tahunproduksi;
        int nomormesin;
        int nomorrangka;
        public static void main(String[] args) {
            Mobil mobilniaga = new Mobil();
            //pemanggilan method void
            mobilniaga.isi();
            mobilniaga.tampil();
                }
                //mengisi variabel instance
                void isi(){
                    Warna = "Hytam";
                    tahunproduksi = 2015;
                    nomormesin = 34567;
                    nomorrangka = 45678;
                }
                //Menampilkan isi variabel
                void tampil(){
                    System.out.println("Hasil Pencarian");
                    System.out.println("------------------");
                    System.out.println("Warna : " + Warna);
                    System.out.println("tahunproduksi : " + tahunproduksi);
                    System.out.println("nomormesin : " + nomormesin);
                    System.out.println("nomorrangka : " + nomorrangka);
                     }
                    
            

    
}
