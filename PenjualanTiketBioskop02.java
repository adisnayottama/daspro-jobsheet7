import java.util.Scanner;
public class PenjualanTiketBioskop02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hargaTiket = 50000, totalTiket = 0, jumlahTiket;
        double totalJual = 0, totalHarga, diskon, hargaSetelahDiskon;
        String lanjut = "ya";

        do {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            hargaSetelahDiskon = totalHarga - (totalHarga * diskon);
            totalTiket += jumlahTiket;
            totalJual += hargaSetelahDiskon;

            System.out.println("Diskon: " + (diskon*100) + "%");
            System.out.println("Total harga bayar: Rp " + hargaSetelahDiskon);
            System.out.println();
            System.out.print("Apakah ada pelanggan lain? (ya/tidak): ");
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("Penjualan Hari Ini");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalJual);
    }
}