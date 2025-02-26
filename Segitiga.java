package tugas_java.com.tugas;

public class Segitiga extends bangunDatar {
    int alas;
    int tinggi;
 
     public Segitiga(int alas, int tinggi) {
         this.alas = alas;
         this.tinggi = tinggi;
     }

     @Override
     public float luas() {
        return this.alas * this.tinggi;
     }
}
