package com.oopjava.tugas6;


class Tugas6 {
    private double alas;
    private double tinggi;
    private double sisi;

    public Tugas6() {
        this.alas = 0;
        this.tinggi = 0;
        this.sisi = 0;
    }

    public Tugas6(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }
    
    public double getLuas() {
        return (alas * tinggi) / 2;
    }
    
    public double getKeliling() {
        return alas + tinggi + sisi;
    }
}
