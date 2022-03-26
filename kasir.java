package buj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class kasir {

    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);


    static void welcom() {
        System.out.println("Selamat Datang di Sistem Kasir");
    }

    static String welcom1() {
        return "Silahkan memilih barang yang tertera ";
    }

    static void showbrg() throws IOException {
        minyakgoreng mgr = new minyakgoreng();
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("========= List Barang ========");
        System.out.println("[1] Minyak Goreng");
        System.out.println("[2] Roti Tawar");
        System.out.println("[3] ?");
        System.out.println("[4] ?");
        System.out.print("PILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch (selectedMenu) {
            case 1:
                mgr.minyak("Minyak Goreng", 24);
                System.out.print("Berapa banyak barang yang adan inginkan: ");
                int pilihan = sc.nextInt();
                int pajak = mgr.goreng(3);
                int total = pilihan * pajak;
                System.out.println("Totalnya: Rp"+ total + "000");
                break;
            case 2:
                mgr.roti("Roti Tawar", 15);
                System.out.print("Berapa banyak barang yang adan inginkan: ");
                int pilihan1 = sc.nextInt();
                int pajak1 = mgr.tawar(1);
                int total1 = pilihan1 * pajak1;
                System.out.println("Totalnya: Rp"+ total1 + "000");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
            break;

        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println(" ");
        welcom();
        System.out.println(welcom1());
        showbrg();
    }

}
