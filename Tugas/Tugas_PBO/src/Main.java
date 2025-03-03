//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        //data admin
        String username = "Admin254";
        String password = "Password254";

        //data mahasiswa
        String nama = "Maulvinazir Achmad Indraraia";
        String nim = "202410370110254";

        System.out.println("Pilih Login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int pilihan;
        if (objInput.hasNextInt()) {
            pilihan = objInput.nextInt();
            objInput.nextLine();
        }else {
            System.out.println("Pilihan Tidak Valid");
            objInput.close();
            return;
        }

        if (pilihan == 1) {
            while (true) {
                System.out.print("Masukkan Username: ");
                String inputUsername = objInput.nextLine();
                System.out.print("Masukkan Password: ");
                String inputPassword = objInput.nextLine();
                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    System.out.print("Login Berhasil");
                    break;
                }else{
                    System.out.println("Login Gagal! Username And Password Salah");
                }
            }
        }else if (pilihan == 2) {
            while (true) {
                System.out.print("Masukkan Nama: ");
                String inputNama = objInput.nextLine();
                System.out.print("Masukkan Nim: ");
                String inputNim = objInput.nextLine();
                if (inputNama.equals(nama) && inputNim.equals(nim)) {
                    System.out.println("Login Mahasiswa Berhasil!");
                    System.out.println("Nama: "+ inputNama);
                    System.out.println("Nim: "+ inputNim);
                    break;
                }else{
                    System.out.println("Login Gagal! Nama atau NIM Salah");
                }
            }
        } else {
            System.out.println("Inputan Tidak Valid, Mohon Masukkan Angka 1 Atau 2");
        }
        objInput.close();
    }
}