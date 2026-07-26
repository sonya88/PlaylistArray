package playlist.utils;

public class NanoToMs {
    // Helper untuk konversi nanosecond ke millisecond
    public static double toMs(long nanoSeconds) {
        return nanoSeconds / 1_000_000.0;
    }
}
