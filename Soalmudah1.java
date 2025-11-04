import java.util.Scanner;


public class Soalmudah1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarak;
        int berat;
        int volume;
        int hargaPerKg;
        int biayaBerat;
        int biayaVolume = 0;
        int totalHarga;

        // 1. Mengambil Input dari Pengguna
        System.out.println("Masukkan Jarak (km):");
        jarak = input.nextInt();

        System.out.println("Masukkan Berat (kg):");
        berat = input.nextInt();

        System.out.println("Masukkan Volume (cm^3):");
        volume = input.nextInt();

        if (jarak <= 10) {
            hargaPerKg = 4250;
        } else {
            hargaPerKg = 6000;
        }
        biayaBerat = hargaPerKg * berat;

        if (volume > 100) {
            biayaVolume = 50000;
        }

        totalHarga = biayaBerat + biayaVolume;

        System.out.println("\n--- Rincian Biaya Pengiriman ---");
        System.out.println("Harga per kg (berdasarkan jarak): Rp " + hargaPerKg);
        System.out.println("Biaya Berat (" + berat + " kg * Rp " + hargaPerKg + "): Rp " + biayaBerat);
        System.out.println("Biaya Tambahan Volume (>100cm^3): Rp " + biayaVolume);
        System.out.println("Total Harga: Rp " + totalHarga);

    }
}