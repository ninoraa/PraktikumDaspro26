import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPendanaan;

        System.out.print("Nama mahasiswa        : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainya)       : ");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen (0-4)  : ");
        jumlahDokumen = sc.nextInt();
 if (jumlahDokumen == 4) {
            
            if (jenis.equalsIgnoreCase("BELMAWA")
                    || jenis.equalsIgnoreCase("BAKORMA")
                    || jenis.equalsIgnoreCase("Mandiri")) {

                System.out.print("Peringkat juara (1/2/3, 0 jika bukan juara): ");
                peringkat = sc.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                     System.out.print("Dokumen lengkap dan meraih Juara " + peringkat);
                    System.out.println(". dana penghargaan diberikan");
                   
                } else {
                    System.out.print("Bukan peraih Juara 1, 2, atau 3");
                    System.out.println(". dana penghargaan tidak diberikan");
                    
                }
            } else {
                System.out.println("Jenis kegiatan tidak memenuhi syarat");
                System.out.println(". tidak memperoleh dana penghargaan");
                
            }
        }
    }
}