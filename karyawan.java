package belajar;

public class karyawan extends orang {
    float salary = 4000f;
    String nama = "Budi";
    int umur = 78;

    public karyawan(String string, int i, float f) {

    }
    public void showInfo(){ 
        System.out.println("nama: " + this.nama);
        System.out.println("umur: " + this.umur);
        System.out.println("salary: $" + salary);
    }
    
}
