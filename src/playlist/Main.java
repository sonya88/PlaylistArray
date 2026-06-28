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
        // Inisialisasi
        Scanner scanner = new Scanner(System.in);
        PlaylistArray playlist = new PlaylistArray();
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
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            // Pemilihan fitur berdasarkan input pengguna
            switch (pilihan) {
                case 1:
                    // Fitur menampilkan semua lagu dalam playlist
                    playlist.tampilkanSemuaLagu();
                    break;

                case 2:
                    // Fitur menambahkan lagu baru ke playlist
                    System.out.print("Masukkan judul lagu : ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan artis : ");
                    String artis = scanner.nextLine();
                    System.out.print("Masukkan durasi (menit) : ");
                    double durasi = scanner.nextDouble();

                    playlist.tambahLagu(new Lagu(judul, artis, durasi));
                    break;

                case 3:
                    // Fitur menghapus lagu berdasarkan judul
                    System.out.print("Masukkan judul lagu yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();

                    playlist.hapusLagu(judulHapus);
                    break;

                case 4:
                    // Fitur mencari lagu berdasarkan judul
                    System.out.print("Masukkan judul lagu yang ingin dicari: ");
                    String judulCari = scanner.nextLine();

                    playlist.cariLagu(judulCari);
                    break;

                case 5:
                    // Fitur mengurutkan lagu berdasarkan durasi
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