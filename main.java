package com.oopjava.tugas6;

public class main {
    public static void main(String[] args) {
        Tugas6 segitiga1 = new Tugas6(1, 1, 1);
        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());

        Tugas6 segitiga2 = new Tugas6(30, 10, 30);
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());

        Tugas6 segitiga3 = new Tugas6(20, 10, 60);
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}
