// File: Dokter.java
package src.tugas4;

public class Dokter {
    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }

    public void periksa(Pasien p) {
        System.out.println("Dokter " + nama + " sedang memeriksa pasien " + p.getNama());
    }
}