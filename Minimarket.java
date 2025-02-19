        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        
        public class Minimarket {
            public static void main(String[] args) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                
                String[] produk = {"Beras", "Gula", "Garam", "Minyak Goreng", "Telur", "Gas"};
                double[] harga = {15000.0, 8000.0, 10000.0, 20000.0, 12000.0, 20000.0};
                
                System.out.println("Selamat datang di Minimarket nitnut");
                System.out.println("Berikut adalah daftar produk yang tersedia:");
                System.out.println("-------------------------------------");
                // Menampilkan daftar produk
                for (int i = 0; i < produk.length; i++) {
                    System.out.println((i + 1) + ". " + produk[i] + " - Harga: Rp " + harga[i]);
                }
                
                double totalHarga = 0.0;
                boolean belanjaLagi = true;
        
                while (belanjaLagi) {
                    try {
                        System.out.println("-------------------------------------");
                        System.out.print("Masukkan nomor produk yang ingin dibeli (1-6): ");
                        int pilihan = Integer.parseInt(reader.readLine());
                        System.out.print("Masukkan jumlah yang ingin dibeli: ");
                        int jumlah = Integer.parseInt(reader.readLine());
        
                        if (pilihan >= 1 && pilihan <= 6) {
                            totalHarga += harga[pilihan - 1] * jumlah;
                        } else {
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                            continue;
                        }
        
                        System.out.print("Apakah Anda ingin membeli produk lain? (yes/no): ");
                        String jawab = reader.readLine();
                        if (jawab.equalsIgnoreCase("no")) {
                            belanjaLagi = false;
                        }
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid. Harap masukkan angka.");
                    }
                }
        
                // Menghitung diskon
                double diskon = 0.0;
                if (totalHarga > 50000) { //diskon 10% jika total belanja lebih dari Rp 50.000
                    diskon = totalHarga * 0.10;
                }
        
                double totalAkhir = totalHarga - diskon;
        
                System.out.println("Total belanja Anda: Rp " + totalHarga);
                System.out.println("Diskon: Rp " + diskon);
                System.out.println("Total setelah diskon: Rp " + totalAkhir);
        
                // Meminta uang dari pengguna
                try {
                    System.out.print("Masukkan jumlah uang yang tersedia: Rp ");
                    double uang = Double.parseDouble(reader.readLine());
        
                    if (uang >= totalAkhir) {
                        System.out.println("Transaksi berhasil! Kembalian Anda: Rp " + (uang - totalAkhir));
                    } else {
                        System.out.println("Uang Anda tidak cukup. Total belanja: Rp " + totalAkhir);
                    }
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                }
        
                System.out.println("Terima kasih telah berbelanja di Minimarket nitnut");
            }
        }


