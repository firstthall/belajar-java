//latihan method static
public class pesawat {
    //variabel static
    static String warna = "biru";
    static String tahunproduksi = "2021";
    //method static
    static void ubah() {
        warna = "kuning";
    }
    static void tampil() {
        System.out.println(warna);
        System.out.println(tahunproduksi);
    }
    //pemamggilan method static
    public static void main(String[] args) {
        pesawat.ubah();
        pesawat.tampil();
    } 
}