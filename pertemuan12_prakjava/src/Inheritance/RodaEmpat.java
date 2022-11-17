package Inheritance;

//Created by 21343050_Heri Ramadhan

public class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8; // 1 kali
    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp. " + hargaDasar);
    }
}
