package tugas_java;
import java.util.Scanner;
public class Tugas_perpustakaan {
static Scanner input = new Scanner(System.in);
static String nama[] = new String[50];
static int mhs[][] = new int[50][5];
static int buku1[][] = new int[50][2];
static String buku2[][] = new String[50][2];
static int peminjam[][] =  new int[50][2];
static int banyak;
static int jmlpinjam;    
//static int 
static int jmlmhs;
public static void main(String[] args) {
char back;
int pilih;
do
{
System.out.println("\t\t\t*** SMKN 4 PAYAKUMBUH ***");
System.out.println("\t\t\t-- MENU UTAMA --");
System.out.println("1. Input Buku");
System.out.println("2. Daftar Buku");
System.out.println("3. Pencarian");
System.out.println("4. Peminjaman");            
System.out.println("5. Pengembalian");
System.out.println("6. Keluar\n");
System.out.print("Masukkan Pilihan : ");
pilih = input.nextInt();
switch(pilih)
{
case 1:inputBuku();break;
case 2:System.out.println("\t\t\t-- DAFTAR BUKU --\n");daftarBuku();break;
case 3:cari();break;
case 4:pinjamBuku();break;
case 5:pengembalian();break;
case 6:System.out.println("Anda telah keluar program !");break;
default:System.out.println("Anda memasukan pilihan yang salah !");
}
if(pilih == 6)
{
back ='T';
}
else
{
System.out.print("\n\nKembali ke Menu Utama ? [Y/T] : ");
back = input.next().charAt(0);  
System.out.println("-----------------------------------------------------------------");
}   
}
while(back != 'T');
}
public static void inputBuku(){
System.out.println("\t\t\t-- INPUT BUKU --");
int jml,no=1;
System.out.print("Masukan jumlah buku : ");
jml = input.nextInt();        
for(int i = banyak;i < banyak+jml;i++)
{
System.out.println("Buku ke "+no);
System.out.print("Kode Buku : ");buku1[i][0] = input.nextInt();
input.nextLine();
System.out.print("Judul Buku : ");buku2[i][0] = input.nextLine();
System.out.print("Pengarang : ");buku2[i][1] = input.nextLine();
System.out.print("Tahun Terbit : ");buku1[i][1] = input.nextInt(); 
no++;
}
banyak+=jml;
System.out.print("Buku berhasil disimpan !");
}
public static void daftarBuku(){
System.out.println("Kode     Judul     Pengarang     Tahun");
System.out.println("=============================================");
int tkode,ttahun;
String tjudul,tpengarang;
for(int i = 0;i < banyak;i++)
{
for(int j=i+1;j < banyak;j++)
{
if(buku1[i][0] > buku1[j][0])
{
tkode = buku1[i][0];
buku1[i][0] = buku1[j][0];
buku1[j][0] = tkode;
ttahun = buku1[i][1];
buku1[i][1] = buku1[j][1];
buku1[j][1] = ttahun;
tjudul = buku2[i][0];
buku2[i][0] = buku2[j][0];
buku2[j][0] = tjudul;
tpengarang = buku2[i][1];
buku2[i][1] = buku2[j][1];
buku2[j][1] = tpengarang;
}
}
System.out.println(buku1[i][0]+"     "+buku2[i][0]+"     "+buku2[i][1]+"     "+buku1[i][1]);
}
}
public static void pinjamBuku(){
System.out.println("\t\t\t-- PINJAM BUKU --");
daftarBuku();
int jml,no=1;
input.nextLine();
System.out.print("Masukan Nama Siswa : ");nama[jmlmhs] = input.nextLine();
System.out.print("NISN : ");mhs[jmlmhs][0]= input.nextInt();
System.out.println("1. Jurusan PPLG");
System.out.println("2. Jurusan TJKT");
System.out.println("3. Jurusan DKV");
System.out.println("4. Jurusan BC");
System.out.print("Jurusan : ");mhs[jmlmhs][1] = input.nextInt();
String pesan = "";
do
{
System.out.print("Masukan Tanggal Pinjam [1-31] : ");mhs[jmlmhs][2] = input.nextInt();
if(mhs[jmlmhs][2] <= 0 || mhs[jmlmhs][2] > 31)
{
System.out.println("Tanggal Salah !");
}   
}
while(mhs[jmlmhs][2] <= 0 || mhs[jmlmhs][2] > 31);
if(mhs[jmlmhs][2] < 25)
{
mhs[jmlmhs][3] = (mhs[jmlmhs][2])+7;
}
else
{
mhs[jmlmhs][3] = ((mhs[jmlmhs][2])+7) - 30;
}
System.out.print("Masukan Jumlah Buku yg dipinjam : ");
jml = input.nextInt();
for(int i = jmlpinjam;i < jmlpinjam+jml;i++)
{
System.out.println("Buku Ke-"+no);
System.out.print("Masukan kode buku : ");
peminjam[i][0] = input.nextInt();
for(int j = 0;j < banyak;j++)
{
mhs[jmlmhs][4] = jml;
if(peminjam[i][0] == buku1[j][0])
{
System.out.println("Anda meminjam "+buku2[j][0]);
pesan = "";
break;
}
else
{
pesan = "kode buku tidak tersedia\n";
}
System.out.print(pesan);
}
no++;
peminjam[i][1] = mhs[jmlmhs][0];   
}
jmlpinjam+=jml;
jmlmhs = jmlmhs+1;
}
public static void pengembalian(){
if(jmlpinjam == 0)
{
System.out.println("\tBelum ada yang meminjam buku...");
}
else
{
System.out.print("NISN     ");
System.out.print("Siswa     ");
System.out.print("Jurusan      ");
System.out.print("BanyakPinjam      ");
System.out.print("Tgl      ");
System.out.println("Kembali   ");
System.out.println("==============================");        
for(int i=0;i< jmlmhs;i++)
{
System.out.print(mhs[i][0]+"      ");
System.out.print(nama[i]+"       ");
if(mhs[i][1] == 1)
{
System.out.print("J. PPLG");
}
else if(mhs[i][1] == 2)
{
System.out.print("J. TJKT");
}
else if(mhs[i][1] == 3)
{
System.out.print("J. DKV");
}
else
{
System.out.print("J. BC");
}
System.out.print("   "+mhs[i][4]+" buku       ");
System.out.print(mhs[i][2]+"      ");
System.out.println(mhs[i][3]+"      ");
}
int npm;
int ts;
System.out.println("\nMasukan NISN\t: ");npm = input.nextInt();
for(int i = 0; i < jmlmhs; i++)
{
if(npm == mhs[i][0])
{
do
{
System.out.print("\tMasukan Tanggal Sekarang [1-31]\t: ");ts = input.nextInt();
if(ts <= 0 || ts > 31)
{
System.out.print("\tTanggal salah !\n");
}
}
while(ts <= 0 || ts > 31);
if(ts > mhs[i][3])
{
System.out.println("\tAnda didenda Rp. 500 karena telat mengembalikan");
}
for(int j = 0; j < jmlpinjam; j++)
{
if(peminjam[j][1] == mhs[i][0])
{
if(mhs[jmlmhs-1][0] == npm)
{
jmlmhs-=1;
break;
}
else
{
for(int x=0;x < jmlmhs; x++)
{
mhs[x][0] = mhs[x+1][0];
nama[x] = nama[x+1];
mhs[x][1] = mhs[x+1][1];
mhs[x][2] = mhs[x+1][2];                    
mhs[x][3] = mhs[x+1][3];
mhs[x][4] = mhs[x+1][4];
peminjam[j][1] = peminjam[j+1][1];
peminjam[j][0] = peminjam[j+1][0];
}
jmlmhs-=1;
break;
}
}
}
System.out.print("\tSilahkan kembalikan buku yang anda pinjam..");
}
}
}
}
public static void cari()
{
int pilih2;
char jawab;
do{         
System.out.println("\n\t\tCARI BUKU BERDASARKAN :");
System.out.println("\t1. Kode Buku");
System.out.println("\t2. Pengarang");
System.out.print("\tMasukan pilihan anda\t: ");pilih2 = input.nextInt();
switch(pilih2)
{
case 1:{
int kode,a=0;
String pesan = "";
System.out.print("\tMasukan Kode Buku\t: ");kode = input.nextInt();
System.out.println("\tHASIL PENCARIAN\t: ");
for(int i=0;i<banyak;i++)
{
if(buku1[i][0] == kode)
{
System.out.println("\tKode Buku\t: "+buku1[i][0]);
System.out.println("\tJudul Buku\t: "+buku2[i][0]);
System.out.println("\tNama Pengarang\t: "+buku2[i][1]);
pesan="";
break;
}
else
{
pesan="\tBuku yang anda cari tidak ditemukan!";
}
}
System.out.print(pesan);
break;
}
case 2: {
String karangan;
String pesan = "";
input.nextLine();
System.out.print("\tMasukan Nama Pengarang\t: ");karangan = input.nextLine();
System.out.println("\tHASIL PENCARIAN\t: ");
for(int i= 0;i<banyak;i++)
{
if(buku2[i][1].equalsIgnoreCase(karangan))
{
System.out.println("\t Kode Buku\t: "+buku1[i][0]);
System.out.println("\tJudul Buku\t: "+ buku2[i][0]);
System.out.println("\tNama Pengarang\t: "+buku2[i][1]);
pesan="";
break;
}
else
{
pesan="\tBuku yang anda cari tidak ditemukan!";
}
}
System.out.print(pesan);
break;
}
}
System.out.print("\n\tUlangi Pencarian ? [Y/T] : ");jawab = input.next().charAt(0);
}
while(jawab =='y' || jawab == 'Y');
}   
}

