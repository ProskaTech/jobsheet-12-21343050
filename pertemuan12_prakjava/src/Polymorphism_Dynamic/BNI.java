package Polymorphism_Dynamic;

//Created by 21343050_Heri Ramadhan

public class BNI extends Bank{
    //overriding sukuBunga method
    float sukuBunga() {
        return 10.6f;
    }
}
class Mandiri extends Bank {
    // overriding suku bunga method
    float sukuBunga() {
        return 9.4f;
    }
}
