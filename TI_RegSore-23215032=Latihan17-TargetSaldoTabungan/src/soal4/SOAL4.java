/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal4;

/**
 *
 * @author 
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : TARGET SALDO TABUNGAN
 */
public class SOAL4 {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 3500000; // Saldo awal Rp 3.500.000
        double bungaPerBulan = 8;   // Bunga per bulan 8%
        double saldoTarget = 6000000; // Saldo target Rp 6.000.000
        
        // Menampilkan informasi awal
        System.out.println("Saldo Awal: Rp " + saldoAwal);
        System.out.println("Bunga per Bulan: " + bungaPerBulan + "%");
        System.out.println("Saldo Target: Rp " + saldoTarget);
        System.out.println();

        // Inisialisasi saldo dan bulan
        double saldo = saldoAwal;
        int bulan = 0;

        // Loop untuk menghitung saldo tiap bulan sampai mencapai atau melebihi target
        while (saldo < saldoTarget) {
            bulan++; // Menambah hitungan bulan
            double bunga = saldo * (bungaPerBulan / 100); // Menghitung bunga bulan ini
            saldo += bunga; // Menambahkan bunga ke saldo

            // Menampilkan saldo pada bulan ini
            System.out.printf("Bulan %d: Saldo = Rp %.0f\n", bulan, saldo);
        }

        // Menampilkan total bulan yang dibutuhkan untuk mencapai saldo target
        System.out.println();
        System.out.println("Total bulan untuk mencapai saldo target: " + bulan);
    }
}
