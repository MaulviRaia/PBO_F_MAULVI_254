import java.util.Scanner;

class Admin {
    private String username = "Admin254";
    private String password = "Password254";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

class Mahasiswa {
    private String nama = "Maulvinazir";
    private String nim = "202410370110254";

    public boolean login(String inputNim) {
        return inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil! Nama: " + nama + ", NIM: " + nim);
    }
}

class LoginSystem {
    private Admin admin;
    private Mahasiswa mahasiswa;

    public LoginSystem() {
        admin = new Admin();
        mahasiswa = new Mahasiswa();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pilih jenis login:");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                loginAsAdmin(scanner);
            } else if (choice.equals("2")) {
                loginAsMahasiswa(scanner);
            } else if (choice.equals("3")) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    private void loginAsAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        if (admin.login(username, password)) {
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