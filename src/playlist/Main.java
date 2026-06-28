package playlist;

/*
 * TUGAS KELOMPOK 1
 * Nama :
 * 1. MUHAMMAD RIZAL MUTAQIEN - 2902795205
 * 2. SONYA BR SINAGA - 2902763046
 * 3. KEVIN HANDOKO - 2902770871
 * 4. IHSAN MUHAMMAD IQBAL - 2902790545
 * 5. MUHAMMAD ASHRAF MUTAWALLY - 2902787670
 * 
 * Kelas : LVCA - LEC
 * COSC6025036 - Data Structures and Algorithm Analysis
 */

public class Main {

    public static void main(String[] args) {

        PlaylistArray playlist = new PlaylistArray();

        System.out.println("--- Kondisi Awal ---");
        playlist.tampilkanSemuaLagu();
        System.out.println();

        // 1. Test Insertion (Tambah Lagu)
        System.out.println("--- Test Tambah Lagu ---");
        playlist.tambahLagu(new Lagu("Komang", "Raim Laode", 3.42));
        playlist.tambahLagu(new Lagu("Sial", "Mahalini", 4.03));
        playlist.tampilkanSemuaLagu();
        System.out.println();

        // 2. Test Deletion (Hapus Lagu di tengah untuk cek pergeseran)
        System.out.println("--- Test Hapus Lagu (Yellow) ---");
        playlist.hapusLagu("Yellow");
        playlist.tampilkanSemuaLagu();
        System.out.println();
        
        // 3. Test Hapus Lagu yang tidak ada
        System.out.println("--- Test Hapus Lagu Tidak Valid ---");
        playlist.hapusLagu("Hati-Hati di Jalan");
    }
}