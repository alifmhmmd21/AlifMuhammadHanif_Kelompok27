package buj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



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
        System.out.println(" ");
        System.out.println("========= List Barang ========");
        System.out.println("[1] Minyak Goreng");
        System.out.println("[2] ?");
        System.out.println("[3] ?");
        System.out.println("[4] ?");
        System.out.print("PILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch (selectedMenu) {
            case 1:
                mgr.minyak();
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
