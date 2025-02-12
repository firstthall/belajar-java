
//latihan method non void
public class motor {
    String Warna;
    int tahunproduksi;
    int nomormesin;
    int nomorrangka;
    //method mengisi variabel instance
    void isi(String warna, int tahunproduksi, int nomormesin, int nomorrangka){
        this.Warna = warna;
        this.tahunproduksi = tahunproduksi;
        this.nomormesin = nomormesin;
        this.nomorrangka = nomorrangka;


    }
    //method menampilkan isi variabel
    String ambilwarna (){
        return Warna;
        
    }
    int ambiltahunproduksi (){
        return tahunproduksi;

    }
    int ambilnomormesin (){
        return nomormesin;

    }
    int ambilnomorrangka (){
        return nomorrangka;

    }
    public static void main(String[] args) {
        motor mobilniaga = new motor();
        //proses pemamggilan method void
        mobilniaga.isi("merah", 2020, 2345, 3456);
        System.out.println("warna : " + mobilniaga.ambilwarna());
        System.out.println("tahunproduksi : " + mobilniaga.ambiltahunproduksi());
        System.out.println("nomormesin : " + mobilniaga.ambilnomormesin());
        System.out.println("nomorrangka : " + mobilniaga.ambilnomorrangka());
    }
}
