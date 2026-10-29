import java.util.Scanner;

public class Tugas329 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = scanner.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1! Silakan coba lagi.");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int maxBarangToko = -1;
        int tokoTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                jumlahPelanggan = scanner.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barangPelanggan;
                do {
                    System.out.print("  - Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    barangPelanggan = scanner.nextInt();
                    if (barangPelanggan < 0) {
                        System.out.println("  - Jumlah barang tidak boleh negatif!");
                    }
                } while (barangPelanggan < 0);

                totalBarangTokoIni += barangPelanggan;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangTokoIni);

            totalBarangSeluruhToko += totalBarangTokoIni;

            if (totalBarangTokoIni > maxBarangToko) {
                maxBarangToko = totalBarangTokoIni;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\n--- Ringkasan yang Diharapkan ---");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        scanner.close();
    }
}