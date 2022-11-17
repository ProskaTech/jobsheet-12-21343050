package Inheritance;

//Created by 21343050_Heri Ramadhan

public class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20; //0.2kali
    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp. " + hargaDasar);
    }
}
