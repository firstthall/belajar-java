package belajar;

public class kucing extends mamalia {
    public static void main(String[] args) {
        binatang b = new binatang();
        mamalia m = new mamalia();
        kucing k = new kucing();

        System.out.println(m instanceof binatang);
        System.out.println(k instanceof mamalia);
        System.out.println(k instanceof binatang);
    }
    
}
