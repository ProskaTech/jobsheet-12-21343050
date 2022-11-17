package Inheritance;

//Created by 21343050_Heri Ramadhan

public class JavaInheritance {
    public static void main(String[] args) {
        //membuat objek roda dua
        RodaDua sepeda = new RodaDua();
        //membuah objek roda empat
        RodaEmpat mobil = new RodaEmpat();

        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();

        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
