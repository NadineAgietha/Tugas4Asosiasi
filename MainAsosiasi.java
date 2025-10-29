// File: MainAsosiasi.java
package src.tugas4;

public class MainAsosiasi {
    public static void main(String[] args) {
        Dokter dokter = new Dokter("Dr. Sinta");
        Pasien pasien = new Pasien("Adi");

        dokter.periksa(pasien);
    }
}