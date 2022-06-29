public class bilangan {
    private int a;
    private int b;

    public bilangan(int a, int b) {
        this.a=a;
        this.b=b;
    }
    public void tampil() {
        System.out.println("Nilai bil.a : "+a);
        System.out.println("Nilai bil.b : "+b);
    }
    //passed by value dengan parameter tipe data primitif
    public void operasi_pass_by_value(int x, int y) {
        x = x*10;
        y = y+15;
    }
    //passed by reference dengan parameter tipe data class
    public void operasi_pass_by_reference(bilangan bil) {
        bil.a = bil.a*10;
        bil.b = bil.b+15;
    }
}
