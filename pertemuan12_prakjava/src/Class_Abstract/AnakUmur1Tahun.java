package Class_Abstract;

//Created by 21343050_Heri Ramadhan

public class AnakUmur1Tahun extends Orang{
    public void namaAyahKu() {
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    @Override
    public void makan() {
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum() {
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}
