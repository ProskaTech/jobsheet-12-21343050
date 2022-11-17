package Polymorphism_Static;

//Created by 21343050_Heri Ramadhan

public class CompileTime {
    // method keliling dengan single argumen
    static int keliling(int a) {
        return 4 * a;
    }

    // method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b) {
        return 2 * (l + b);
    }
}
