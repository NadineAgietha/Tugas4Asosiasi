// File: MainAsosiasi.java
package src.tugas4;

public class MainAsosiasi {
    public static void main(String[] args) {
        Dokter dokter = new Dokter("Dr. Surya");
        Pasien pasien = new Pasien("Sulaiman");

        dokter.periksa(pasien);
    }
}