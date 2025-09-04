package KasirWarungBeras ;

import java.util.Scanner;

public class KasirWarungBeras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Kasir Warung Beras ===");

        // Input jumlah beras
        System.out.print("Masukkan jumlah beras (kg) = ");
        double jumlahKg = input.nextDouble();

        // Input harga per kg
        System.out.print("Masukkan harga per kg (Rp) = ");
        double hargaPerKg = input.nextDouble();

        // Hitung total sebelum diskon
        double total = jumlahKg * hargaPerKg;

        // Hitung diskon 5%
        double diskon = total * 0.05;
        double totalSetelahDiskon = total - diskon;

        System.out.println("\n--- Struk Belanja ---");
        System.out.println("Jumlah beras     : " + jumlahKg + " kg");
        System.out.println("Harga per kg     : Rp " + hargaPerKg);
        System.out.println("Total belanja    : Rp " + total);
        System.out.println("Diskon 5%        : Rp " + diskon);
        System.out.println("Total setelah diskon : Rp " + totalSetelahDiskon);

        // Input uang dari pembeli
        System.out.print("\nMasukkan uang pembeli = Rp ");
        double uangDiterima = input.nextDouble();

        // Hitung kembalian
        if (uangDiterima < totalSetelahDiskon) {
            System.out.println("⚠️ Uang pembeli kurang! Transaksi dibatalkan.");
        } else {
            double kembalian = uangDiterima - totalSetelahDiskon;
            System.out.println("Uang kembalian   : Rp " + kembalian);
        }

        input.close();
    }
}
