package playlist;

public class PlaylistArray {

    private Lagu[] playlist = new Lagu[10];
    private int jumlahLagu = 0;

    // Constructor
    public PlaylistArray(){
        playlist[0] = new Lagu("Berapa Kali Kita Akan Saling Memaafkan","Pamungkas",4.44);
        playlist[1] = new Lagu("Kita Buat Menyenangkan","Bernadya",4.09);
        playlist[2] = new Lagu("Yellow","Coldplay",4.10);
        jumlahLagu = 3;
    }
    
    // Menampilkan semua lagu
    public void tampilkanSemuaLagu() {
        System.out.println("=== DAFTAR PLAYLIST ===");
        if(jumlahLagu == 0){
            System.out.println("Playlist kosong.");
            return;
        }
        for(int i = 0; i < jumlahLagu; i++){
            System.out.print((i + 1) + ". ");
            playlist[i].tampilkanInfo();
        }
    }
    
    // Mencari lagu berdasarkan judul menggunakan Linear Search
    public void cariLagu(String judulCari){
        boolean ditemukan = false;
        for(int i = 0; i < jumlahLagu; i++){
            if(playlist[i].getJudul().equalsIgnoreCase(judulCari)){
                System.out.println("Lagu ditemukan:");
                playlist[i].tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if(!ditemukan){
            System.out.println("Lagu \"" + judulCari + "\" tidak ditemukan.");
        }
    }

    // ==================== TAMBAHAN PACKAGE 3 ====================

    // 1 & 2. Implementasi Insertion & Cek apakah playlist penuh
    public void tambahLagu(Lagu laguBaru) {
        if (jumlahLagu >= playlist.length) {
            System.out.println("Gagal menambah lagu: Playlist sudah penuh! (Maksimal 10 lagu)");
            return;
        }
        
        playlist[jumlahLagu] = laguBaru;
        jumlahLagu++;
        System.out.println("Lagu \"" + laguBaru.getJudul() + "\" berhasil ditambahkan.");
    }

    // 3 & 4. Implementasi Deletion & Geser elemen agar tetap rapat
    public void hapusLagu(String judulHapus) {
        int indeksKetemu = -1;

        // Cari indeks lagu yang akan dihapus
        for (int i = 0; i < jumlahLagu; i++) {
            if (playlist[i].getJudul().equalsIgnoreCase(judulHapus)) {
                indeksKetemu = i;
                break;
            }
        }

        // Jika lagu tidak ditemukan
        if (indeksKetemu == -1) {
            System.out.println("Gagal menghapus: Lagu \"" + judulHapus + "\" tidak ditemukan.");
            return;
        }

        // Proses pergeseran elemen (Shifting) ke kiri
        for (int i = indeksKetemu; i < jumlahLagu - 1; i++) {
            playlist[i] = playlist[i + 1];
        }

        playlist[jumlahLagu - 1] = null; // Hapus referensi elemen terakhir
        jumlahLagu--; // Kurangi jumlah total lagu
        System.out.println("Lagu \"" + judulHapus + "\" berhasil dihapus.");
    }
}