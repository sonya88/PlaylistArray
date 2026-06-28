package playlist;

public class Main {

    public static void main(String[] args) {

        PlaylistArray playlist = new PlaylistArray();

        System.out.println("--- Kondisi Awal ---");
        System.out.println("Test repo");
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