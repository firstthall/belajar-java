public class latihan3 {
    //Menggunakan operator logika
    public static void main(String[] args) {
        int A = 70;
        int B = 80;
        int C = 90;
        boolean a = A > B && B < C || C < B;
        boolean b = A < B || B < C && C < B;
        System.out.println(a);
        System.out.println(b);
    }
}
