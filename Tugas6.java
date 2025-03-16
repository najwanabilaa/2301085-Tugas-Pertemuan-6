package com.oopjava.tugas6;


class Tugas6 {
    private String nama;
    private final String nim;
    private String jurusan;

    public Tugas6(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getJurusan() {
        return jurusan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
