package playlist;

import java.util.Scanner;

public class ScannerIdentifier{
    public static int inputInt(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            if (scanner.hasNextInt()) { //Check apakah datanya berupa Integer
                int value = scanner.nextInt(); //Identifikasi data ke Int
                scanner.nextLine(); // buang enter
                return value;
            }

            System.out.println("Error: Input harus berupa angka!");
            scanner.nextLine(); // buang input salah
        }
    }

    public static double inputDouble(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            if (scanner.hasNextDouble()) { //Check apakah datanya berupa double
                double value = scanner.nextDouble(); //Identifikasi data ke Double
                scanner.nextLine();// buang enter
                return value; 
            }

            System.out.println("Error: Input harus berupa angka!");
            scanner.nextLine();
        }
    }

    public static String inputString(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            String value = scanner.nextLine().trim(); //Ambil data ketikan

            if (!value.isEmpty()) { //Returnd ata jika data tidak kosong
                return value;
            }

            System.out.println("Error: Input tidak boleh kosong!");
        }
    }
}