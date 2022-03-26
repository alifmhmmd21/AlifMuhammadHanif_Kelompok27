package buj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class kas {

    static boolean isRunning = true;
    static InputStreamReader stream = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(stream);


    static void welcom() {
        System.out.println("Selamat Datang di Sistem 5Kasir");
    }

    static String welcom1() {
        return "Silahkan memilih barang yang tertera ";
    }

    static void showbrg() throws IOException {
        minyakgoreng mgr = new minyakgoreng();
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("========= List Bar5ang ========");
        System.out.println("[1] Minyak Goreng");
        System.out.println("[2] Roti Tawar");
        System.out.println("[3] Pasta Gigi");
        System.out.println("[4] Saos Tiram");
        System.out.println("[5] Exit");
        System.out.print("Berapa banyak barang yang dinginkan: ");
        int barang = sc.nextInt();
        int i,total,bayar=0;
        i =1;
        do{
            System.out.print("PILIH MENU> ");
            int selectedMenu = Integer.valueOf(input.readLine());

            switch (selectedMenu) {
                case 1:
                    mgr.minyak("Minyak Goreng", 24);
                    System.out.println(" ");
                    System.out.print("Berapa banyak barang yang akan inginkan: ");
                    int pilihan = sc.nextInt();
                    int pajak = mgr.goreng(3);
                    total = pilihan * pajak;
                    bayar += total;
                    System.out.println("Totalnya: Rp"+ total + "000");
                    break;
                case 2:
                    mgr.roti("Roti Tawar", 15);
                    System.out.println(" ");
                    System.out.print("Berapa banyak barang yang akan inginkan: ");
                    int pilihan1 = sc.nextInt();
                    int pajak1 = mgr.tawar(2);
                    total = pilihan1 * pajak1;
                    bayar += total;
                    System.out.println("Totalnya: Rp"+ total + "000");
                    break;
                case 3:
                    mgr.pasta("Pasta Gigi", 12);
                    System.out.println(" ");
                    System.out.print("Berapa banyak barang yang akan inginkan: ");
                    int pilihan2 = sc.nextInt();
                    int pajak2 = mgr.gigi(1);
                    total = pilihan2 * pajak2;
                    bayar += total;
                    System.out.println("Totalnya: Rp"+ total + "000");
                    break;
                case 4:
                    mgr.saos("Saos Tiram", 7);
                    System.out.println(" ");
                    System.out.print("Berapa banyak barang yang akan inginkan: ");
                    int pilihan3 = sc.nextInt();
                    int pajak3 = mgr.tiram(1);
                    total = pilihan3 * pajak3;
                    bayar += total;
                    System.out.println("Totalnya: Rp"+ total + "000");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    break;

            }

            i++;
        }while(i<=barang);
        System.out.println("");
        System.out.println("Total Seluruhnya = RP. "+bayar + "000");
    }

    public static void main(String[] args) throws IOException {
        System.out.println(" ");
        welcom();
        System.out.println(welcom1());
            showbrg();
    }
}
