package buj;

public class kasir {
    static void welcom(){
        System.out.println("Selamat Datang di Sistem Kasir");
    }
    static String welcom1(){
        return "Silahkan memilih menu yang tertera ";
    }
    public static void main(String[] args){
        System.out.println(" ");
        welcom();
        System.out.println(welcom1());
        minyakgoreng mgr = new minyakgoreng();
        mgr.minyak();

    }
}
