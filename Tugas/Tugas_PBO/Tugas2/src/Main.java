import java.util.Scanner;

class Admin {

    public boolean login(String inputUsername, String inputPassword) {
        String password = "Password254";
        String username = "Admin254";
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

class Mahasiswa {
    private final String nim = "202410370110254";

    public boolean login(String inputNim) {
        return inputNim.equals(nim);
    }

    public void displayInfo() {
        String nama = "Maulvinazir";
        System.out.println("Login berhasil! Nama: " + nama + ", NIM: " + nim);
    }
}

class LoginSystem {
    private final Admin Admin;
    private final Mahasiswa mahasiswa;

    public LoginSystem() {
        Admin = new Admin();
        mahasiswa = new Mahasiswa();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Pilih jenis login:");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    loginAsAdmin(scanner);
                    break;
                case "2":
                    loginAsMahasiswa(scanner);
                    break;
                case "3":
                    System.out.println("Terima kasih! Program selesai.");
                    break label;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }

    private void loginAsAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        if (Admin.login(username, password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private void loginAsMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        if (mahasiswa.login(nim)) {
            mahasiswa.displayInfo();
        } else {
            System.out.println("Login gagal! NIM salah.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.run();
    }
}