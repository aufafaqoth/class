public class App {
    public static void main(String[] args) throws Exception {
        pegawai a,b;
        
        a = new pegawai();
        a.setNip(5654322);
        a.setNama("Aufa");
        a.setAlamat("Indramayu");
        a.setgajiPokok(3000000, 4);
        a.cetak();
        System.out.println();

        b = new pegawai();
        b.setNip(8765449);
        b.setNama("Salma");
        b.setAlamat("Jakarta");
        b.setgajiPokok(5000000, 5);
        b.cetak();
    }  
}
