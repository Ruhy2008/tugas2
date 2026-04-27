package com.mycompany.server;

public class Server {
    // 1. Isi Atribut
    String merek;
    int kapasitasRAM; // dalam satuan GB
    double harga;

    // 2. Buat 2 Constructor
    // Constructor Pertama: Menerima semua nilai atribut
    public Server(String merek, int kapasitasRAM, double harga) {
        this.merek = merek;
        this.kapasitasRAM = kapasitasRAM;
        this.harga = harga;
    }

    // Constructor Kedua: Hanya menerima merek dan RAM, harga diatur default
    public Server(String merek, int kapasitasRAM) {
        this.merek = merek;
        this.kapasitasRAM = kapasitasRAM;
        this.harga = 15000000.0; // Harga default
    }

    // 3. Method tanpa nilai balik (menggunakan void)
    public void tampilkanInfo() {
        System.out.println("Merek Server: " + merek);
        System.out.println("Kapasitas RAM: " + kapasitasRAM + " GB");
        System.out.println("Harga: Rp" + harga);
    }

    // 4. Method dengan nilai balik (mengembalikan nilai double)
    public double hitungHargaDiskon(double diskonPersen) {
        double potongan = harga * (diskonPersen / 100);
        return harga - potongan;
    }
}
