import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelaminInput = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menentukan jenis kelamin
        String jenisKelamin;
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput == 'P' || jenisKelaminInput == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak Diketahui";
        }

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Umur           : " + umur + " tahun");
    }
}