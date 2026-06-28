package playlist;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in); // Inisialisasi Scanner dan input dari User
        PlaylistArray playlist = new PlaylistArray(); //Membuat Array untuk Playlist Lagu
        int pilihan;

        // Perulangan menu utama menggunakan do-while
        do {
            // Menampilkan menu pilihan
            System.out.println("=== MENU PLAYLIST MUSIK ===");
            System.out.println("1. Tampilkan semua lagu");
            System.out.println("2. Tambah lagu baru");
            System.out.println("3. Hapus lagu berdasarkan judul");
            System.out.println("4. Cari lagu berdasarkan judul");
            System.out.println("5. Urutkan berdasarkan durasi");
            System.out.println("6. Keluar");

            pilihan = ScannerIdentifier.inputInt(scanner, "Pilih menu: ");

            // Pemilihan fitur berdasarkan input pengguna
            switch (pilihan) {
                case 1:
                    // Fitur menampilkan semua lagu dalam playlist
                    playlist.tampilkanSemuaLagu();
                    break;

                case 2:
                    // Fitur menambahkan lagu baru ke playlist
                    String judul = ScannerIdentifier.inputString(scanner, "Masukkan judul lagu : ");
                    String artis = ScannerIdentifier.inputString(scanner, "Masukkan artis : ");
                    double durasi = ScannerIdentifier.inputDouble(scanner, "Masukkan durasi (menit) : ");

                    playlist.tambahLagu(new Lagu(judul, artis, durasi));
                    break;

                case 3:
                    // Fitur menghapus lagu berdasarkan judul
                    String judulHapus = ScannerIdentifier.inputString(scanner, "Masukkan judul lagu yang ingin dihapus: ");

                    playlist.hapusLagu(judulHapus);
                    break;

                case 4:
                    // Fitur mencari lagu berdasarkan judul
                    String judulCari = ScannerIdentifier.inputString(scanner, "Masukkan judul lagu yang ingin dicari: ");

                    playlist.cariLagu(judulCari);
                    break;

                case 5:
                    // Fitur mengurutkan lagu berdasarkan durasi
                    playlist.urutkanLaguDenganBubbleSort();
                    break;

                case 6:
                    // Keluar dari program
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println();
        } while (pilihan != 6);

        scanner.close();
    }
}