package praktikum6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        showroomku showroomku = new showroomku();
        while (true) {
            String namamobil = showroomku.tambahmobil();
            if(namamobil.equals("lunas")) {
                break;
            }
        }
        if(!showroomku.cekmobil()){
            return;
        }
        showroomku.mobilbaru();
        showroomku.hapusmobil();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ketik nama mobil yang anda inginkan (ketik lunas bila puas) = ");
            String namamobil = scanner.nextLine();
            if(namamobil.equals("lunas")) {
                break;
            }
            showroomku.carimobil(namamobil);
        }
    }
}
