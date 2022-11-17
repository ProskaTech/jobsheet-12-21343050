package Abstraction_Interface;

//Created by 21343050_Heri Ramadhan

class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari() {
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
