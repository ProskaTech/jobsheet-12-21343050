package Class_Abstract;

//Created by 21343050_Heri Ramadhan

public class Manusia {
    public static void main(String[] args) {
        //object induk tidak bisa dibuat disini

        //buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();

        //panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahKu();
        System.out.println();
    }
}
