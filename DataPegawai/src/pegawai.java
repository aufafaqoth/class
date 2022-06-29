/*  Aufa Salsabila Nahrowi
    20102040
    IF-08-L*/

public class pegawai {
    //atributes
    private int nip;
    private String namaLengkap;
    private String alamat;
    private int jmlHariLembur;
    private long gajiPokok;
    private double totalGaji;

    //methods
    public pegawai() {
        //constractor
        System.out.println("Konstruktor pegawai dijalankan");
    }    
    //fingsi-fungsi mutator
    public void setNip(int Nip) {
        nip = Nip;
    }
    public void setNama(String Nama) {
        namaLengkap = Nama;  
    }
    public void setAlamat(String Alamat) {
        alamat = Alamat;
    }
    // fungsi-fungsi accsesor
    public int getNip() {
        return nip;
    }
    
    public String getNama() {
        return namaLengkap;
    }
    
    public String getAlamat() {
        return alamat;
    }
    // method overload
    public void setgajiPokok(long gaji_Pokok, int Jml_HariLembur) {
        gajiPokok = gaji_Pokok;
        jmlHariLembur = Jml_HariLembur;
        totalGaji = gaji_Pokok + (gaji_Pokok * Jml_HariLembur * 0.01);
    }
    
    public void setgajiPokok(int Jml_HariLembur) {
        gajiPokok = 2000000;
        jmlHariLembur = Jml_HariLembur;
        totalGaji = gajiPokok + (gajiPokok * Jml_HariLembur * 0.01);
    }
    
    public void cetak() {
        System.out.println("NIP\t: " + getNip());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Gaji pokok\t: Rp." + gajiPokok);
        System.out.println("Jumlah jam lembur\t: " + jmlHariLembur + " jam");
        System.out.println("Total gaji\t: RP." + (int)totalGaji);
    }
}
