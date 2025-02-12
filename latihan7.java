import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan7 {
    public static void main(String[] args) throws IOException{
        String nama; 
        int ID;


        //Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat objek BufferedReader
        BufferedReader br = new BufferedReader(isr);
        //Mengisi variabel nama dengan BufferedReader
        System.out.print("Inputkan nama Anda : ");
        nama = br.readLine();
        System.out.print("Masukkan usia Anda : ");
        ID = Integer.parseInt(br.readLine());
        //Tampilkan ouput isi variabel nama
        System.out.println("\nNama anda adalah " + nama);
        System.out.println( nama + " berusia " + ID);
        
        

    }
    
}
