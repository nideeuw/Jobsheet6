import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        
        int ukuran;
        String merk, kategori;
        int harga = 0;

        System.out.println("Merk sepatu :");
        System.out.println("-> Converse");
        System.out.println("-> Sketcher");
        System.out.println("-> Nike");
        System.out.print("Masukkan merek sepatu: ");
        merk = input17.nextLine();
        System.out.println("----------------------------");
        System.out.println("Pilih Kategori sepatu");
        System.out.println("-> Converse :  slip on/hightop");
        System.out.println("-> Sketcher :  woman/man");
        System.out.println("-> Nike     :  kids/adult");
        System.out.print("Masukkan kategori sepatu: ");
        kategori = input17.nextLine();
        System.out.println("----------------------------");
        System.out.println("Pilih Ukuran sepatu");
        System.out.println("-> Slip on = 36 - 40");
        System.out.println("-> High top = 40 - 44");
        System.out.println("-> Woman = 36 - 41");
        System.out.println("-> Man = 41 - 44");
        System.out.println("-> Kids = 36 - 40");
        System.out.println("-> Adult = 40 - 44");
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input17.nextInt();

        
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        }
        
        if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        }
        
        if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }
        
        if (harga > 0) {
            System.out.println("Harganya adalah: Rp " + harga);
        } else {
            System.out.println("Gak dijual bang");
        }
    }
}