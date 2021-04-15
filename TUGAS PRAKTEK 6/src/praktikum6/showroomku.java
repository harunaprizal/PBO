package praktikum6;

import java.util.Scanner;
import java.util.Stack;

public class showroomku {
    Stack<String> daftarmobil;
    showroomku(){
        daftarmobil = new Stack<String>();
    }
    public String tambahmobil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ketik nama mobil yang anda inginkan (ketik lunas bila puas) = ");
        String namamobil = scanner.nextLine();
        if(namamobil.equals("lunas")) {
            return namamobil;
        }
        this.daftarmobil.push(namamobil);
        return  namamobil;
    }
    public void hapusmobil() {
        String nasabahbermasalah = this.daftarmobil.pop();
        System.out.println(nasabahbermasalah + " dihapus dari PT.Showroomku karena cicilan kredit macet (POP)");
    }
    public void mobilbaru() {
        String nasabahbaik = this.daftarmobil.peek();
        System.out.println(nasabahbaik + " nasabah baik tapi mobil baru overkredit (PEEK)");
    }
    public void carimobil(String namamobil) {
        Integer pos = (Integer) daftarmobil.search(namamobil);
        if(pos == -1) {
            System.out.println(namamobil + " mobil mewah tapi gk sanggup bayar pajak (SEARCH)");
            return;
        }
        System.out.println(namamobil  + " mobil merakyat tapi sanggup bayar pajak (SEARCH)");
    }
    public boolean cekmobil() {
        if(this.daftarmobil.empty()) {
            System.out.println("pas service masalahnya banyak dengan pembayaran (EMPTY)");
            return false;
        }
        System.out.println(" daftar masih ada  " + this.daftarmobil.size() + " nasabah (EMPTY)");
        return true;
    }

}