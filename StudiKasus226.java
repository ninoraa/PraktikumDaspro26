import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen (0-4) : ");
        jumlahDokumen = sc.nextInt();

    

        if (jumlahDokumen == 4) {

            if (jenis.equalsIgnoreCase("BELMAWA")
                    || jenis.equalsIgnoreCase("BAKORMA")
                    || jenis.equalsIgnoreCase("Mandiri")) {

                System.out.print("Peringkat juara (1/2/3, 0 jika bukan juara): ");
                peringkat = sc.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.print("Dokumen lengkap dan meraih Juara " + peringkat);
                    System.out.println(". Dana penghargaan diberikan");
                } else {
                    System.out.print("Bukan peraih Juara 1, 2, atau 3");
                    System.out.println(". Dana penghargaan tidak diberikan");
                }

            } else if (jenis.equalsIgnoreCase("PKM")) {

                System.out.print("Status pendanaan (1 = lolos, 0 = tidak): ");
                statusPendanaan = sc.nextInt();

                if (statusPendanaan == 1) {
                    System.out.print("Lolos pendanaan PKM");
                    System.out.println(". Dana penghargaan diberikan");
                } else {
                    System.out.print("Tidak lolos pendanaan PKM");
                    System.out.println(". Dana penghargaan tidak diberikan");
                }

            } else {
                System.out.print("Kegiatan kategori Lainnya");
                System.out.println(". Dana penghargaan tidak diberikan");
            }

        } else {
            System.out.print("Dokumen tidak lengkap, kurang " + (4 - jumlahDokumen) + " dokumen");
            System.out.println(". Dana penghargaan tidak diberikan");
        }

        sc.close();
    }
}