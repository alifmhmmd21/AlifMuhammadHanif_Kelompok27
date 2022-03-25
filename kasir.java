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

    }

    public static void main(String[] args) throws IOException {
        minyakgoreng mgr = new minyakgoreng();
        System.out.println(" ");
        welcom();
        System.out.println(welcom1());
        System.out.println(" ");
        System.out.println("========= MENU ========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[5] Exit");
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


        }
    }
}

