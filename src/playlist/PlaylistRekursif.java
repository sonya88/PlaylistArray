package playlist;

import playlist.utils.NanoToMs;

public class PlaylistRekursif {

    /**
     * ============================================================
     * Fungsi : totalDurasi
     * Tujuan : Menghitung total durasi seluruh lagu dalam playlist secara rekursif.
     *
     * Base Case :
     * Jika n == 0, berarti tidak ada lagu lagi yang dijumlahkan,
     * sehingga mengembalikan nilai 0.
     *
     * Recursive Case :
     * Menjumlahkan durasi lagu ke-(n-1) dengan hasil rekursif
     * dari n-1 lagu sebelumnya.
     *
     * Kompleksitas Waktu :
     * O(n)
     * ============================================================
     */
    public static double totalDurasi(Lagu[] list, int n) {
        if (n == 0) {
            return 0;
        }

        return list[n - 1].getDurasi() + totalDurasi(list, n - 1);
    }

    /**
     * Wrapper untuk menghitung total durasi sekaligus mengukur waktu eksekusi.
     */
    public static void hitungTotalDurasi(Lagu[] list, int n) {
        long start = System.nanoTime();

        double total = totalDurasi(list, n);

        long finish = System.nanoTime();

        System.out.printf("Total Durasi Playlist : %.2f menit%n", total);
        System.out.printf("Waktu Eksekusi Rekursif : %.6f ms%n",
                NanoToMs.toMs(finish - start));
    }

    /**
     * ============================================================
     * Fungsi : tampilkanMundur
     * Tujuan : Menampilkan seluruh lagu dari indeks terakhir menuju pertama
     * menggunakan rekursi.
     *
     * Base Case :
     * Jika index < 0 maka proses selesai.
     *
     * Recursive Case :
     * Menampilkan lagu pada index saat ini kemudian
     * memanggil dirinya dengan index-1.
     *
     * Kompleksitas Waktu :
     * O(n)
     * ============================================================
     */
    public static void tampilkanMundur(Lagu[] list, int index) {
        if (index < 0) {
            return;
        }
        
        list[index].tampilkanInfo();
        tampilkanMundur(list, index - 1);
    }

    /**
     * Wrapper untuk menampilkan playlist secara mundur sekaligus
     * mengukur waktu eksekusi.
     */
    public static void tampilkanMundurDenganWaktu(Lagu[] list, int index) {
        long start = System.nanoTime();

        System.out.println("Daftar Lagu (Terbalik) : ");
        tampilkanMundur(list, index);

        long finish = System.nanoTime();

        System.out.printf("Waktu Eksekusi Rekursif : %.6f ms%n",
                NanoToMs.toMs(finish - start));
    }

    /**
     * ============================================================
     * Fungsi : cariDurasiTerpanjang
     * Tujuan : Mencari nilai durasi lagu paling panjang secara rekursif.
     *
     * Base Case :
     * Jika index == 0 maka durasi terpanjang adalah lagu pertama.
     *
     * Recursive Case :
     * Membandingkan durasi lagu saat ini dengan hasil rekursif
     * dari indeks sebelumnya.
     *
     * Kompleksitas Waktu :
     * O(n)
     * ============================================================
     */
    public static double cariDurasiTerpanjang(Lagu[] list, int index) {
        if (index == 0) {
            return list[0].getDurasi();
        }

        double maksimum = cariDurasiTerpanjang(list, index - 1);

        return Math.max(list[index].getDurasi(), maksimum);
    }

    /**
     * Wrapper untuk mencari durasi terpanjang sekaligus mengukur waktu.
     */
    public static void tampilkanDurasiTerpanjang(Lagu[] list, int n) {

        if (n == 0) {
            System.out.println("Playlist kosong.");
            return;
        }

        long start = System.nanoTime();

        double maksimum = cariDurasiTerpanjang(list, n - 1);

        long finish = System.nanoTime();

        System.out.printf("Durasi Lagu Terpanjang : %.2f menit%n", maksimum);
        System.out.printf("Waktu Eksekusi Rekursif : %.6f ms%n",
                NanoToMs.toMs(finish - start));
    }

}