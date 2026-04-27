package com.mycompany.server;


    
public class main {
    public static void main(String[] args) {
        
        // Membuat Object menggunakan Constructor Pertama (Lengkap)
        System.out.println("--- Data Server Utama ---");
        Server serverUtama = new Server("Dell PowerEdge", 64, 45000000.0);
        serverUtama.tampilkanInfo(); // Memanggil method tanpa nilai balik
        
        // Memanggil method dengan nilai balik
        double hargaDiskonUtama = serverUtama.hitungHargaDiskon(10); 
        System.out.println("Harga setelah diskon 10%: Rp" + hargaDiskonUtama);
        System.out.println("-------------------------\n");

        
        // Membuat Object menggunakan Constructor Kedua (Harga Default)
        System.out.println("--- Data Server Backup ---");
        Server serverBackup = new Server("HP ProLiant", 32);
        serverBackup.tampilkanInfo(); // Memanggil method tanpa nilai balik
        
        // Memanggil method dengan nilai balik
        double hargaDiskonBackup = serverBackup.hitungHargaDiskon(5);
        System.out.println("Harga setelah diskon 5%: Rp" + hargaDiskonBackup);
        System.out.println("-------------------------");
    }
}
