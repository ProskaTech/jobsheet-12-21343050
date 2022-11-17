package Polymorphism_Dynamic;

//Created by 21343050_Heri Ramadhan

public class polymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tinkat Suku Bunga Mandiri adalah: " + B.sukuBunga());
    }
}
